package com.company.business.auth.exception;

import com.company.business.base.exception.ServiceException;

/**
 * 认证异常
 *
 */
public class AuthException extends ServiceException {
    public AuthException() {
        super("Authentication failed", 403);
    }
}
