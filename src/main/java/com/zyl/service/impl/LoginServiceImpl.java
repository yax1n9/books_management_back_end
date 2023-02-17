package com.zyl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyl.dao.UserDao;
import com.zyl.domain.User;
import com.zyl.service.ILoginService;
import org.springframework.stereotype.Service;

/**
 * @author yx
 * @date 2023/2/16
 */
@Service
public class LoginServiceImpl extends ServiceImpl<UserDao, User> implements ILoginService {
}
