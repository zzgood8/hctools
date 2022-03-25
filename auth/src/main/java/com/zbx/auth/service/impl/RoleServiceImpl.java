package com.zbx.auth.service.impl;

import com.zbx.auth.entity.Role;
import com.zbx.auth.mapper.RoleMapper;
import com.zbx.auth.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author zbx
 * @since 2022-03-25
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
