package aspects;

public aspect FirstAspect {
    pointcut pc1(): execution(* test.Application.ma(..));

    /*before():pc1() {
        System.out.println("--------------------------------------------");
        System.out.println("Before main from Aspect with AspectJ syntaxe");
        System.out.println("--------------------------------------------");
    }

    after():pc1() {
        System.out.println("--------------------------------------------");
        System.out.println("After  main from Aspect with AspectJ syntaxe");
        System.out.println("--------------------------------------------");
    }*/

    void around():pc1(){
        System.out.println("--------------------------------------------");
        System.out.println("Before main from Aspect with AspectJ syntaxe");
        System.out.println("--------------------------------------------");
        proceed();
        System.out.println("--------------------------------------------");
        System.out.println("After  main from Aspect with AspectJ syntaxe");
        System.out.println("--------------------------------------------");

    }
}
