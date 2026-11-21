package Spring_AOP;

import Spring_AOP.service.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackages = {"Spring_AOP"})
public class Application {
    public static void main(String[] args) {
        ApplicationContext  applicationContext = new AnnotationConfigApplicationContext(Application.class);

        IMetier metier = applicationContext.getBean(IMetier.class);
        metier.process();
        System.out.println(metier.compute());


    }
}
