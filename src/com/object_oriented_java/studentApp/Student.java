package com.object_oriented_java.studentApp;

public record Student(String id, String name, int age, StudentStatus status) {
    public String toStringDisplay() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Student status: " + status;
    }
    public String toStringFile() {
        return id + "," + name + "," + age + "," + status;
    }
}
