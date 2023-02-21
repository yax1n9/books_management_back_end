package com.zyl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zyl.domain.BorrowLog;

/**
 * @author yx
 * @date 2023/2/21
 */
public interface IBorrowLogService extends IService<BorrowLog> {

    IPage<BorrowLog> getBorrowLogByCondition(Integer currentPage, Integer pageSize, BorrowLog borrowLog);
}
