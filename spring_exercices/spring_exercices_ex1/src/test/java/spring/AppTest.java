package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.config.SpringConfig;
import spring.interfaces.Musicien;

public class AppTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        ctx.getBean("pianiste", Musicien.class).perform();
        ctx.getBean("guitariste", Musicien.class).perform();
        ctx.close();
    }

}
