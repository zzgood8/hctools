package com.zbx.auth.mapper;

import com.zbx.auth.entity.Permission;
import com.zbx.auth.entity.Role;
import com.zbx.auth.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author zbx
 * @since 2022-03-25
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<Role> selectRoleByUserId(Integer userId);

    List<Permission> selectPermissionByUserId(Integer userId);

}
