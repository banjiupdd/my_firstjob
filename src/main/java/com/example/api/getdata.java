package com.example.api;

import com.example.domain.Clazz;
import com.example.repository.ClazzMapper;
import com.example.service.service;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/4 0004.
 */

@RestController
@EnableAutoConfiguration
public class getdata{

    @Autowired
    private ClazzMapper clazzMapper;

    @RequestMapping(value = "/getdata",method = RequestMethod.GET)
    public String getdata(){
        String s = clazzMapper.selectByPrimaryKey(1).getClassName();
        return s;
    }
}
