package com.ren.studentclass.model;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String account;

    private String password;

    private static final long serialVersionUID = 1L;
}