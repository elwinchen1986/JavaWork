package com.xingyuan.springboot.entity.bo;


import org.springframework.http.HttpStatus;

/**
 * 接口响应结果
 *
 * @author sunyq
 */
public class ResponseResult<T> {
    private boolean isSuccess;
    private Integer statusCode;
    private String message;
    private T data;

    public ResponseResult() {
        this(null);
    }

    public ResponseResult(T data) {
        this(true, HttpStatus.OK.value(), data);
    }

    public ResponseResult(boolean isSuccess, Integer statusCode, T data) {
        this.isSuccess = isSuccess;
        this.statusCode = statusCode;
        this.data = data;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public ResponseResult<T> setSuccess(boolean success) {
        isSuccess = success;
        return this;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public ResponseResult setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseResult<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResponseResult<T> setData(T data) {
        this.data = data;
        return this;
    }

}
