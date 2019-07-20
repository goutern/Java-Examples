package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Student extends Person {
    int studentID;
    String studentMajor;
    int[] grades = new int[]{0,0,0,0,0};
    public final static int MATH = 0;
    public final static int CHEM = 1;
    public final static int BIO = 2;
    public final static int HISTORY = 3;
    public final static int CS = 4;

    public Student() {
    }

    public Student(int id, String major, int[] grades) {
        this.studentID = id;
        this.studentMajor = major;
        this.grades = grades;
    }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void setGrade(int subject, int grade) {
        switch (subject) {
            case MATH:
                this.grades[MATH] = grade;
                break;
            case CHEM:
                this.grades[CHEM] = grade;
                break;
            case BIO:
                this.grades[BIO] = grade;
                break;
            case HISTORY:
                this.grades[HISTORY] = grade;
                break;
            case CS:
                this.grades[CS] = grade;
                break;
        }

    }

    public double calcGPA(){
        double gpa = 0;
        for(int grade : grades){
            gpa += grade;
        }
        gpa = gpa/5.0;
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ",studentID=" + studentID +
                ", studentMajor='" + studentMajor + '\'' +
                ",Grades{" +
                ", MATH=" + grades[MATH] +
                ", CHEM=" + grades[CHEM] +
                ", BIO=" + grades[BIO] +
                ", HISTORY=" + grades[HISTORY] +
                ", CS=" + grades[CS] +
                "}}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studentID == student.studentID &&
                Objects.equals(studentMajor, student.studentMajor) &&
                Arrays.equals(grades, student.grades);
    }
}

