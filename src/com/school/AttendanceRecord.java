package com.school;

public class AttendanceRecord {
    // Private fields for encapsulation
    private int studentId;
    private int courseId;
    private String status;

    // Constructor with validation
    public AttendanceRecord(int studentId, int courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;

        // Validate the status (case-insensitive)
        if ("Present".equalsIgnoreCase(status) || "Absent".equalsIgnoreCase(status)) {
            this.status = status;
        } else {
            this.status = "Invalid";
            System.out.println("Warning: Invalid attendance status '" + status + "' provided. Marked as 'Invalid'.");
        }
    }

    // Public getters for all fields
    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getStatus() {
        return status;
    }

    // Method to display the record details
    public void displayRecord() {
        System.out.println("Attendance Record -> Student ID: " + studentId + ", Course ID: " + courseId + ", Status: " + status);
    }
}