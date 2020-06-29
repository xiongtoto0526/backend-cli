package com.company.business.dami.controller;


import com.company.business.dami.service.IDmRecordService;
import com.company.business.auth.annotation.Auth;
import com.company.business.base.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shanshui
 * @since 2020-06-29
 */
@RestController
@RequestMapping("/dami/dm-record")
public class DmRecordController {

    @Autowired
    IDmRecordService dmRecordService;
    /**
     * 查看列表
     */
    @GetMapping("/list")
    public Result list(@Auth Integer userId) {
        // 该接口需要检测用户是否登录
        return new Result().success(dmRecordService.list());
    }
}
