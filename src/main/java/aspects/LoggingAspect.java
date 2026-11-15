package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
    long t1,t2;
    @Pointcut("execution(* metier.MetierBanqueImpl.*(..))")
    public void pc1(){ }

    @Before("pc1()")
    public void avant(JoinPoint joinPoint){
        t1 =System.currentTimeMillis();
        System.out.println("---------------------------------------------------------");
        System.out.println("Avant l'execution de la methode "+joinPoint.getSignature());
    }
    @After("pc1()")
    public void apres(JoinPoint joinPoint){
        System.out.println("Apres l'execution de la methode "+joinPoint.getSignature());
        t2 =System.currentTimeMillis();
        System.out.println("Duré d'execution de la methode "+(t2-t1));
        System.out.println("---------------------------------------------------------");
    }
}
