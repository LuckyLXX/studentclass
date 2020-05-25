package com.ren.studentclass.service;

import com.ren.studentclass.dao.ClassDetailDao;
import com.ren.studentclass.dao.ClassInfoDao;
import com.ren.studentclass.dto.ClassAndDetail;
import com.ren.studentclass.model.ClassDetail;
import com.ren.studentclass.model.ClassDetailExample;
import com.ren.studentclass.model.ClassInfo;
import com.ren.studentclass.model.ClassInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:ClassService
 * Package:com.ren.studentclass.service
 * Description:
 *
 * @Date:2020/5/25 10:23
 * @Author:857251389@qq.com
 */
@Service
public class ClassService {

    @Autowired
    private ClassInfoDao classInfoDao;

    @Autowired
    private ClassDetailDao classDetailDao;

    public List<ClassAndDetail> selectLanguage(String stmanAcademy){

        ClassDetailExample classDetailExample = new ClassDetailExample();
        classDetailExample.createCriteria().andStmanAcademyEqualTo(stmanAcademy);

        List<ClassDetail> classDetails = classDetailDao.selectByExample(classDetailExample);

        List<ClassAndDetail> classAndDetails = new ArrayList<>();

        for (ClassDetail classDetail : classDetails) {
            ClassInfoExample classInfoExample = new ClassInfoExample();
            classInfoExample.createCriteria().andCourseIdEqualTo(classDetail.getCourseId());

            List<ClassInfo> classInfos = classInfoDao.selectByExample(classInfoExample);

            ClassAndDetail classAndDetail = new ClassAndDetail();
            classAndDetail.setClassDetail(classDetail);
            classAndDetail.setClassInfo(classInfos.get(0));
            classAndDetails.add(classAndDetail);
        }

        return classAndDetails;
    }

    public List<ClassAndDetail> selectByCourseId(Integer courseId) {
        ClassDetail classDetail = classDetailDao.selectByPrimaryKey(courseId);
        ClassInfoExample classInfoExample = new ClassInfoExample();
        classInfoExample.createCriteria().andCourseIdEqualTo(courseId);

        List<ClassInfo> classInfos = classInfoDao.selectByExample(classInfoExample);
        ClassAndDetail classAndDetail = new ClassAndDetail();
        classAndDetail.setClassDetail(classDetail);
        classAndDetail.setClassInfo(classInfos.get(0));
        List<ClassAndDetail> classAndDetails = new ArrayList<>();
        classAndDetails.add(classAndDetail);

        return classAndDetails;
    }
}
