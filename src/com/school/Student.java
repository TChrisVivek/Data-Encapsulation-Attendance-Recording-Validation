package com.school;

public class Student {
    // Fields are now private
    private static int nextId = 1;
    private int studentId;
    private String name;

    // Constructor remains the same
    public Student(String name) {
        this.studentId = nextId++;
        this.name = name;
    }

    // Public getters to access private fields
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    // displayInfo method remains the same
    public void displayInfo() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }
}