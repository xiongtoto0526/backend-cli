package com.company.business.auth.exception;

/**
 * Token异常
 */
public class TokenException extends RuntimeException {
    public TokenException() {
        super("False token");
    }
}
