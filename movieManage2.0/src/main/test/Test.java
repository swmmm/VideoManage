import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.swmmm.service.DubboDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {
    private static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo/dubbo-consumer.xml");
        context.start();
        DubboDemo demoService = (DubboDemo) context.getBean("dubboDemo"); // 获取远程服务代理
        String hello = demoService.remoteCall(null); // 执行远程方法
        System.out.println(hello); // 显示调用结果
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
