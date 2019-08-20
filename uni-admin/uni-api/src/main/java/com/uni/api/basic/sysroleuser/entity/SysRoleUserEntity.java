package com.uni.api.basic.sysroleuser.entity;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
/**
 * <p>
 * SysRoleUser对象
 * </p>
 *
 * @author LuoYang
 * @since 2019-08-14
 */
@TableName("sys_role_user")
public class SysRoleUserEntity extends Model<SysRoleUserEntity> {

    private static final long serialVersionUID = 1L;


                /**
                 * 用户角色关联id
                 */
                            @TableId(value = "id", type = IdType.AUTO)
                private Integer id;

                /**
                 * 用户id
                 */
    @TableField("sys_user_id")
        private Integer sysUserId;

                /**
                 * 角色id
                 */
    @TableField("sys_role_id")
        private Integer sysRoleId;


        public Integer getId() {
        return id;
    }

            public void setId(Integer id) {
        this.id = id;
    }

        public Integer getSysUserId() {
        return sysUserId;
    }

            public void setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
    }

        public Integer getSysRoleId() {
        return sysRoleId;
    }

            public void setSysRoleId(Integer sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
}

    @Override
    public String toString() {
    return "SysRoleUser{" +
                    "id=" + id +
                    ", sysUserId=" + sysUserId +
                    ", sysRoleId=" + sysRoleId +
            "}";
}
}