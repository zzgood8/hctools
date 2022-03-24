package com.zbx.common.response;

import lombok.Getter;

/**
 * @时间 2022/3/24
 * @作者 zbx
 * @描述
 **/
@Getter
public enum Status {

    SUCCESS(200,"OK"),
    FAILED(400,"客户端错误"),
    ERROR(500,"服务器错误");

    private final int code;
    private final String msg;

    Status(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
