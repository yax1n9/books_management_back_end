package com.zyl.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zyl.domain.BorrowLog;
import com.zyl.domain.Result;
import com.zyl.service.IBorrowLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yx
 * @date 2023/2/21
 */
@CrossOrigin
@RestController
@RequestMapping("/borrowLogs")
public class BorrowLogController {

    @Autowired
    private IBorrowLogService borrowLogService;

    @PostMapping
    public Result<String> insertLog(@RequestBody BorrowLog borrowLog) {
        boolean b = borrowLogService.save(borrowLog);
        if (b) {
            return new Result<>(200, "success");
        }
        return new Result<>(201, "failed");
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public Result<IPage> getLogPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize, BorrowLog borrowLog) {
        IPage<BorrowLog> page = borrowLogService.getBorrowLogByCondition(currentPage, pageSize, borrowLog);
        if (currentPage > page.getPages()) {
            page = borrowLogService.getBorrowLogByCondition((int) page.getPages(), pageSize, borrowLog);
        }
        return new Result<>(200, "success", page);
    }
}
