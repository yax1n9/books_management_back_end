package com.zyl.controller;

import com.zyl.domain.ProfessionalTitle;
import com.zyl.domain.Result;
import com.zyl.service.IProfessionalTitleService;
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
@RequestMapping("/professionalTitles")
public class ProfessionalTitleController {

    @Autowired
    private IProfessionalTitleService professionalTitleService;

    @GetMapping
    public Result<List> getProfessionalTitleList() {
        List<ProfessionalTitle> list = professionalTitleService.list();
        return new Result<>(200, "success", list);
    }
}
