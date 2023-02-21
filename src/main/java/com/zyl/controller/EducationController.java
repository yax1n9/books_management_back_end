package com.zyl.controller;

import com.zyl.domain.Education;
import com.zyl.domain.Result;
import com.zyl.service.IEducationService;
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
@RequestMapping("/educations")
public class EducationController {

    @Autowired
    private IEducationService educationService;

    @GetMapping
    public Result<List> getEducationList() {

        List<Education> list = educationService.list();
        return new Result<>(200, "success", list);
    }
}
