package com.zyl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyl.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yx
 * @date 2023/2/17
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
