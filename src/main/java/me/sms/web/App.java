package me.sms.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangmingsen on 2016/8/16.
 */
@RestController
public class App {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String app (){
        return "hello world";
    }
}
