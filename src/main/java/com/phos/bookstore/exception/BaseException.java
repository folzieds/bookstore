package com.phos.bookstore.exception;

import lombok.Getter;

@Getter
public abstract class BaseException extends RuntimeException {

    private final String defaultGlobalCode;
    private final String defaultUserMessage;

    protected BaseException( String defaultGlobalCode, String defaultUserMessage) {
        super(defaultUserMessage);
        this.defaultGlobalCode = defaultGlobalCode;
        this.defaultUserMessage = defaultUserMessage;
    }


}
