package com.company.business.user.exception;

import com.company.business.base.exception.ServiceException;

public class PasswordErrorException extends ServiceException {
    public PasswordErrorException() {
        super(10400, "密码错误");
    }
}