package testdemo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo1.User;

public class testspring5 {
    @Test
    public void testAdd(){
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象
        User user = context.getBean("user",User.class);
        System.out.println(user);
        user.Add();
    }

    @Test
    public void testBook1(){
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象
        Book book = context.getBean("book",Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testBOrdea(){
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象
        Oders ordeas = context.getBean("ordeas",Oders.class);
        System.out.println(ordeas);
        ordeas.odeartest();
    }
}
