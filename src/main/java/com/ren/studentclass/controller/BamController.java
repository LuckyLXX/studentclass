package com.ren.studentclass.controller;

import com.ren.studentclass.dto.ClassAndDetail;
import com.ren.studentclass.service.ClassService;
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

    @GetMapping("/sourceDetailJump/{courseId}")
    public String sourceDetailJump(@PathVariable(name = "courseId") Integer courseId,
                                   Model model){

        List<ClassAndDetail> classAndDetails = classService.selectByCourseId(courseId);
        model.addAttribute("classAndDetail",classAndDetails.get(0));

        return "Detail";
    }
}
