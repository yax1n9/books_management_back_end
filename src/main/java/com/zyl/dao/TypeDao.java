package com.zyl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.zyl.domain.Type;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yx
 * @date 2023/2/17
 */
@Mapper
public interface TypeDao extends BaseMapper<Type> {
}
