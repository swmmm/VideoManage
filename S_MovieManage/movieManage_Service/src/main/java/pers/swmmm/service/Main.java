package pers.swmmm.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName: pers.swmmm.service.Main
 * @description:
 * @author: swm
 * @create: 2019-08-26 15:14
 **/
public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:springConfig/spring-movieManage.xml");
//        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:dubbo/dubbo-provider.xml");
        ioc.start();
        System.out.println("启动中");
        System.in.read();
    }
}
