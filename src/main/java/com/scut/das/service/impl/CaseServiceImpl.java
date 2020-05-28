package com.scut.das.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.scut.das.dao.CaseDao;
import com.scut.das.entity.Case;
import com.scut.das.service.CaseService;
import org.springframework.stereotype.Service;

/**
 * @author Chris
 */
@Service
public class CaseServiceImpl extends ServiceImpl<CaseDao, Case> implements CaseService {

    @Override
    public boolean insert(Case insertCase) {
        return save(insertCase);
    }

    @Override
    public boolean update(Case newCase) {
        return saveOrUpdate(newCase);
    }
}
