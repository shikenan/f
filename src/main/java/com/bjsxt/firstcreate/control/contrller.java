package com.bjsxt.firstcreate.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class contrller {


    @RequestMapping("/test1")
    public String test1(){
        return "hello";
    }

}
