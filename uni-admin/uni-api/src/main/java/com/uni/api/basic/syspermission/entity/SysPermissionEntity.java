package com.uni.api.basic.syspermission.entity;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
/**
 * <p>
 * SysPermission对象
 * </p>
 *
 * @author LuoYang
 * @since 2019-08-14
 */
@TableName("sys_permission")
public class SysPermissionEntity extends Model<SysPermissionEntity> {

    private static final long serialVersionUID = 1L;


                /**
                 * 资源id
                 */
                    @TableId("id")
                private Integer id;

                /**
                 * 资源名称
                 */
    @TableField("name")
        private String name;

                /**
                 * 资源描述
                 */
    @TableField("descritpion")
        private String descritpion;

                /**
                 * 组体路径
                 */
    @TableField("url")
        private String url;

                /**
                 * 父节点id
                 */
    @TableField("pid")
        private Integer pid;


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

        public String getDescritpion() {
        return descritpion;
    }

            public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }

        public String getUrl() {
        return url;
    }

            public void setUrl(String url) {
        this.url = url;
    }

        public Integer getPid() {
        return pid;
    }

            public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
}

    @Override
    public String toString() {
    return "SysPermission{" +
                    "id=" + id +
                    ", name=" + name +
                    ", descritpion=" + descritpion +
                    ", url=" + url +
                    ", pid=" + pid +
            "}";
}
}