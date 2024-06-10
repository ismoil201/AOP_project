package com.example.aop_project.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class LoggingAspect {


    @Pointcut("execution(public void *aop.Library.get*())")
    private void allMethodGetFromLibrary(){}

    @Pointcut("execution(*  *aop.Library.return*())")
    private void allMethodReturnFromLibrary(){}

    @Pointcut("execution(public void *aop.Lirary.addBook())")
    private void methodAddBook(){}


    @Before("allMethodGetFromLibrary() || allMethodReturnFromLibrary() && MethodAddBook()")
    public void beforeGetBookAdvice(){
        System.out.println("Before add book: #1");
    }

    @Before("methodAddBook()")
    public void beforeAddBookAdvice(){
        System.out.println("Before add book: #2");
    }

    @Around("execution(* *aop.Library.returnBook())")
    public void aroundReturnBookAdvice(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("aroundReturnBookAdvice: kitob qaytarilish jarayonida ");
    }




//    @Pointcut("execution(public  * com.example.aop_project.aop.Library.getBook())")
//    private void pointCut() {}
//
//    // This pointcut targets all methods within BookService class.
//    @Before("pointCut()")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: ------ -- -mana Attempting to retrieve a book.");
//    }


}
