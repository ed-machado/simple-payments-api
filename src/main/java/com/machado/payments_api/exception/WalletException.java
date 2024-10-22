package com.machado.payments_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class WalletException extends RuntimeException {

    public ProblemDetail toProblemDetail() {
        var problem = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        problem.setTitle("Wallet Exception");
        return problem;
    }
}
