package com.zyl.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyl.dao.BorrowLogDao;
import com.zyl.domain.BorrowLog;
import com.zyl.service.IBorrowLogService;
import org.springframework.stereotype.Service;

/**
 * @author yx
 * @date 2023/2/21
 */
@Service
public class BorrowLogServiceImpl extends ServiceImpl<BorrowLogDao, BorrowLog> implements IBorrowLogService {
    @Override
    public IPage<BorrowLog> getBorrowLogByCondition(Integer currentPage, Integer pageSize, BorrowLog borrowLog) {
        return null;
    }
}
