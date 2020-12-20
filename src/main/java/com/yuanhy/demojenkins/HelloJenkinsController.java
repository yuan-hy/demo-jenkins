package com.yuanhy.demojenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanhy
 * @date 2020-12-20 15:49
 */
@RestController
public class HelloJenkinsController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Jenkins";
    }
}
