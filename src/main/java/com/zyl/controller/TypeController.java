package com.zyl.controller;

import com.zyl.domain.Result;
import com.zyl.domain.Type;
import com.zyl.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author yx
 * @date 2023/2/17
 */
@CrossOrigin
@RestController
@RequestMapping("/types")
public class TypeController {
    @Autowired
    private ITypeService typeService;

    @GetMapping
    public Result<List<Type>> getTypes() {
        List<Type> list = typeService.list();
        return new Result<List<Type>>(200, "success", list);
    }
}
