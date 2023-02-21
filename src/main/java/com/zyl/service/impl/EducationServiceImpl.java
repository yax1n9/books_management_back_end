package com.zyl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyl.dao.EducationDao;
import com.zyl.domain.Education;
import com.zyl.service.IEducationService;
import org.springframework.stereotype.Service;

/**
 * @author yx
 * @date 2023/2/21
 */
@Service
public class EducationServiceImpl  extends ServiceImpl<EducationDao, Education> implements IEducationService {
}
