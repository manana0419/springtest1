package hellow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class Applicationspring {
    public static void main(String[] args) {
        System.out.println("applicationspring");
        //初始化spring容器
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取MessagePrinter对象
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
