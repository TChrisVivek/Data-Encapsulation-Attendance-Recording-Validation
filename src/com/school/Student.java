package com.school;

public class Student {
    
    private static int nextId = 1;
    private int studentId;
    private String name;

    
    public Student(String name) {
        this.studentId = nextId++;
        this.name = name;
    }

    
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    
    public void displayInfo() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }
}