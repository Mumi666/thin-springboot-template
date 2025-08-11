package org.mumi.weblog.common.utils;

import lombok.Data;
import org.mumi.weblog.common.exception.BaseExceptionInterface;
import org.mumi.weblog.common.exception.BizException;

import java.io.Serializable;

@Data
public class Response<T> implements Serializable {

    private boolean success = true ;

    private String message ;

    private String errorCode ;

    private T data ;

    public static <T> Response<T> success(T data) {
        Response<T> response = new Response<>();
        response.setData(data);
        return response;
    }

    public static <T> Response<T> success() {
        return new Response<T>();
    }

    public static <T> Response<T> fail(String errorCode, String message) {
        Response<T> response = new Response<T>();
        response.setSuccess(false);
        response.setErrorCode(errorCode);
        response.setMessage(message);
        return response;
    }

    public static <T> Response<T> fail(BaseExceptionInterface baseExceptionInterface) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrorCode(baseExceptionInterface.getErrorCode());
        response.setMessage(baseExceptionInterface.getErrorMessage());
        return response;
    }


    public static <T> Response<T> fail(BizException bizException) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setErrorCode(bizException.getErrorCode());
        response.setMessage(bizException.getErrorMessage());
        return response;
    }

    public static <T> Response<T> fail(String message) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setMessage(message);
        return response;
    }

    public static <T> Response<T> fail() {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        return response;
    }
}
