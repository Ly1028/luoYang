package com.uni.api.config;

import com.uni.api.basic.springsecurity.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author LuoYang
 * @program: uniApi
 * @description: springSecurity配置
 * @EnableWebSecurity 支持SpringSecurity的Web安全支持，并提供SpringMVC集成
 * @return
 * @date 2019/8/8 14:25
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    CustomUserDetailsService customUserDetailsService;

    /**
     * 这个configure(HttpSecurity)方法定义应该保护哪些URL路径，哪些不应该保护。具体来说，“/”和“/home”路径被配置为不需要任何身份验证。必须对所有其他路径进行身份验证。
     * 当用户成功登录时，它们将被重定向到先前请求的需要身份验证的页面。指定的自定义“/登录”页面。loginPage()，每个人都可以看到它。
     * 至于userDetailsService()方法，它使用单个用户设置内存中的用户存储.该用户的用户名为“user”，密码为“Password”，角色为“user”
     *
     * @param
     * @return
     * @author LuoYang
     * @date 2019/8/8 14:27
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                //用户权限
                .antMatchers("/user/**").hasRole("USER")
                //管理员权限
                .antMatchers("/userTwo/**").hasRole("ADMIN")
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    //    @Bean
//    @Override
//    public UserDetailsService userDetailsService() {
//        UserDetails user =
//                User.withDefaultPasswordEncoder()
//                        .username("user")
//                        .password("password")
//                        .roles("USER")
//                        .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //inMemoryAuthentication 从内存中获取
//        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("user1").password(new BCryptPasswordEncoder().encode("123456")).roles("USER").and().
//                passwordEncoder(new BCryptPasswordEncoder()).withUser("user2").password(new BCryptPasswordEncoder().encode("123456")).roles("ADMIN");
//    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 设置自定义的userDetailsService
        auth.userDetailsService(customUserDetailsService)
                .passwordEncoder(passwordEncoder());
 /*auth
 .inMemoryAuthentication()
 .withUser("admin1")
 .password("admin1")
 .roles("ADMIN", "USER")
 .and()
 .withUser("user1").password("user1")
 .roles("USER");*/
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}