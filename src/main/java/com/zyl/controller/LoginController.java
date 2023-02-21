package com.zyl.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zyl.domain.Result;
import com.zyl.domain.User;
import com.zyl.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @author yx
 * @date 2023/2/16
 */

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private ILoginService loginService;

    @PostMapping
    public Result<User> login(@RequestBody User user) {

        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.eq(user.getAccount() != null && user.getPassword() != null, User::getAccount, user.getAccount())
                .eq(user.getAccount() != null && user.getPassword() != null, User::getPassword, user.getPassword());
        User u = loginService.getOne(lqw);
        if (Objects.isNull(u)) {
            return new Result<>(201, "failed");
        }
        return new Result<User>(200, "success", u);
    }
}
