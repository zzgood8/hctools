package com.zbx.auth.service.impl;

import com.zbx.auth.entity.Permission;
import com.zbx.auth.mapper.PermissionMapper;
import com.zbx.auth.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author zbx
 * @since 2022-03-25
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
