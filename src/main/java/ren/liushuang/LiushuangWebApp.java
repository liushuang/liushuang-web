package ren.liushuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 初始化类
 * Created by liushuang on 13/7/2016.
 */
@Controller
@EnableAutoConfiguration
public class LiushuangWebApp {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(LiushuangWebApp.class, args);
    }

}
