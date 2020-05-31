package com.ren.studentclass.controller;

import com.ren.studentclass.dto.ClassAndDetail;
import com.ren.studentclass.model.ClassDetail;
import com.ren.studentclass.model.User;
import com.ren.studentclass.service.ClassService;
import com.ren.studentclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * ClassName:BamController
 * Package:com.ren.studentclass.controller
 * Description:
 *
 * @Date:2020/5/25 10:16
 * @Author:857251389@qq.com
 */
@Controller
public class BamController {
    @Autowired
    private ClassService classService;

    @Autowired
    private UserService userService;

    @GetMapping("/languages_academy")
    public String languagesAcademy(){

        return "languages_academy";
    }

    @GetMapping("/computer_academy")
    public String computerAcademy(){

        return "computer_academy";
    }

    @GetMapping("/cailiao_academy")
    public String cailiaoAcademy(){

        return "cailiao_academy";
    }

    @GetMapping("/shuli_academy")
    public String shuliAcademy(){

        return "shuli_academy";
    }
    @GetMapping("/mks_academy")
    public String mksAcademy(){

        return "mks_academy";
    }

    @GetMapping("/sourceDetailJump/{courseId}")
    public String sourceDetailJump(@PathVariable(name = "courseId") Integer courseId,
                                   Model model){

        List<ClassAndDetail> classAndDetails = classService.selectByCourseId(courseId);
        model.addAttribute("classAndDetail",classAndDetails.get(0));

        return "Detail";
    }

    @GetMapping("/academy_bam_jump/{academyName}")
    public String academyBamJump(@PathVariable(name = "academyName") String academyName){
        if("计算机科学与技术学院".equals(academyName)){
            return "computer_academy";
        }

        return "redirect:/";
    }

//    @GetMapping("/teacher_bam_jump/{teacherName}")
//    public String teacherBamJump(@PathVariable(name = "teacherName") String teacherName,Model model){
//
//       List<ClassDetail> classDetails = classService.selectClassDetailByTeacherName(teacherName);
//        model.addAttribute("classDetails");
//        return "teacher_detail";
//    }

    @GetMapping("/teacher_bam_jump/{teacherName}")
    public String teacherBamJump(@PathVariable(name = "teacherName") String teacherName,Model model){
        model.addAttribute("teacherName",teacherName);
        return "teacher_detail";
    }

    @GetMapping("/alter_mm/{userId}")
    public String alterMm(@PathVariable(name = "userId")Integer userId, Model model){

        User user = userService.selectByUserId(userId);
        model.addAttribute("user",user);
        return "alter_mm";
    }
}
