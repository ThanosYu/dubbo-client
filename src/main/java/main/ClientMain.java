package main;

import com.xbz.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Thanos Yu on 2017/10/16.
 */
public class ClientMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationConsumer.xml" });
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.sayHello("什么情况"));
        context.close();
    }
}
