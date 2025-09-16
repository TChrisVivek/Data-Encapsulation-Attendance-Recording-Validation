package com.school;

// Add imports for List and ArrayList
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Student and Course Management System ---");

        // Create Student and Course objects
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Course course1 = new Course("Computer Science");
        Course course2 = new Course("Mathematics");

        // Display initial info
        student1.displayInfo();
        student2.displayInfo();
        course1.displayInfo();
        course2.displayInfo();

        System.out.println("\n--- Recording Attendance ---");

        // Create a list to store attendance records
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Record attendance using getters to access IDs
        // Note: We are using student1.getStudentId() and course1.getCourseId()
        attendanceLog.add(new AttendanceRecord(student1.getStudentId(), course1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(student2.getStudentId(), course1.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(student1.getStudentId(), course2.getCourseId(), "present")); // Test case-insensitivity

        // Create a record with an invalid status to test validation
        attendanceLog.add(new AttendanceRecord(student2.getStudentId(), course2.getCourseId(), "Late"));

        // Loop through the log and display each record
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}