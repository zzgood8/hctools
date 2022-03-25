package com.zbx.auth.service;

import com.zbx.auth.entity.Permission;
import com.zbx.auth.entity.Role;
import com.zbx.auth.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author zbx
 * @since 2022-03-25
 */
public interface IUserService extends IService<User> {

    User getUserByUsername(String username);

    List<Role> getRoleListByUserId(Integer userId);

    List<Permission> getPermissionListByUserId(Integer userId);
}
