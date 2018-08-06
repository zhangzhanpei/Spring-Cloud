package app.Aop.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
    // 切点，决定什么时候执行 aop 方法
    @Pointcut("@annotation(app.Aop.Annotation.Timer)")
    public void timer() {}

    // aop 前置方法
    @Before("timer()")
    public void before() {
        System.out.println("timer before");
    }

    // aop 后置方法
    @After("timer()")
    public void after() {
        System.out.println("timer after");
    }
}
