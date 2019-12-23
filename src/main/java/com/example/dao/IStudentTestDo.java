package com.example.dao;

import com.example.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2019/12/20 0020.
 */
@Mapper
public interface IStudentTestDo {

    List<Student> findAll();
}
