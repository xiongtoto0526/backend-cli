package com.company.business.fight.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.company.business.fight.entity.SysProject;
import com.company.business.fight.service.ISysProjectService;
import com.company.business.base.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author xmaster
 * @since 2019-07-14
 */
@RestController
@RequestMapping("/fight/sys-project")
public class SysProjectController {

    @Autowired
    ISysProjectService sysProjectService;

    /**
     * 按名称查询项目
     */
    @GetMapping("/list")
    public Result get(@RequestParam String name) {
        SysProject result = sysProjectService.getOne((new QueryWrapper<SysProject>().select("*").eq("name", name)));
        return new Result().success(result);
    }

    /**
     * 新增一个项目
     */
    @PostMapping("/insert")
    public Result get(@RequestBody SysProject sysProject) {
        boolean isSuccess = sysProjectService.save(sysProject);
        if (isSuccess) {
            return new Result().success(sysProject);
        } else {
            return new Result().fail("插入失败", 500);
        }
    }

    /**
     * 更新项目
     */
    @PostMapping("/update")
    public Result update(@RequestBody SysProject sysProject) {
        QueryWrapper<SysProject> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", "projectB");
        boolean isSuccess = sysProjectService.update(sysProject, queryWrapper);
        if (isSuccess) {
            return new Result().success(isSuccess);
        } else {
            return new Result().fail("更新失败", 500);
        }
    }

    /**
     * 更新项目
     */
    @PostMapping("/delete")
    public Result delete( @RequestBody SysProject sysProject) {

        boolean isSuccess = sysProjectService.delete(sysProject) >= 0;
        if (isSuccess) {
            return new Result().success(isSuccess);
        } else {
            return new Result().fail("更新失败", 500);
        }
    }

}
