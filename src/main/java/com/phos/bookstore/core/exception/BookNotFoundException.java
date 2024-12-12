package com.phos.bookstore.core.exception;

import com.phos.bookstore.exception.BaseException;

public class BookNotFoundException extends BaseException {

    public BookNotFoundException(String defaultGlobalCode, String defaultUserMessage) {
        super(defaultGlobalCode, defaultUserMessage);
    }
}
