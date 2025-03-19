package com.object_oriented_java.studentApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentOperation manager = new StudentManager();

        while (true) {
            System.out.println("\n=== CRUD StudentApp ===");
            System.out.println("1. Add Student");
            System.out.println("2. See Student");
            System.out.println("3. Edit Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Student's ID: ");
                    String id = scanner.nextLine();
                    System.out.println("Enter Student's name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Student's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Student's status\n(ACTIVE/INACTIVE/GRADUATED): ");
                    StudentStatus status = StudentStatus.valueOf(scanner.nextLine().toUpperCase());
                    manager.addStudent(id, name, age, status);
                    break;
                case 2:
                    manager.viewStudent();
                    break;
                case 3:
                    System.out.println("Enter Student's ID that you want to edit: ");
                    String updateId = scanner.nextLine();
                    System.out.println("Enter new Student's name: ");
                    String newName = scanner.nextLine();
                    System.out.println("Enter new Student's age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter new Student's status\n(ACTIVE/INACTIVE/GRADUATED): ");
                    StudentStatus newStatus = StudentStatus.valueOf(scanner.nextLine().toUpperCase());
                    manager.updateStudent(updateId, newName, newAge, newStatus);
                    break;
                case 4:
                    System.out.println("Enter Student's ID that you want to delete: ");
                    String deleteId = scanner.nextLine();
                    manager.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
