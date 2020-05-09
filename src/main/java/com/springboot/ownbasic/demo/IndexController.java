package com.springboot.ownbasic.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/query")
    public void asyncTask() throws Exception {
        System.out.println("我是控制类里面的方法，我正在思考...............");
    }

}
