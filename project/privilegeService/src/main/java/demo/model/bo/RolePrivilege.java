package demo.model.bo;

import com.example.model.VoObject;

import demo.model.po.PrivilegePo;
import demo.model.po.RolePo;
import demo.model.po.UserPo;
import demo.model.vo.RolePrivilegeRetVo;
import lombok.Data;

/**
 * 角色权限
 * @author wc 24320182203277
 * @date
 **/

@Data
public class RolePrivilege implements VoObject {
    private Long id= null;
    private RolePo role = new RolePo();
    private PrivilegePo privilege = new PrivilegePo();
    private UserPo creator = new UserPo();
    private String gmtModified = null;
    @Override
    public RolePrivilegeRetVo createVo() {
        return new RolePrivilegeRetVo(this);
    }

    @Override
    public Object createSimpleVo() {
        return new RolePrivilegeRetVo(this);
    }
}
