package com.example.aop_project.aop2.aspect2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class UniversityLoggingAspect {

//
//    @Before("execution(* getStudents())")
//    public void beforeGetStudents(){
//        System.out.println("Before getStudents : o'quvchilar olish uchun loggin qilinyapti ");
//        System.out.println("----------------------------------------------");
//
//    }
//
//
//    @After("execution(* getStudents())")
//    public void afterGetStudentsLoggingAdvice(){
//        System.out.println("afterGetStudentsLoggingAdvice: jarayon muvofaqayatli tugani yoki" +
//                " xato tashlaganida ham ishlashi");
//        System.out.println("----------------------------------------------");
//
//    }

    @Around("execution(* returnStudent())")
    public Object aroundReturnStudentLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Object targetMethodResult = null;

        System.out.println("aroundReturnStudentLoggingAdvice: Talaba qaytarish jarayoni boshladik");
        try {
            targetMethodResult = proceedingJoinPoint.proceed();

        }catch (Exception e){
            System.out.println("aroundReturnStudentLoggingAdvice: exception ushlandi"+e.getMessage());
            
//            targetMethodResult = "default name: 이스마일";  -> qayta ishlash usuli
            throw  e; // -> dalshe xatoni jonatish shu qatordan keyingi kodlar ishlamaydi,
            // main classiiga jonatik
        }

        System.out.println("Muvofaqayatli o'quvchi qaytarildi");

        return targetMethodResult;
    }


//
//    @AfterThrowing(pointcut = "execution(* getStudents())",
//    throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(JoinPoint joinPoint, Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: Xatoni ushlandi"+exception.getMessage());
//        System.out.println("----------------------------------------------");
//
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())"
//    ,returning="students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//
//        Student firstStudent = students.get(0);
//
//        String name = firstStudent.getName();
//        firstStudent.setName("Janob "+name);
//        int course = firstStudent.getCourse();
//        firstStudent.setCourse(course+1);
//
//
//        System.out.println("afterGetStudents: set qilingan studentlar ro'yxatidan malum bir oquvchini login qildik");
//        System.out.println("----------------------------------------------");
//
//
//    }
}
