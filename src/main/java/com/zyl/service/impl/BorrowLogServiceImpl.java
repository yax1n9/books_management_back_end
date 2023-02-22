package com.zyl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyl.dao.BorrowLogDao;
import com.zyl.domain.BorrowLog;
import com.zyl.service.IBorrowLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yx
 * @date 2023/2/21
 */
@Service
public class BorrowLogServiceImpl extends ServiceImpl<BorrowLogDao, BorrowLog> implements IBorrowLogService {
    @Autowired
    private BorrowLogDao borrowLogDao;

    @Override
    public IPage<BorrowLog> getBorrowLogByCondition(Integer currentPage, Integer pageSize, BorrowLog borrowLog) {

        // 只传 bookName  or
        // 传bookName、userName eq
        Page<BorrowLog> page = new Page<>(currentPage, pageSize);
        LambdaQueryWrapper<BorrowLog> lqw = new LambdaQueryWrapper<>();
        lqw.eq(borrowLog.getUserName() != null, BorrowLog::getUserName, borrowLog.getUserName())
                .like(borrowLog.getBookName() != null, BorrowLog::getBookName, borrowLog.getBookName())
                .or(borrowLog.getUserName() == null)
                .like(borrowLog.getUserName() == null, BorrowLog::getUserName, borrowLog.getBookName());
        return borrowLogDao.selectPage(page, lqw);
    }
}
