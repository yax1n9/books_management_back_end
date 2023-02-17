package com.zyl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyl.dao.TypeDao;
import com.zyl.domain.Type;
import com.zyl.service.ITypeService;
import org.springframework.stereotype.Service;

/**
 * @author yx
 * @date 2023/2/17
 */
@Service
public class TypeServiceImpl extends ServiceImpl<TypeDao, Type> implements ITypeService {
}
