package com.example.aop_project.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        System.out.println("Main method start");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Library libraryBean = context.getBean( Library.class);
//
//        libraryBean.getBook();
//        libraryBean.addBook();
//        libraryBean.returnBook();

        String bookName = libraryBean.returnBook();


        System.out.println("kutubxonaga qaytarildi " + bookName);
        context.close();

        System.out.println("Main method end");
    }
}
