package com.uni.api.basic.syspermissionrole.entity;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
/**
 * <p>
 * SysPermissionRole对象
 * </p>
 *
 * @author LuoYang
 * @since 2019-08-14
 */
@TableName("sys_permission_role")
public class SysPermissionRoleEntity extends Model<SysPermissionRoleEntity> {

    private static final long serialVersionUID = 1L;


                /**
                 * 角色资源关联Id
                 */
                            @TableId(value = "id", type = IdType.AUTO)
                private Integer id;

                /**
                 * 角色id
                 */
    @TableField("role_id")
        private Integer roleId;

                /**
                 * 资源id
                 */
    @TableField("permission_id")
        private Integer permissionId;


        public Integer getId() {
        return id;
    }

            public void setId(Integer id) {
        this.id = id;
    }

        public Integer getRoleId() {
        return roleId;
    }

            public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

        public Integer getPermissionId() {
        return permissionId;
    }

            public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
}

    @Override
    public String toString() {
    return "SysPermissionRole{" +
                    "id=" + id +
                    ", roleId=" + roleId +
                    ", permissionId=" + permissionId +
            "}";
}
}