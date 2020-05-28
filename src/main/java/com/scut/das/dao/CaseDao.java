package com.scut.das.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scut.das.entity.Case;
import org.apache.ibatis.annotations.Mapper;

/**
 * 案例表(Case)表数据库访问层
 *
 * @author Chris
 * @since 2020-05-7 09:39:55
 */
@Mapper
public interface CaseDao extends BaseMapper<Case> {
}
