package com.ren.studentclass.controller;

import com.ren.studentclass.dao.UserDao;
import com.ren.studentclass.model.User;
import com.ren.studentclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName:IndexController
 * Package:com.ren.studentclass.controller
 * Description:
 *
 * @Date:2020/5/25 9:36
 * @Author:857251389@qq.com
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/login")
    public String login(String account,String password){

        User user = userService.selectUser(account, password);

        if(user!= null){

            return "bam";
        }
        return "redirect:/";
    }
}
