package com.zyl.controller;

import com.zyl.domain.Major;
import com.zyl.domain.Result;
import com.zyl.service.IMajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yx
 * @date 2023/2/21
 */
@CrossOrigin
@RestController
@RequestMapping("/majors")
public class MajorController {

    @Autowired
    private IMajorService majorService;

    @GetMapping
    private Result<List> getMajorList() {
        List<Major> list = majorService.list();
        return new Result<>(200, "success", list);
    }
}
