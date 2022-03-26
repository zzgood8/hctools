package com.zbx.auth.controller;

import com.zbx.common.response.Result;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @日期 2022/3/26
 * @作者 zbx
 * @描述
 */
@RestController
public class TestController {

    @GetMapping("/who")
    public Result<String> getCurrentUser() {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        return Result.success(name);
    }
}
