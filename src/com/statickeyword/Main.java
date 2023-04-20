package com.statickeyword;

import com.statickeyword.student.Student;

public class Main {
  public static void main(String[] args) {

    Student.schoolName();
    Student student1 = new Student(11, "Mihir");
    Student student2 = new Student(12, "Yash");
    System.out.println("\nStudent 1:");
    student1.studentDetails();
    System.out.println("\nStudent 2:");
    student2.studentDetails();

  }
}