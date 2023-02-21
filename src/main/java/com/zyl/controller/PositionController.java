package com.zyl.controller;

import com.zyl.domain.Position;
import com.zyl.domain.Result;
import com.zyl.service.IPositionService;
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
@RequestMapping("/positions")
public class PositionController {
    @Autowired
    private IPositionService positionService;

    @GetMapping
    public Result<List> getPositionList() {
        List<Position> list = positionService.list();
        return new Result<>(200, "success", list);
    }
}
