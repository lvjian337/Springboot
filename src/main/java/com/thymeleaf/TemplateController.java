package com.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvjian on 2017/3/27.
 */
@RestController
public class TemplateController {

    @RequestMapping("/firstThymeleaf")
    public String firstThymeleaf() {
        return "hello";
    }

}
