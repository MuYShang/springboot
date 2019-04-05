package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication来标注这个程序是一个springBoot程序
public class HelloWorld {
    public static void main(String [] args){

        //spring应用启动起来
        SpringApplication.run(HelloWorld.class,args);
    }
}
