package com.zbx.auth.mapper;

import com.zbx.auth.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author zbx
 * @since 2022-03-25
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

}
