package demo.model.bo;


import demo.model.po.RolePo;
import demo.model.vo.RoleRetVo;
import demo.model.vo.RoleSimpleRetVo;
import demo.model.vo.RoleVo;
import lombok.Data;
import com.example.model.VoObject;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 角色Bo类
 *
 * @author 24320182203281 王纬策
 * createdBy 王纬策 2020/11/04 13:57
 * modifiedBy 王纬策 2020/11/7 19:20
 **/
@Data
public class Role implements VoObject, Serializable {
    private Long id;
    private String name;
    private Long creatorId;
    private Long departId;
    private String describe;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

    public Role() {
    }

    /**
     * 构造函数
     *
     * @author 24320182203281 王纬策
     * @param po 用PO构造
     * @return Role
     * createdBy 王纬策 2020/11/04 13:57
     * modifiedBy 王纬策 2020/11/7 19:20
     */
    public Role(RolePo po) {
        this.id = po.getId();
        this.name = po.getName();
        this.creatorId = po.getCreatorId();
        this.departId = po.getDepartId();
        this.describe = po.getDescr();
        this.gmtCreate = po.getGmtCreate();
        this.gmtModified = po.getGmtModified();
    }

    /**
     * 生成RoleRetVo对象作为返回前端
     *
     * @author 24320182203281 王纬策
     * @return Object
     * createdBy 王纬策 2020/11/04 13:57
     * modifiedBy 王纬策 2020/11/7 19:20
     */
    @Override
    public Object createVo() {
        return new RoleRetVo(this);
    }

    /**
     * 生成RoleSimpleRetVo对象作为返回前端
     *
     * @author 24320182203281 王纬策
     * @return Object
     * createdBy 王纬策 2020/11/04 13:57
     * modifiedBy 王纬策 2020/11/7 19:20
     */
    @Override
    public RoleSimpleRetVo createSimpleVo() {
        return new RoleSimpleRetVo(this);
    }

    /**
     * 用vo对象创建更新po对象
     *
     * @author 24320182203281 王纬策
     * @param vo vo对象
     * @return po对象
     * createdBy 王纬策 2020/11/04 13:57
     * modifiedBy 王纬策 2020/11/7 19:20
     */
    public RolePo createUpdatePo(RoleVo vo){
        RolePo po = new RolePo();
        po.setId(this.getId());
        po.setName(vo.getName());
        po.setCreatorId(null);
        po.setDepartId(null);
        po.setDescr(vo.getDescr());
        po.setGmtCreate(null);
        po.setGmtModified(LocalDateTime.now());
        return po;
    }

    /**
     * 用bo对象创建更新po对象
     *
     * @author 24320182203281 王纬策
     * @return RolePo
     * createdBy 王纬策 2020/11/04 13:57
     * modifiedBy 王纬策 2020/11/7 19:20
     */
    public RolePo gotRolePo() {
        RolePo po = new RolePo();
        po.setId(this.getId());
        po.setName(this.getName());
        po.setCreatorId(this.getCreatorId());
        po.setDepartId(this.getDepartId());
        po.setDescr(this.getDescribe());
        po.setGmtCreate(this.getGmtCreate());
        po.setGmtModified(this.getGmtModified());
        return po;
    }
}
