package com.uni.api.basic.user.entity;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
/**
 * <p>
 * User对象
 * </p>
 *
 * @author LuoYang
 * @since 2019-08-14
 */
@TableName("user")
public class UserEntity extends Model<UserEntity> {

    private static final long serialVersionUID = 1L;


                /**
                 * 用户主键
                 */
                    @TableId("user_id")
                private String userId;

    @TableField("name")
        private String name;

    @TableField("age")
        private String age;

    @TableField("sex")
        private String sex;


        public String getUserId() {
        return userId;
    }

            public void setUserId(String userId) {
        this.userId = userId;
    }

        public String getName() {
        return name;
    }

            public void setName(String name) {
        this.name = name;
    }

        public String getAge() {
        return age;
    }

            public void setAge(String age) {
        this.age = age;
    }

        public String getSex() {
        return sex;
    }

            public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
}

    @Override
    public String toString() {
    return "User{" +
                    "userId=" + userId +
                    ", name=" + name +
                    ", age=" + age +
                    ", sex=" + sex +
            "}";
}
}