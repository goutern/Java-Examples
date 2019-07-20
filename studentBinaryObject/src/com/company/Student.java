package com.company;

import java.io.Serializable;

public class Student implements Serializable, Comparable {
    int id;
    String name;
    String major;

    public Student(){};

    public Student(String name,int id, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }


    public Student(Student s){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student otherStudent;
        try {
            otherStudent = (Student) o;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return -2;
        }
        return(this.name.compareToIgnoreCase(otherStudent.name));
    }
}
