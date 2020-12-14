package com.lf.enums;

/**
 * @Author linfan
 * @Date 2020/12/13 21:14
 * @Version 1.0
 */
public enum CommonEnumResult {
    SUCCESS(200, "The remote call is successful"),
    FAIL(500, "The remote call is fail");
    private final int code;

    private final String message;

    CommonEnumResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "CommonEnumResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
