package com.seo.demo.service;

import org.springframework.stereotype.Service;

//비즈니스 로직을 처리한다
@Service
public class TestService {

    public int calculate(int number1, int number2) {return number1 + number2;}
}
