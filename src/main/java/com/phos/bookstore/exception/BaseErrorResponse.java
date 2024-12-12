package com.phos.bookstore.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BaseErrorResponse {

    private String defaultGlobalCode;
    private String defaultUserMessage;
}
