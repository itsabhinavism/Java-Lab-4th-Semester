/*Write a program in java to input and display the details of n number of students
having roll, name and cgpa as data members. Also display the name of the student having lowest cgpa.*/

import java.util.Scanner;

class Student {

  int rollNo;
  String name;
  double cgpa;

  public Student(int rollNo, String name, double cgpa) {
    this.rollNo = rollNo;
    this.name = name;
    this.cgpa = cgpa;
  }
}

public class L3P3StudentDetails {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of students: ");
    int n = sc.nextInt();

    Student[] students = new Student[n];

    // Input details for each student
    for (int i = 0; i < n; i++) {
      System.out.println("\nEnter details for student " + (i + 1) + ":");
      System.out.print("Roll No: ");
      int rollNo = sc.nextInt();
      System.out.print("Name: ");
      sc.nextLine(); // Consume newline character
      String name = sc.nextLine();
      System.out.print("CGPA: ");
      double cgpa = sc.nextDouble();

      students[i] = new Student(rollNo, name, cgpa);
    }

    // Display details of all students
    System.out.println("\nDetails of all students:");
    for (Student student : students) {
      System.out.println("Roll No: " + student.rollNo);
      System.out.println("Name: " + student.name);
      System.out.println("CGPA: " + student.cgpa);
      System.out.println();
    }

    // Find the student with the lowest CGPA
    double lowestCGPA = Double.MAX_VALUE;
    String lowestCGPAStudentName = "";

    for (Student student : students) {
      if (student.cgpa < lowestCGPA) {
        lowestCGPA = student.cgpa;
        lowestCGPAStudentName = student.name;
      }
    }

    // Display the name of the student with the lowest CGPA
    System.out.println(
      "Student with the lowest CGPA: " + lowestCGPAStudentName
    );
  }
}
