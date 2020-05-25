package com.ren.studentclass.controller;

import com.ren.studentclass.dto.ClassAndDetail;
import com.ren.studentclass.dto.ClassDTO;
import com.ren.studentclass.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName:DataApiController
 * Package:com.ren.studentclass.controller
 * Description:
 *
 * @Date:2020/5/25 10:18
 * @Author:857251389@qq.com
 */
@Controller
public class DataApiController {

    @Autowired
    private ClassService classService;

    @GetMapping("/languagesData")
    @ResponseBody
    public ClassDTO languagesData(String stmanAcademy){
        List<ClassAndDetail> classAndDetails = classService.selectLanguage(stmanAcademy);

        ClassDTO classDTO = new ClassDTO();
        classDTO.setCode(0);
        classDTO.setMsg("language");
        classDTO.setData(classAndDetails);
        classDTO.setCount(classAndDetails.size());

        return classDTO;
    }

    @GetMapping("/sourceDetail")
    @ResponseBody
    public ClassDTO sourceDetail(Integer courseId){

        List<ClassAndDetail> classAndDetails = classService.selectByCourseId(courseId);

        ClassDTO classDTO = new ClassDTO();
        classDTO.setCode(0);
        classDTO.setMsg("language");
        classDTO.setData(classAndDetails);
        classDTO.setCount(classAndDetails.size());

        return classDTO;
    }
}
