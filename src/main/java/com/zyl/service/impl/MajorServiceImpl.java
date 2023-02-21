package com.zyl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyl.dao.MajorDao;
import com.zyl.domain.Major;
import com.zyl.service.IMajorService;
import org.springframework.stereotype.Service;

/**
 * @author yx
 * @date 2023/2/21
 */
@Service
public class MajorServiceImpl  extends ServiceImpl<MajorDao, Major> implements IMajorService {
}
