package com.rafaelhosaka.gateway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private String message;
    private ErrorCode errorCode;

    public Response(String message){
        setMessage(message);
        setErrorCode(ErrorCode.DEFAULT);
    }
}
