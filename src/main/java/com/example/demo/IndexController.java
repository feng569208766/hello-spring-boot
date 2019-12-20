package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/12/20 0020.
 */

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "hello";
    }
}
