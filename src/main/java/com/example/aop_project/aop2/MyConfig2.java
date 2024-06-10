package com.example.aop_project.aop2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration("aop2")
@ComponentScan
@EnableAspectJAutoProxy
public class MyConfig2 {
}
