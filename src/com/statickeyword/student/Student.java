package com.statickeyword.student;

public class Student {

  private int rollNo;

  private String studentName;

  public static String schoolName = "TAPOVAN SCIENCE SCHOOL";

  public Student(int rollNo, String studentName) {
    this.rollNo = rollNo;
    this.studentName = studentName;
  }

  static {
    System.out.println("Student Details:");
  }

  public void studentDetails() {
    System.out.println("Student roll no:" + rollNo);
    System.out.println("Student Name:" + studentName);
  }


  public static void schoolName() {
    System.out.println("School Name:" + schoolName);
  }

}
