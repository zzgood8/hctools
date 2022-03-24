package com.zbx.common.response;

import com.zbx.common.exception.BaseException;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @时间 2022/3/24
 * @作者 zbx
 * @描述
 **/
@Data
public class Result<T> {

    private int code;

    private String msg;

    private T data;

    private Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(Status.SUCCESS.getCode(), Status.SUCCESS.getMsg(), data);
    }

    public static <T> Result<T> failed(T data) {
        return new Result<>(Status.FAILED.getCode(),Status.FAILED.getMsg(), data);
    }

}
