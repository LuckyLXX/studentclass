package com.ren.studentclass.model;

import java.io.Serializable;
import lombok.Data;

/**
 * class_detail
 * @author 
 */
@Data
public class ClassDetail implements Serializable {
    private Integer courseId;

    private String courseName;

    private String stmanName;

    private String stmanAcademy;

    private static final long serialVersionUID = 1L;
}