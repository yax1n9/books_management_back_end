package com.zyl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyl.domain.Department;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yx
 * @date 2023/2/21
 */
@Mapper
public interface DepartmentDao extends BaseMapper<Department> {
}
