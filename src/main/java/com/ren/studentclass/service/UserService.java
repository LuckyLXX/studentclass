package com.ren.studentclass.service;

import com.ren.studentclass.dao.UserDao;
import com.ren.studentclass.model.User;
import com.ren.studentclass.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:UserService
 * Package:com.ren.studentclass.service
 * Description:
 *
 * @Date:2020/5/25 10:04
 * @Author:857251389@qq.com
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User selectUser(String account ,String password){

        UserExample userExample = new UserExample();
        userExample.createCriteria().andAccountEqualTo(account).andPasswordEqualTo(password);
        List<User> users = userDao.selectByExample(userExample);

        return users.get(0);
    }
}
