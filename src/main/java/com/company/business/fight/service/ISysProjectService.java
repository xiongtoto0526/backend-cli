package com.company.business.fight.service;

import com.company.business.fight.entity.SysProject;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xmaster
 * @since 2019-07-14
 */
public interface ISysProjectService extends IService<SysProject> {

    int delete(SysProject sysProject);

}
