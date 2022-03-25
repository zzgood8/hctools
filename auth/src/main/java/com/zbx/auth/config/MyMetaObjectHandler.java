package com.zbx.auth.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.time.LocalDateTime;

/**
 * @时间 2022/3/25
 * @作者 zbx
 * @描述 mybatis-plus自动填充字段
 **/
@Configuration
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "create_time", LocalDateTime.class, LocalDateTime.now());
        this.strictInsertFill(metaObject, "create_by",String.class, SecurityContextHolder.getContext().getAuthentication().getName());

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "update_time", LocalDateTime.class, LocalDateTime.now());
        this.strictUpdateFill(metaObject, "update_by", String.class, SecurityContextHolder.getContext().getAuthentication().getName());

    }
}
