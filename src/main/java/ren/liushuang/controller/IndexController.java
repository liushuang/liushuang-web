package ren.liushuang.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

/**
 * Created by liushuang on 22/7/2016.
 */
@Controller
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "liushuang");
        model.addAttribute("time", LocalDateTime.now());
        return "index";
    }

    @RequestMapping("/")
    public String indexDefault(Model model) {
        return "index";
    }
}
