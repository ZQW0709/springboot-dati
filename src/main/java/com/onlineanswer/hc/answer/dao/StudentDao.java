package com.onlineanswer.hc.answer.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.onlineanswer.hc.answer.entity.Classinfo;
import com.onlineanswer.hc.answer.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 学生dao
 */
@Mapper
public interface StudentDao extends BaseMapper<Student> {
    //多表联查方式
    List<Student> getStudentList(Page<Student> page, Map<String, Object> params);
    Integer updatePass(@Param("userName") String  userName,@Param("password")String password);
}
