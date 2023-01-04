package com.sample.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author M.khoshnevisan
 * @since 1/2/2023
 */
@Aspect
public class TestAspect {

    @Pointcut(value = "execution(public * com.tosan.http.server.starter.logger.ServiceLogger.log(..))")
    public void serviceCall() {
    }

    @Pointcut(value = "execution(* *(..)) && @annotation(com.sample.demo.TestAnnotation)")
    public void testAnnotated() {
    }

    @Around(value = "serviceCall()", argNames = "pjp")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aspect invocation");
        return pjp.proceed();
    }

    @Around(value = "testAnnotated()", argNames = "pjp")
    public Object logAnnotation(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("annotated with test annotation");
        return pjp.proceed();
    }
}
