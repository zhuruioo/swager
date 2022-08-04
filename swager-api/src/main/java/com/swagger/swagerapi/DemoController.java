package com.swagger.swagerapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhur
 * @description :
 * @date : 2022/8/4  15:48
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/get")
    public String get(@RequestParam("name")String name){
        return name;
    }
}
