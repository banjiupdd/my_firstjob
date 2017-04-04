package com.example.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/4 0004.
 */
public class Clazz implements Serializable {
    //clazz_id
    private Integer classId;
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
