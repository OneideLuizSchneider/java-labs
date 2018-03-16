package br.com.aspect.spring.aop.annotation.impl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author oneide.schneider
 */
@Aspect
@Component
public class AutoGenerateWithAnnotation {

    @Around("@annotation(br.com.aspect.spring.aop.annotation.LogGenerate)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Start...");
        final long start = System.currentTimeMillis();

        final Object proceed = joinPoint.proceed();

        final long executionTime = System.currentTimeMillis() - start;
        System.out.println("Method: " + joinPoint.getSignature() + " executed in " + executionTime + "ms");
        
        return proceed;
    }

    @Before("@annotation(br.com.aspect.spring.aop.annotation.LogGenerate)")
    public void before() throws Throwable {
        System.out.println("Before...");
    }

    @After("@annotation(br.com.aspect.spring.aop.annotation.LogGenerate)")
    public void after() throws Throwable {
        System.out.println("after...");
    }

}
