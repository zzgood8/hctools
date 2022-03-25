package com.zbx.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

/**
 * @时间 2022/3/25
 * @作者 zbx
 * @描述
 **/
@Configuration
public class WebSecurityConfig {

    public UserDetailsService userDetailsService() {
        return new JdbcUserDetailsManager();
    }
}
