package com.example.aop_project.aop;


import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void getBook(){
        System.out.println("Biz kitob olamiz");
    }

    public void getMagazine(){
        System.out.println("Magazine kitob olamiz");
    }

    public String returnBook() {

        System.out.println("Book returned in Library");

        return "Boy ota va qambag'al ota";
    }

    public void returnMagazine() {
        System.out.println("Magazine returned");
    }

    public void addBook(){
        System.out.println("Book added");
    }



}
