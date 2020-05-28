package com.scut.das.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;
import java.io.Serializable;

/**
 * 案例表(Case)实体类
 *
 * @author Chris
 * @since 2020-05-07 10:42:21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
// 当数据库表名和实体类名不一致时，使用该注解绑定
@TableName("`case`")
public class Case implements Serializable {
    private static final long serialVersionUID = -21629920438050623L;
    /**
    * 主键
    */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;
    /**
    * 报告单位
    */
    private String reportInstitutions;
    /**
    * 身份证号
    */
    private String idNumber;
    /**
    * 姓名
    */
    private String name;
    /**
    * 联系方式
    */
    private String phoneNumber;
    /**
    * 年龄
    */
    private Integer age;
    /**
    * 性别
    */
    private String sex;
    /**
    * 职业
    */
    private String profession;
    /**
    * 国家
    */
    private String nation;
    /**
    * 当前所在地
    */
    private String currentLocation;
    /**
    * 近期一个月旅居史
    */
    private String travelHistory;
    /**
    * 工作单位
    */
    private String workInstitutions;
    /**
    * 情况：1，确诊患者。2，疑似患者。3，无症状感染者。4，密切接触者。5，健康但需要隔离者。6，健康且不需要隔离者。7，已康复。
    */
    private Integer situation;
    /**
    * 确诊日期
    */
    private Date confirmDate;
    /**
    * 病重等级：1，轻症。2，重症。3，死亡。
    */
    private Integer level;
    /**
    * 死亡日期
    */
    private Date deathDate;

}