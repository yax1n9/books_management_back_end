package com.zyl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zyl.domain.User;

/**
 * @author yx
 * @date 2023/2/21
 */
public interface IUserService extends IService<User> {

    IPage<User> getUserPageByCondition(Integer currentPage, Integer pageSize, User user);
}
