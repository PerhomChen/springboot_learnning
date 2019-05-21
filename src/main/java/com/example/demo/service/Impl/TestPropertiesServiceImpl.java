package com.example.demo.service.Impl;

import com.example.demo.service.TestPropertiesService;
import org.springframework.stereotype.Service;


public class TestPropertiesServiceImpl implements TestPropertiesService {

    @Override
    public void testService() {
        System.out.println(1);
    }

    @Override
    public void test() {
        System.out.println(2);
    }
}
