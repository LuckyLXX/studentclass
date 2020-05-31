package com.ren.studentclass.controller;

import com.ren.studentclass.dao.UserDao;
import com.ren.studentclass.model.User;
import com.ren.studentclass.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
    public String index() {

        return "index";
    }

    @GetMapping("/login")
    public String login(String account, String password, Model model) {

        User user = userService.selectUser(account, password);
        model.addAttribute("user", user);
        if (user != null) {
            if (user.getStatus() == 0) {

                return "bam";
            }
            if (user.getStatus() == 1) {

                return "academy_bam";
            }

            if (user.getStatus() == 2) {

                return "teacher_bam";
            }
        }
        return "redirect:/";
    }

    @GetMapping("/mm_modify/{userId}")
    public String mmModify(@PathVariable(name = "userId") Integer userId,
                           String password,
                           Model model) {
        userService.updatePassword(userId,password);
        User user = userService.selectByUserId(userId);
        model.addAttribute("user",user);
        return "alter_mm";
    }
}
