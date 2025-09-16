package com.school;

public class Course {
    // Fields are now private
    private static int nextId = 101;
    private int courseId;
    private String courseName;

    // Constructor remains the same
    public Course(String courseName) {
        this.courseId = nextId++;
        this.courseName = courseName;
    }

    // Public getters to access private fields
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    // displayInfo method remains the same
    public void displayInfo() {
        System.out.println("Course ID: " + courseId + ", Name: " + courseName);
    }
}