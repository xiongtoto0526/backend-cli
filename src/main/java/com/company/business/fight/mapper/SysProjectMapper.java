package com.company.business.fight.mapper;

import com.company.business.fight.entity.SysProject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author xmaster
 * @since 2019-07-14
 */
public interface SysProjectMapper extends BaseMapper<SysProject> {

    int delete(SysProject sysProject);
}
