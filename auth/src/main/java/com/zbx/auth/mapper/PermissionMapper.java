package com.zbx.auth.mapper;

import com.zbx.auth.entity.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author zbx
 * @since 2022-03-25
 */
@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {

}
