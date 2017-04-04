package com.example.repository;

import com.example.domain.Clazz;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/4/4 0004.
 */

public interface ClazzMapper {
    Clazz selectByPrimaryKey(@Param("clazzId")Integer clazzId);
}
