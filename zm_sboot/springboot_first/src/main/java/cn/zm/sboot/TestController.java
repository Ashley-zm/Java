package cn.zm.sboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ZhuMei
 * @Date 2021/7/28 16:05
 * @Version 1.0
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String hello() {
        return "hello springboot";
    }
}
