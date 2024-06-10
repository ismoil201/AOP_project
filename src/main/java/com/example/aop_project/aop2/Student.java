package com.example.aop_project.aop2;

public class Student {
    private String name;
    private int course;
    private  double avgScore;

    public Student(String name, int course, double avgScore) {
        this.name = name;
        this.course = course;
        this.avgScore = avgScore;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", avgScore=" + avgScore +
                '}';
    }
}
