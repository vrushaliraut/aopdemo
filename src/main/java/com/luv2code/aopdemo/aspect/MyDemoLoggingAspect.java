package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    // this is where we add all of our related advices for logging
    // lets start with a @Before advice

    // @Before("execution(public void addAccount())")

    //@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")

    // @Before("execution(public void add*())")

   // @Before("execution(void add*())") // PointCut expression match any return type

   // @Before("execution(* add*())") // PointCut expression match any return type

    //@Before("execution(* add*(com.luv2code.aopdemo.Account))") // PointCut expression match any return type

    //@Before("execution(* add*(com.luv2code.aopdemo.Account, ..))")
    // PointCut expression match any return type and any number of arguments

    // Return type, package class method and param - wildcard matching

    @Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    // @Before("execution(public void updateAccount())")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on addAccount()");
    }
}
