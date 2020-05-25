package com.ren.studentclass.model;

import java.io.Serializable;
import lombok.Data;

/**
 * class_info
 * @author 
 */
@Data
public class ClassInfo implements Serializable {
    private Integer id;

    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 课程资源总数
     */
    private Integer allNum;

    /**
     * 作业库作业数
     */
    private Integer taskNum;

    /**
     * 题库试题数
     */
    private Integer testNum;

    private Integer studentNum;

    private Integer pvNum;

    /**
     * 作业完成数
     */
    private Integer jobFinish;

    /**
     * 作业均分
     */
    private Integer jobGrade;

    /**
     * 考试数
     */
    private Integer exam;

    /**
     * 考试完成度
     */
    private String examFinish;

    /**
     * 考试均分
     */
    private Double examGrade;

    /**
     * 作业参与数
     */
    private Integer jobInNum;

    /**
     * 考试参与数
     */
    private Integer examInNum;

    /**
     * 互动数
     */
    private Integer courseInteract;

    private static final long serialVersionUID = 1L;
}