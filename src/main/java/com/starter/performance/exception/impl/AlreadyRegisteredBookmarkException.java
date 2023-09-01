package com.starter.performance.exception.impl;

import com.starter.performance.exception.AbstractException;
import com.starter.performance.exception.BookmarkErrorCode;
import com.starter.performance.exception.ErrorData;
import org.springframework.http.HttpStatus;

public class AlreadyRegisteredBookmarkException extends AbstractException {

    @Override
    public int getStatusCode() {
        return HttpStatus.BAD_REQUEST.value();
    }

    @Override
    public Object getData() {
        return new ErrorData(BookmarkErrorCode.ALREADY_REGISTERED_BOOKMARK_EXCEPTION.name());
    }
}
