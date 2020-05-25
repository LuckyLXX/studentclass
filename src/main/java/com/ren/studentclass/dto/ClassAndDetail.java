package com.ren.studentclass.dto;

import com.ren.studentclass.model.ClassDetail;
import com.ren.studentclass.model.ClassInfo;
import lombok.Data;

/**
 * ClassName:ClassAndDetail
 * Package:com.ren.studentclass.dto
 * Description:
 *
 * @Date:2020/5/25 10:27
 * @Author:857251389@qq.com
 */
@Data
public class ClassAndDetail {
    private ClassInfo classInfo;
    private ClassDetail classDetail;
}
