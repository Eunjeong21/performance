package com.starter.performance.exception.impl;

import com.starter.performance.exception.AbstractException;
import com.starter.performance.exception.ReviewErrorCode;
import org.springframework.http.HttpStatus;

public class NotMatchReservationAndMemberException extends AbstractException {

    @Override
    public int getStatusCode() {
        return HttpStatus.UNAUTHORIZED.value();
    }

    @Override
    public Object getData() {
        return ReviewErrorCode.NOT_MATCH_RESERVATION_AND_MEMBER_EXCEPTION;
    }
}
