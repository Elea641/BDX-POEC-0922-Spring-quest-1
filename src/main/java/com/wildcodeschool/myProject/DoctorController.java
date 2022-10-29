package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String index1() {
        return "William Hartenll";
    }
    @GetMapping("/doctor/10")
    @ResponseBody
    public String index2() {
        return "David Tennat";
    }
    @GetMapping("/doctor/13")
    @ResponseBody
    public String index3() {
        return "Jodie Whittaker";
    }
}