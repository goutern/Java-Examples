//
// Author: Nicholas Goutermout
// Date: 09/11/2018
// Class: CS249
// Description: A program to collect three assignments and show the grades

import java.util.Scanner;

//main class
public class CS249_HW1_Assignments_Nicholas_Goutermout {
    final int ASSIGNMENTS = 3;
    final Scanner scan = new Scanner(System.in); //create a scanner for user input

    public static void main(String[] args)
    // Create a new instance of the CS249_HW1_Assignments_Nicholas_Goutermout Class
    // Call run to start off the program
    {
        CS249_HW1_Assignments_Nicholas_Goutermout obj = new CS249_HW1_Assignments_Nicholas_Goutermout(); //create a new instance of the CS249_HW1_Assignments_Nicholas_Goutermout class
        obj.run();//call the run method
    }

    public void run() {
        String[] assignments = new String[ASSIGNMENTS];
        int[] score = new int[ASSIGNMENTS];
        int[] pointsPossible = new int[ASSIGNMENTS];
        for (int i = 0; i < ASSIGNMENTS; ++i) {
            System.out.println("Please enter name of assignment " + (i+1) + ": ");
            assignments[i] = scan.nextLine();

            System.out.println("Please enter the score: ");
            score[i] = validateInput(scan.nextLine(),i+1);
            System.out.println("Please enter the total points: ");
            pointsPossible[i] = validateInput(scan.nextLine(),i+1);

        }

        int runningScore = 0;
        int runningTotal = 0;
        float percent;

        for (int i = 0; i < ASSIGNMENTS; ++i){
            runningScore +=  score[i];
            runningTotal += pointsPossible[i];
        }

        System.out.format("%-15s%-15s%-15s%n", "Assignment", "Score", "Points Possible");
        for (int i = 0; i < ASSIGNMENTS; ++i) {
            System.out.format("%-15s%-15s%-15s%n", assignments[i], score[i], pointsPossible[i]);
        }

        System.out.println("You total is " + runningScore + " out of " + runningTotal);

        percent = (float)runningScore/runningTotal;
        System.out.format("%s%.2f%%%n", "Your percentage is: ", percent*100);


    }
    private int validateInput(String score, int i){
        Integer returnScore = null;
        do{
            try{
                returnScore = Integer.parseInt(score);
            } catch(Exception e){
                System.out.println("You entered " + score + " for assignment " + i +"\nPlease enter an integer:");
                score = scan.nextLine();
            }

        }while(returnScore == null);

        return returnScore.intValue();
    }
}
