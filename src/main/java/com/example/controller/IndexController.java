package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.dao.IStudentTestDo;
import com.example.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/12/20 0020.
 */

@Controller
public class IndexController {

    @Resource
    private IStudentTestDo studentTestDo;

    @RequestMapping("/index")
    public String index() {
        return "hello";
    }

    @RequestMapping("/stu")
    @ResponseBody
    public String test1(){
        List<Student> all = studentTestDo.findAll();
        System.out.println("返回数据："+ JSON.toJSONString(all));
        return JSON.toJSONString(all);
    }
}
