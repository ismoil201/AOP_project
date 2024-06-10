package com.example.aop_project;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{


    @Override
    public void say() {

        System.out.println("Miaw miaw miaw miaw miaw");
    }
}
