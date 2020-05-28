package com.scut.das.system.common;

import com.scut.das.system.enums.ErrorCodeEnum;

/**
 * 通用返回对象
 * @author Chris
 */
public class CommonResult<T> {
    private int code;
    private String message;
    private T data;

    public CommonResult() {}

    public CommonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(ErrorCodeEnum.SUCCESS.code(), ErrorCodeEnum.SUCCESS.msg(), data);
    }

    /**
     * 成功返回结果为空
     *
     */
    public static <T> CommonResult<T> success() {
        return new CommonResult<T>(ErrorCodeEnum.SUCCESS.code(), ErrorCodeEnum.SUCCESS.msg(), null);
    }

    /**
     * 成功返回结果为空
     *
     */
    public static <T> CommonResult<T> success(String message) {
        return new CommonResult<T>(ErrorCodeEnum.SUCCESS.code(), message, null);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     * @param  message 提示信息
     */
    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<T>(ErrorCodeEnum.SUCCESS.code(), message, data);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     */
    public static <T> CommonResult<T> failed(ErrorCode errorCode) {
        return new CommonResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<T>(ErrorCodeEnum.FAILED.code(), message, null);
    }

    /**
     * 失败返回结果
     */
    public static <T> CommonResult<T> failed() {
        return failed(ErrorCodeEnum.FAILED);
    }

    /**
     * 失败返回结果
     * @param errorCodeEnum 错误码枚举
     */
    public static <T> CommonResult<T> failed(ErrorCodeEnum errorCodeEnum) {
        return failed(errorCodeEnum.convert());
    }

    /**
     * 未登录返回结果
     */
    public static <T> CommonResult<T> unauthorized(T data) {
        return failed(ErrorCodeEnum.UNAUTHORIZED);
    }

    /**
     * 未授权返回结果
     */
    public static <T> CommonResult<T> forbidden() {
        return failed(ErrorCodeEnum.FORBIDDEN);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
