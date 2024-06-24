package com.constructor;

public class StudentConstructor {
    String name;
    int rollNumber;
    double marks;
    StudentConstructor(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        StudentConstructor student = new StudentConstructor("Aditya ", 101, 95.5);
        student.displayDetails();
    }
}
