package com.scut.das.controller;

import com.scut.das.entity.Case;
import com.scut.das.service.CaseService;
import com.scut.das.system.common.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 案例管理类
 *
 * @author Chris
 */
@RestController
@RequestMapping("/case")
public class CaseController {
    @Autowired
    CaseService caseService;

    @PostMapping("/submit")
    public CommonResult submit(@RequestBody Case submitCase) {
        boolean isInsert = caseService.insert(submitCase);
        if (isInsert) {
            return CommonResult.success("提交成功");
        }
        return CommonResult.failed("提交失败");
    }

    @PostMapping("/modify")
    public CommonResult modify(@RequestBody Case newCase) {
        boolean isUpdate = caseService.update(newCase);
        if (isUpdate) {
            return CommonResult.success("修改成功");
        }
        return CommonResult.failed("修改失败");
    }
}
