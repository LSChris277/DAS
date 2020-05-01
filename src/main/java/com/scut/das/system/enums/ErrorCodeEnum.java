package com.scut.das.system.enums;

import com.scut.das.system.common.ErrorCode;

import javax.servlet.http.HttpServletResponse;

/**
 * 业务异常枚举类
 * @author Chris
 */

public enum ErrorCodeEnum {
    /**
     * 200
     */
    SUCCESS(HttpServletResponse.SC_OK, true, "操作成功"),
    /**
     * 500
     */
    FAILED(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, true, "操作失败"),
    /**
     * 400
     */
    BAD_REQUEST(HttpServletResponse.SC_BAD_REQUEST, true, "请求参数错误或不完整"),
    /**
     * JSON格式错误
     */
    JSON_FORMAT_ERROR(HttpServletResponse.SC_BAD_REQUEST, true, "JSON格式错误"),
    /**
     * 401
     */
    UNAUTHORIZED(HttpServletResponse.SC_UNAUTHORIZED, true, "请先进行认证"),
    /**
     * 403
     */
    FORBIDDEN(HttpServletResponse.SC_FORBIDDEN, true, "无权查看"),
    //----------------------------------------------------业务异常----------------------------------------------------
    /**
     * 用户名密码错误
     */
    USERNAME_OR_PASSWORD_IS_WRONG(HttpServletResponse.SC_BAD_REQUEST, true, "用户名密码错误");

    private final int code;
    private final boolean show;
    private final String message;

    ErrorCodeEnum(int code, boolean show, String message) {
        this.code = code;
        this.show = show;
        this.message = message;
    }

    /**
     * 转化为ErrorCode（自定义返回消息）
     * @param msg
     * @return
     */
    public ErrorCode convert(String msg) {
        return ErrorCode.builder().code(code()).show(show()).message(msg).error(name()).build();
    }

    /**
     * 转化为ErrorCode
     * @return
     */
    public ErrorCode convert() {
        return ErrorCode.builder().code(code()).show(show()).message(msg()).error(name()).build();
    }


    public int code() {
        return this.code;
    }

    public String msg() {
        return this.message;
    }

    public boolean show() {
        return this.show;
    }
}
