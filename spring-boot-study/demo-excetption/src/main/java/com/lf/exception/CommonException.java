package com.lf.exception;

import com.lf.enums.ErrorMessageEnum;

/**
 * @Author linfan
 * @Date 2020/12/13 21:53
 * @Version 1.0
 */
public class CommonException extends RuntimeException {
    public CommonException(ErrorMessageEnum rpcErrorMessageEnum, String detail) {
        super(rpcErrorMessageEnum.getMessage() + ":" + detail);
    }

    public CommonException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommonException(ErrorMessageEnum rpcErrorMessageEnum) {
        super(rpcErrorMessageEnum.getMessage());
    }
}
