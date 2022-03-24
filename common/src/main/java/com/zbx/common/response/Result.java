package com.zbx.common.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @时间 2022/3/24
 * @作者 zbx
 * @描述
 **/
@Data
@AllArgsConstructor
public class Result<T> {

    private String code;

    private String msg;

    private T data;

}
