package newenergy.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HUST Corey on 2019-03-26.
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String hello(){
        return "hello world1";
    }
}
