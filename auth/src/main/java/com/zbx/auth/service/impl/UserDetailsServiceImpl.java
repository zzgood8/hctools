package com.zbx.auth.service.impl;

import com.zbx.auth.entity.Permission;
import com.zbx.auth.entity.Role;
import com.zbx.auth.entity.User;
import com.zbx.auth.service.IRoleService;
import com.zbx.auth.service.IUserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @时间 2022/3/25
 * @作者 zbx
 * @描述
 **/
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final IUserService userService;

    public UserDetailsServiceImpl(IUserService userService, IRoleService roleService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // 获取用户基本信息
        User user = userService.getUserByUsername(username);
        if (Objects.isNull(user)) {
            throw new UsernameNotFoundException("用户存在");
        }

        org.springframework.security.core.userdetails.User.UserBuilder builder = org.springframework.security.core.userdetails.User.builder();
        builder.username(user.getUsername()).password(user.getPassword());

        // 获取用户角色
        List<Role> roles = userService.getRoleListByUserId(user.getId());
        if (roles.size() != 0) {
            List<String> list = roles.stream().map(Role::getName).collect(Collectors.toList());
            builder.roles(list.toArray(new String[roles.size()]));
        }

        // 获取角色权限
        List<Permission> permissions = userService.getPermissionListByUserId(user.getId());
        if (permissions.size() != 0) {
            List<String> list = permissions.stream().map(Permission::getName).collect(Collectors.toList());
            builder.roles(list.toArray(new String[roles.size()]));
        }

        // 生成用户认证信息
        return builder.build();

    }

}
