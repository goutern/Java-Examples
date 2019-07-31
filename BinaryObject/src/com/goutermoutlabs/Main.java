package com.goutermoutlabs;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        boolean exit = false;


        while (!exit) {
            students = readObject();
            if(students == null){
                students = new ArrayList<Student>();
            }
            System.out.println("Please choose an option:");
            System.out.println("1. Add a record");
            System.out.println("2. Delete a record by ID");
            System.out.println("3. Display a record[3]");
            System.out.println("4. Display a range of records");
            System.out.println("5. Display all students");
            System.out.println("6. Sort all students");
            System.out.println("0. Exit");

            int selection;
            try {
                selection = scan.nextInt();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            switch (selection) {
                case 1:
                    students.add(addRecord());
                    break;
                case 2:
                    removeRecord(students);
                    break;
                case 3:
                    displayRecord(students);
                    break;
                case 4:
                    displayRange(students);
                    break;
                case 5:
                    displayAll(students);
                    break;
                case 6:
                    sortStudents(students);
                    break;
                case 0:
                    exit = true;
                    continue;
            }
            writeObject(students);
        }


    }

    private static Student addRecord() {
        Student student = new Student();
        System.out.println("Please enter an ID");
        student.setId(scan.nextInt());
        System.out.println("Please enter a name");
        student.setName(scan.next());
        System.out.println("Please enter a major");
        student.setMajor(scan.next());
        return student;
    }

    private static void removeRecord(ArrayList<Student> students) {
        if(students == null){
            System.out.println("No students found");
            return;
        }
        System.out.println("Please enter an ID to remove");
        int idToRemove = scan.nextInt();
        for (Student student : students) {
            if (student.getId() == idToRemove) {
                students.remove(student);
                System.out.println("Removed Sudent with id: " + idToRemove);
                return;
            }
        }
        System.out.println("Student with id " + idToRemove + " Not Found");
    }

    private static void displayRecord(ArrayList<Student> students) {
        if(students == null){
            System.out.println("No students found");
            return;
        }
        System.out.println("Please enter an ID to display");
        int idToDisplay = scan.nextInt();
        for (Student student : students) {
            if (student.getId() == idToDisplay) {
                System.out.println(student.toString());
                return;
            }
        }
        System.out.println("Student with id " + idToDisplay + " Not Found");
    }

    private static void displayRange(ArrayList<Student> students) {
        if(students == null){
            System.out.println("No students found");
            return;
        }
        System.out.println("Please enter first ID of range");
        int firstID = scan.nextInt();
        System.out.println("Please enter second ID of range");
        int secondID = scan.nextInt();
        if (secondID < firstID) {
            secondID = firstID + secondID;
            firstID = secondID;
            secondID = secondID - firstID;
        }
        for (Student student : students) {
            if (student.getId() >= firstID && student.getId() <= secondID) {
                System.out.println(student.toString());
            }
        }
    }

    private static void displayAll(ArrayList<Student> students) {
        if(students == null){
            System.out.println("No students found");
            return;
        }
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }


    private static ArrayList<Student> readObject() {
        ArrayList<Student> students = new ArrayList<Student>();
        try {
            ObjectInputStream inputStream = new
                    ObjectInputStream(new FileInputStream("students.dat"));
            students = (ArrayList<Student>) inputStream.readObject();

            inputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return students;
    }

    private static void writeObject(ArrayList<Student> students) {
        try {
            ObjectOutputStream outputStream = new
                    ObjectOutputStream(new FileOutputStream("students.dat"));
            outputStream.writeObject(students);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file students.dat");
            System.exit(0);
        }
    }
    private static void sortStudents(ArrayList<Student> students){
        System.out.println("\n\nUnsorted");
        displayAll(students);
        Student[] studentArray = students.toArray(new Student[students.size()]);
        GeneralizedSort.sort(studentArray, students.size());
        students = new ArrayList<>(Arrays.asList(studentArray));
        System.out.println("\n\nSorted");
        displayAll(students);
    }
}
