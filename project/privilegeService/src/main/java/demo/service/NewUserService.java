package demo.service;

import com.example.util.ResponseCode;
import com.example.util.ReturnObject;
import com.example.util.bloom.RedisBloomFilter;
import demo.Repository.NewUserRepository;
import demo.Repository.UserRepository;
import demo.model.bo.User;
import demo.model.po.NewUserPo;
import demo.model.vo.NewUserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.util.encript.AES;
import reactor.core.publisher.Mono;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

/**
 * @author chei1
 */
@Service
@Slf4j
public class NewUserService {
    @Autowired
    NewUserRepository newUserRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RedisTemplate redisTemplate;

    RedisBloomFilter bloomFilter;

    String[] fieldName;
    final String suffixName="BloomFilter";

    /**
     * 通过该参数选择是否清空布隆过滤器
     */
    private boolean reinitialize=true;


    @Transactional
    public ReturnObject register(NewUserVo vo) {
        NewUserPo userPo=new NewUserPo();
        ReturnObject returnObject;
        userPo.setEmail(AES.encrypt(vo.getEmail(), User.AESPASS));
        userPo.setMobile(AES.encrypt(vo.getMobile(),User.AESPASS));
        userPo.setUserName(vo.getUserName());
        returnObject=checkBloomFilter(userPo);
        if(returnObject!=null){
            log.debug("found duplicate in bloomFilter");
            return returnObject;
        }
        //check in user table
        if(isEmailExist(userPo.getEmail())){
            setBloomFilterByName("email",userPo);
            return new ReturnObject(ResponseCode.EMAIL_REGISTERED);
        }
        if(isMobileExist(userPo.getMobile())){
            setBloomFilterByName("mobile",userPo);
            return  new ReturnObject(ResponseCode.MOBILE_REGISTERED);
        }
        if(isUserNameExist(userPo.getUserName())){
            setBloomFilterByName("userName",userPo);
            return  new ReturnObject(ResponseCode.USER_NAME_REGISTERED);
        }


        userPo.setPassword(AES.encrypt(vo.getPassword(), User.AESPASS));
        userPo.setAvatar(vo.getAvatar());
        userPo.setName(AES.encrypt(vo.getName(), User.AESPASS));
        userPo.setDepartId(vo.getDepartId());
        userPo.setOpenId(vo.getOpenId());
        userPo.setGmtCreate(LocalDateTime.now());
        try{
            returnObject=new ReturnObject<>(newUserRepository.save(userPo));
            log.debug("success trying to insert newUser");
        }
        catch (DuplicateKeyException e){
            log.debug("failed trying to insert newUser");
            String info=e.getMessage();
            if(info.contains("user_name_uindex")){
                setBloomFilterByName("userName",userPo);
                return  new ReturnObject(ResponseCode.USER_NAME_REGISTERED);
            }
            if(info.contains("email_uindex")){
                setBloomFilterByName("email",userPo);
                return  new ReturnObject(ResponseCode.EMAIL_REGISTERED);
            }
            if(info.contains("mobile_uindex")){
                setBloomFilterByName("mobile",userPo);
                return  new ReturnObject(ResponseCode.MOBILE_REGISTERED);
            }

        }
        catch (Exception e){
            log.error("Internal error Happened:"+e.getMessage());
            return  new ReturnObject(ResponseCode.INTERNAL_SERVER_ERR);
        }
        return  returnObject;
    }

    /**
     *
     * @param po
     * @return ReturnObject 错误返回对象
     */
    public ReturnObject checkBloomFilter(NewUserPo po){
        if(bloomFilter.includeByBloomFilter("email"+suffixName,po.getEmail())){
            return new ReturnObject(ResponseCode.EMAIL_REGISTERED);
        }
        if(bloomFilter.includeByBloomFilter("mobile"+suffixName,po.getMobile())){
            return new ReturnObject(ResponseCode.MOBILE_REGISTERED);
        }
        if(bloomFilter.includeByBloomFilter("userName"+suffixName,po.getUserName())){
            return new ReturnObject(ResponseCode.USER_NAME_REGISTERED);
        }
        return null;

    }

    /**
     * 由属性名及属性值设置相应布隆过滤器
     * @param name 属性名
     * @param po po对象
     */
    public void setBloomFilterByName(String name,NewUserPo po) {
        try {
            Field field = NewUserPo.class.getDeclaredField(name);
            Method method=po.getClass().getMethod("get"+name.substring(0,1).toUpperCase()+name.substring(1));
            log.debug("add value "+method.invoke(po)+" to "+field.getName()+suffixName);
            bloomFilter.addByBloomFilter(field.getName()+suffixName,method.invoke(po));
        }
        catch (Exception ex){
            log.error("Exception happened:"+ex.getMessage());
        }
    }

    /**
     * 检查用户名重复
     * @param userName 需要检查的用户名
     * @return boolean
     */
    public boolean isUserNameExist(String userName){
        log.debug("is checking userName in user table");
        if(userRepository.findByUserName(userName).block()!=null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 检查邮箱重复
     * @param email
     * @return boolean
     */
    public boolean isEmailExist(String email){
        log.debug("is checking email in user table");
        if(userRepository.findByEmail(email).block()!=null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 检查电话重复
     * @param mobile 电话号码
     * @return boolean
     */
    public boolean isMobileExist(String mobile){
        log.debug("is checking mobile in user table");
        if(userRepository.findByMobile(mobile).block()!=null) {
            return true;
        } else {
            return false;
        }
    }

}