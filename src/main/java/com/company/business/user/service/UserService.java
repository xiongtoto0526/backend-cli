package com.company.business.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.company.business.user.entity.User;
import com.company.business.user.view.SignInView;
import com.company.business.user.data.SignInData;
import com.company.business.user.data.SignUpData;

public interface UserService extends IService<User> {

    SignInView signIn(SignInData data);

    void signUp(SignUpData data);
}
