package com.zyl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zyl.domain.Book;

/**
 * @author yx
 * @date 2023/2/17
 */
public interface IBookService extends IService<Book> {

    /**
     * 条件分页查询
     *
     * @param currentPage
     * @param pageSize
     * @param book
     * @return
     */
    IPage<Book> getBooksPageByCondition(int currentPage, int pageSize, Book book);
}
