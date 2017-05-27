package cn.billionsfinance.bas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hanlin.huang on 2017/5/25.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello world from Spring Boot!";
    }



}
