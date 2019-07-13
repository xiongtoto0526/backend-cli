package com.company.business.auth.exception;

import com.company.business.base.exception.ServiceException;

/**
 * 未认证异常
 *
 * @author Li Jinhui
 * @since 2018/12/7
 */
public class UnauthorizedException extends ServiceException {
    public UnauthorizedException() {
        super("Unauthorized", 401);
    }
}
