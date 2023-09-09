package com.starter.performance.exception.impl;

import com.starter.performance.exception.AbstractException;
import com.starter.performance.exception.AuthErrorCode;
import com.starter.performance.exception.ErrorData;
import org.springframework.http.HttpStatus;

public class DuplicatedNicknameException extends AbstractException {

    @Override
    public int getStatusCode() {
        return HttpStatus.CONFLICT.value();
    }

    @Override
    public ErrorData getData() {
        return new ErrorData(AuthErrorCode.NICKNAME_IS_DUPLICATED_EXCEPTION.name());
    }
}
