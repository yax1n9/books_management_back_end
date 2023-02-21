package com.zyl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyl.dao.*;
import com.zyl.domain.User;
import com.zyl.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yx
 * @date 2023/2/21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private DepartmentDao departmentDao;
    @Autowired
    private EducationDao educationDao;
    @Autowired
    private MajorDao majorDao;
    @Autowired
    private PositionDao positionDao;
    @Autowired
    private ProfessionalTitleDao professionalTitleDao;

    @Override
    public IPage<User> getUserPageByCondition(Integer currentPage, Integer pageSize, User user) {
        Page<User> page = new Page<>(currentPage, pageSize);
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.like(user.getName() != null, User::getName, user.getName());
        Page<User> userPage = userDao.selectPage(page, lqw);
        List<User> records = userPage.getRecords();
        for (User u : records) {
            u.setDepartment(departmentDao.selectById(u.getDepartmentId()).getName());
            u.setEducation(educationDao.selectById(u.getEducationId()).getName());
            u.setMajor(majorDao.selectById(u.getMajorId()).getName());
            u.setPosition(positionDao.selectById(u.getPositionId()).getName());
            u.setProfessionalTitle(professionalTitleDao.selectById(u.getProfessionalTitleId()).getName());
        }
        userPage.setRecords(records);
        // System.out.println("---records-------------------------------------------------------");
        // System.out.println(records);
        // System.out.println("---userPage------------------------------------------------------------");
        // System.out.println(userPage.getRecords());
        return userPage;
    }
}
