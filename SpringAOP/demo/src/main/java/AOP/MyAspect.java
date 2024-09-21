package AOP;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect//定义方面类
public class MyAspect {
    @Before("execution(public void AOP.ServiceImpl.Speak())")
    public void before() {
        System.out.println("AOP before");
    }
}
