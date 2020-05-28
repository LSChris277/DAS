package com.scut.das.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.scut.das.entity.Case;

/**
 * 案例表（Case）服务接口
 *
 * @author Chris
 */
public interface CaseService extends IService<Case> {
    /**
     * 插入一条Case
     *
     * @param insertCase
     * @return case_id 案例id
     */
    public boolean insert(Case insertCase);

    /**
     * 更新一条Case
     *
     * @param newCase
     * @return
     */
    public boolean update(Case newCase);
}
