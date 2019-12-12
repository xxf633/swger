package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xxf123 on 2019/12/12.
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        System.out.println("This is a wonderful world");
        return "nihao";
    }
}
