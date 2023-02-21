package com.zyl.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zyl.domain.Result;
import com.zyl.domain.User;
import com.zyl.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yx
 * @date 2023/2/21
 */
@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/{currentPage}/{pageSize}")
    public Result<IPage> getUserPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize, User user) {
        IPage<User> page = userService.getUserPageByCondition(currentPage, pageSize, user);
        if (currentPage > page.getPages()) {
            page = userService.getUserPageByCondition((int) page.getPages(), pageSize, user);
        }
        return new Result<>(200, "success", page);
    }
}
