package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Neil Alishev
 */
@Controller
@RequestMapping("/family")
public class FirstController {

    @GetMapping("/haupt")
    public String ersteSeite(){
        return "ersteSeite/default";
    }

    @GetMapping("/hello")
    public String helloPage() {
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
