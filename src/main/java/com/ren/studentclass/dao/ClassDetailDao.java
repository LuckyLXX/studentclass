package com.ren.studentclass.dao;

import com.ren.studentclass.model.ClassDetail;
import com.ren.studentclass.model.ClassDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassDetailDao {
    long countByExample(ClassDetailExample example);

    int deleteByExample(ClassDetailExample example);

    int deleteByPrimaryKey(Integer courseId);

    int insert(ClassDetail record);

    int insertSelective(ClassDetail record);

    List<ClassDetail> selectByExample(ClassDetailExample example);

    ClassDetail selectByPrimaryKey(Integer courseId);

    int updateByExampleSelective(@Param("record") ClassDetail record, @Param("example") ClassDetailExample example);

    int updateByExample(@Param("record") ClassDetail record, @Param("example") ClassDetailExample example);

    int updateByPrimaryKeySelective(ClassDetail record);

    int updateByPrimaryKey(ClassDetail record);
}