package com.ciwei.common;

import lombok.Getter;
import lombok.ToString;

/**
 * http请求code
 *
 * @author haowei
 */
@ToString
@Getter
public enum HttpCodeEnum {

    /**
     * 成功
     */
    SUCCESS(20000, "SUCCESS"),

    /**
     * 失败
     */
    fail(20001, "SERVER ERROR"),

    /**
     * 参数异常
     */
    PARAM_ERR(-1, "PARAM ERROR"),

    /**
     * 用户不存在
     */
    USER_NULL(-2, "USER NOT EXISTS"),

    /**
     * 密码错误
     */
    INVALID_PWD(-3, "INVALID PASSWORD");


    private final int code;
    private final String msg;

    HttpCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
