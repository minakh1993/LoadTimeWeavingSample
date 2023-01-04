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

    @Around(value = "serviceCall()", argNames = "pjp")
    public Object log(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aspect invocation");
        return pjp.proceed();
    }
}
