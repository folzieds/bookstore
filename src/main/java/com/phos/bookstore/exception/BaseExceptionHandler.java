package com.phos.bookstore.exception;

import com.phos.bookstore.core.exception.BookNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(BookNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public BaseErrorResponse handleGuestNotFoundException(BookNotFoundException ex){
        return new BaseErrorResponse(ex.getDefaultGlobalCode(), ex.getDefaultUserMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public BaseErrorResponse handleBaseException(Exception ex){
        return new BaseErrorResponse(ex.getMessage(), ex.getLocalizedMessage());
    }
}
