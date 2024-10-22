package com.machado.payments_api.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

@AllArgsConstructor
public class WalletAlreadyExistsException extends WalletException {

    private String detail;

    @Override
    public ProblemDetail toProblemDetail() {
        var problem = ProblemDetail.forStatus(HttpStatus.UNPROCESSABLE_ENTITY);
        problem.setDetail("Wallet already exists");
        problem.setDetail(detail);
        return super.toProblemDetail();
    }
}
