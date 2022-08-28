package com.seo.demo.controller;

//controller -> service -> repository

import com.seo.demo.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@RequiredArgsConstructor
@RestController //요청을 최초로 받는다
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

//    //생성자 주입.
//    TestController(TestService testService) {
//        this.testService = testService;
//    }

    @GetMapping("/calculate")
    public int testCalculateRequest(@RequestParam int number1, @RequestParam int number2) {
        int result = testService.calculate(number1, number2);
        return result;
    }

    @GetMapping("/calculatePathVariable/{number1}/{number2}")
    public int testCalculatePathVariable(@PathVariable int number1, @PathVariable int number2) {
        int result = testService.calculate(number1, number2);
        return result;
    }
/*
    private final TestService testservice;
    @GetMapping("/car")
    public String a(){
        return "자동차";
    }

    ArrayList<String> car = new ArrayList<>(Arrays.asList("BMW", "Porche", "Audi"));

    @GetMapping("/car/brand")
    public ArrayList carList(){
        return car;
    }
 */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/onePlusOne")
    public int onPlusOne(){
        return 1+1;
    }
}