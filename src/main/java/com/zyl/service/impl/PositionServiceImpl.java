package com.zyl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyl.dao.PositionDao;
import com.zyl.domain.Position;
import com.zyl.service.IPositionService;
import org.springframework.stereotype.Service;

/**
 * @author yx
 * @date 2023/2/21
 */
@Service
public class PositionServiceImpl  extends ServiceImpl<PositionDao, Position> implements IPositionService {
}
