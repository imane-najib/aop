package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Scanner;

@Aspect
public class SecurityAspect {

    @Pointcut("execution(* test.Application.start(..))")
    public void startAppPointcut(){}

    @Around("startAppPointcut()")
    public void AutourStart(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String username = sc.next();
        System.out.print("Password: ");
        String password = sc.next();

        if (username.equals("root") && password.equals("1234")) {
            proceedingJoinPoint.proceed();
        }else  {
            System.out.println("Access denied ...");
        }
    }
}
