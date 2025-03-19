package com.object_oriented_java.studentApp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager implements StudentOperation {
    private final List<Student> students;
    private final String FILE_NAME = "students.csv";

    public StudentManager() {
        students = new ArrayList<>();
        loadFromFile();
    }

    @Override
    public void addStudent(String id, String name, int age, StudentStatus status) {
        students.add(new Student(id, name, age, status));
        saveToFile();
    }

    @Override
    public void viewStudent() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                System.out.println(s.toStringDisplay());
            }
        }
    }

    @Override
    public void updateStudent(String id, String newName, int newAge, StudentStatus newStatus) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id().equals(id)) {
                students.set(i, new Student(id, newName, newAge, newStatus));
                saveToFile();
                return;
            }
        }
        System.out.println("Student with ID number " + id + " is not found.");
    }

    @Override
    public void deleteStudent(String id) {
        students.removeIf(s -> s.id().equals(id));
        saveToFile();
    }

    public void saveToFile() {
        File file = new File(FILE_NAME);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                writer.write(s.toStringFile());
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void loadFromFile() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Reading line: " + line);
                    String[] parts = line.split(",");
                    if (parts.length == 4) {
                        students.add(new Student(parts[0], parts[1], Integer.parseInt(parts[2]), StudentStatus.valueOf(parts[3])));
                    }
                }
            } catch (IOException exception) {
                System.out.println("Failed to load data.");
            }
        }
    }
}
