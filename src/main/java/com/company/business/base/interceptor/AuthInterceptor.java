package com.company.business.base.interceptor;

import com.company.business.auth.enums.TokenSubject;
import com.company.business.auth.exception.AuthException;
import com.company.business.auth.exception.TokenException;
import com.company.business.auth.exception.UnauthorizedException;
import com.company.business.auth.service.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class AuthInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(AuthInterceptor.class);

    @Autowired
    TokenService tokenService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 从Header取出AccessToken
        String token = request.getHeader("Access-Token");
        // 判断Token是否为空
        if (token != null && token != "") {
            try {
                // 从Token中获取Id并捕获异常
                Object result = tokenService.parse(TokenSubject.ACCESS, token).getBody().get("id");
            } catch (TokenException e) {
                // Token失效，抛出认证异常
                throw new AuthException();
            }
        } else {
            // Token不能为空，抛出未登录异常
            throw new UnauthorizedException();
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }


    private void setNoAccessRightInfo(HttpServletResponse response) throws IOException {
//            response.setCharacterEncoding("UTF-8");
//            response.setContentType("application/json; charset=utf-8");
//
//            JSONObject returnJson = new JSONObject();
//            returnJson.put("code", 401);
//            returnJson.put("message", "您没有访问权限，即将跳转");
//            returnJson.put("description", "您没有访问权限，即将跳转");
//
//            PrintWriter out = response.getWriter();
//            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//            out.append(returnJson.toJSONString());
//            out.flush();
//            out.close();
    }
}
