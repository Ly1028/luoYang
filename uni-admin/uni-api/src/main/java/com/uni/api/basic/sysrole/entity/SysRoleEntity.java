package com.uni.api.basic.sysrole.entity;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
/**
 * <p>
 * SysRole对象
 * </p>
 *
 * @author LuoYang
 * @since 2019-08-14
 */
@TableName("sys_role")
public class SysRoleEntity extends Model<SysRoleEntity> {

    private static final long serialVersionUID = 1L;


                /**
                 * 角色id
                 */
                    @TableId("id")
                private Integer id;

                /**
                 * 角色名
                 */
    @TableField("name")
        private String name;


        public Integer getId() {
        return id;
    }

            public void setId(Integer id) {
        this.id = id;
    }

        public String getName() {
        return name;
    }

            public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
}

    @Override
    public String toString() {
    return "SysRole{" +
                    "id=" + id +
                    ", name=" + name +
            "}";
}
}