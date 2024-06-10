package com.example.aop_project.aop2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        System.out.println("Main method ishlashni boshladi");
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfig2.class);
        University university   =   context.getBean(University.class);
        university.addStudent();
//
//        try {
//
//            List<Student> students = university.getStudents();
//            System.out.println(students);
//        }catch (Exception e){
//            System.out.println("xatoni  try catchda ushladi: "+ e.getMessage());
//        }

        String  name = university.returnStudent();

        System.out.println("Universitetga qaytarildi " + name);

        context.close();
        System.out.println("Main method ishlashni to'xtatdi");
    }
}
