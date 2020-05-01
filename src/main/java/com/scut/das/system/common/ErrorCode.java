package com.scut.das.system.common;

import lombok.*;

/**
 * 业务异常类
 * @author Chris
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Builder
public class ErrorCode {

    /**
     * 错误
     */
    private String error;

    /**
     * http状态码
     */
    private int code;
    /**
     * 是否展示
     */
    private boolean show;
    /**
     * 错误消息
     */
    private String message;
}
