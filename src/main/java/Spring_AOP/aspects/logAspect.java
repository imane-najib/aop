package Spring_AOP.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class logAspect {

    @Before("execution(* Spring_AOP.service.*.*(..))")
    public void Log(){
        System.out.println("From Logging Aspect .... Before");
    }
}
