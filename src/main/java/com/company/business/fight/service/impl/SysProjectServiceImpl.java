package com.company.business.fight.service.impl;

import com.company.business.fight.mapper.SysProjectMapper;
import com.company.business.fight.service.ISysProjectService;
import com.company.business.fight.entity.SysProject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xmaster
 * @since 2019-07-14
 */
@Service
public class SysProjectServiceImpl extends ServiceImpl<SysProjectMapper, SysProject> implements ISysProjectService {

    @Autowired
    SysProjectMapper sysProjectMapper;

    @Override
    public int delete(SysProject sysProject) {
        return sysProjectMapper.delete(sysProject);
    }
}
