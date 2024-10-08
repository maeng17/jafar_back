package com.jafar.api.common.response;

public record ApiResponse<T>(
        String resultCode,
        String msg,
        T data)
{ }
