package com.company.business.auth.exception;

import com.company.business.base.exception.ServiceException;

/**
 * 未认证异常
 */
public class UnauthorizedException extends ServiceException {
    public UnauthorizedException() {
        super("Unauthorized", 401);
    }
}
