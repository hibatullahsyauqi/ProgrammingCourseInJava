package com.object_oriented_java.studentApp;

public interface StudentOperation {
    void addStudent(String id, String name, int age, StudentStatus status);
    void viewStudent();
    void updateStudent(String id, String newName, int newAge, StudentStatus newStatus);
    void deleteStudent(String id);
}