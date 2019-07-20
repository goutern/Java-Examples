package com.company;

public class Main {

    public static void main(String[] args) {

        Student nick = new Student();
        Student rob = new Student(2,"CS", new int[]{80,90,70,80,100});

        nick.setName("Nick");
        nick.setStudentID(1);
        nick.setStudentMajor("History");
        int[] nicksGrades = new int[]{50,40,30,50,12};
        nick.setGrades(nicksGrades);
        nick.setGrade(Student.MATH, 75);


        rob.setName("Rob");
        System.out.println("Are they equal?: " + nick.equals(rob));

        System.out.println(rob.toString());
        System.out.println("Robs GPA: " + rob.calcGPA());
        System.out.println(nick.toString());
        System.out.println("Nicks GPA: " + nick.calcGPA());

        //test find max
        System.out.println("Test findMax: " + findMax(nicksGrades));
    }

    public static int findMax(int[] ints) {
        int maxValue = Integer.MIN_VALUE;
        for (int i : ints) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }
}
