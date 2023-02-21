package com.zyl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyl.dao.DepartmentDao;
import com.zyl.domain.Department;
import com.zyl.service.IDepartmentService;
import org.springframework.stereotype.Service;

/**
 * @author yx
 * @date 2023/2/21
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentDao, Department> implements IDepartmentService {
}
