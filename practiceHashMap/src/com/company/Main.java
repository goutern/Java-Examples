package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static HashMap students = new HashMap<Integer, ArrayList<String>>();

    public static void main(String[] args) {
        // write your code here

        String[] inputArray;
        int studentId;
        InputHandler inputHandler = new InputHandler();
        boolean exit = false;
        System.out.print("\nPlease input the Student's  ID Classes\n(E.g. 17 CS101 CS102)\n(-1 to Exit)\n");
        while (!exit) {
            ArrayList<String> courses = new ArrayList<>();
            inputArray = inputHandler.parseCourses(inputHandler.readInfo());
            try {
                studentId = Integer.parseInt(inputArray[0]);
            } catch (Exception e) {
                System.out.println("Invalid Input");
                continue;
            }
            if(inputArray.length <2){
                if(Integer.parseInt(inputArray[0]) == -1){
                    exit = true;
                }
                continue;
            }
            for (int i = 1; i < inputArray.length; i++) {
                courses.add(inputArray[i]);
            }
            addNewCourses(studentId, courses);
        }
        print();
    }

    public static void addNewCourses(int studentId, ArrayList<String> courses) {
        if(!students.containsKey(studentId)){
            students.put(studentId, courses);
        }else {
            students.put(studentId, combineArrays((ArrayList<String>) students.get(studentId), courses));
        }
    }

    public static ArrayList<String> combineArrays(ArrayList<String> existingCourses, ArrayList<String> newCourses) {
        for (String course : newCourses) {
            if (existingCourses.contains(course)) {
                continue;
            } else {
                existingCourses.add(course);
            }
        }
        return existingCourses;
    }

    public static void print() {
        students.forEach((key, value) -> {
            System.out.println("StudentID: " + key + "\n\tClasses: " + students.get(key));
        });
    }

}
