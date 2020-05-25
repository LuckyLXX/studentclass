package com.ren.studentclass.dto;

import com.ren.studentclass.model.ClassInfo;
import lombok.Data;

import java.util.List;

/**
 * ClassName:ClassDTO
 * Package:com.ren.studentclass.dto
 * Description:
 *
 * @Date:2020/5/25 10:18
 * @Author:857251389@qq.com
 */
@Data
public class ClassDTO {
    private Integer code;
    private String msg;
    private Integer count;
    private List<ClassAndDetail> data;
}
