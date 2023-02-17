package com.zyl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyl.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yx
 * @date 2023/2/16
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
