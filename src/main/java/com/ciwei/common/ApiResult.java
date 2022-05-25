package com.ciwei.common;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 统一返回对象
 */
//@ApiModel("返回对象")
@Getter
@Setter
@ToString
@Builder
public class ApiResult<T> {

    //@ApiModelProperty(name = "code", value = "返回码", example = "0")
    private int code;

    //@ApiModelProperty(name = "msg", value = "返回消息", example = "SUCCESS")
    private String msg;

    //@ApiModelProperty(name = "data", value = "返回数据", example = "{}")
    private T data;

    public ApiResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 通用成功方法
     *
     * @param data 数据
     * @param <T>  类型
     * @return 对象
     */
    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<>(HttpCodeEnum.SUCCESS.getCode(), HttpCodeEnum.SUCCESS.getMsg(), data);
    }


    /**
     * 通用失败方法
     *
     * @param code 返回码
     * @param msg  返回消息
     * @param <T>  类型
     * @return 对象
     */
    public static <T> ApiResult<T> failure(int code, String msg) {
        return new ApiResult<>(code, msg, null);
    }

    /**
     * 通用失败方法
     *
     * @param httpCodeEnum 返回枚举
     * @param <T>          类型
     * @return 对象
     */
    public static <T> ApiResult<T> failure(HttpCodeEnum httpCodeEnum) {
        return new ApiResult<>(httpCodeEnum.getCode(), httpCodeEnum.getMsg(), null);
    }

    //检查用户名重复
    public static <T> ApiResult<T> unfound() {
        return new ApiResult<>(HttpCodeEnum.USER_NULL.getCode(), HttpCodeEnum.USER_NULL.getMsg(), null);
    }
}
