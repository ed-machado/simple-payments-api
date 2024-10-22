package com.machado.payments_api.controller;

import com.machado.payments_api.exception.WalletException;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(WalletException.class)
    public ProblemDetail handleWalletException(WalletException e) {
        return e.toProblemDetail();
    }
}
