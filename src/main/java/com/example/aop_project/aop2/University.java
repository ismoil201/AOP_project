package com.example.aop_project.aop2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    List<Student> students = new ArrayList<>();

    public void addStudent() {
        students.add(new Student("Ismoil", 3,9.4));
        students.add(new Student("Mary", 3,9.4));
        students.add(new Student("James", 3,9.4));
        students.add(new Student("John", 3,9.4));
    }

    public List<Student> getStudents(){
        System.out.println("getStudent funkisiyasini ishashni  boshlashi");
//        System.out.println(students.get(5)); // <- bu yerda exception tashash uchun ataylab yozilgan 5 indexdagi data yoq
        System.out.println("O'quvchilar haqida malumot: ");
        System.out.println(students);
        System.out.println("----------------------------------------------");
        return students;
    }

    public String returnStudent(){

        int age = 10/0; // <-- bu exception tashlashlik uchun
        System.out.println("returnStudent: funkisiyasini ishashni boshladi");

        return students.get(0).getName();
    }
}
