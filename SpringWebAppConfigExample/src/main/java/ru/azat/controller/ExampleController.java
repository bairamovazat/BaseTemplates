package ru.azat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {

    @ResponseBody
    @GetMapping("/example")
    public String example(){
        return "example work";
    }
}
