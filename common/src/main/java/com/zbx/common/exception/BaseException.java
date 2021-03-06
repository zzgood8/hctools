package com.zbx.common.exception;

import com.zbx.common.response.Status;
import lombok.Getter;
import lombok.ToString;

/**
 * @时间 2022/3/24
 * @作者 zbx
 * @描述
 **/
@Getter
@ToString
public class BaseException extends RuntimeException{

    private final int code;

    private final String msg;

    public BaseException(Status status) {
        super(status.getMsg());
        this.code = status.getCode();
        this.msg = status.getMsg();
    }


}
