package com.zbx.auth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zbx.auth.entity.Permission;
import com.zbx.auth.entity.Role;
import com.zbx.auth.entity.User;
import com.zbx.auth.mapper.UserMapper;
import com.zbx.auth.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author zbx
 * @since 2022-03-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public User getUserByUsername(String username) {
        return baseMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getUsername,username));
    }

    @Override
    public List<Role> getRoleListByUserId(Integer userId) {
        return baseMapper.selectRoleByUserId(userId);
    }

    @Override
    public List<Permission> getPermissionListByUserId(Integer userId) {
        return null;
    }

}
