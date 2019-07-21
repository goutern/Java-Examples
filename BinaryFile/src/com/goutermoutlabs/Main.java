package com.goutermoutlabs;

import java.io.*;
import java.util.Scanner;


/**
 * Generic Example of a Binary File
 * Read, Write and Edit a binary file
 */
public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] seats = new char[8][6];
        boolean exit = false;
        File seatMap = new File("seatMap.dat");
        if(!seatMap.exists()){
            firstWrite(seats);
        }
        while (!exit) {
            seats = readObject();
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Display Seats");
            System.out.println("2. Choose Seats");
            System.out.println("0. Exit[0]");

            int selection;
            try {
                selection = scan.nextInt();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            switch (selection) {
                case 1:
                    display(seats);
                    break;
                case 2:
                    chooseSeat(seats);
                    break;
                case 0:
                    exit = true;
                    continue;
            }
            writeObject(seats);
        }


    }

    private static void chooseSeat(char[][] seats) {
        System.out.print("\nPlease choose a seat e.g(3B):");
        String seatChoice = scan.next();
        int choiceInt;
        char choiceLetter;
        try{
            choiceInt = Integer.parseInt(seatChoice.substring(0,1));
            choiceLetter = (seatChoice.toUpperCase().charAt(1));
        }catch (Exception e){
            System.out.println("Invalid choice");
            return;
        }
        if(choiceLetter < 'A' || choiceLetter > 'F'){
            System.out.println("Invalid letter");
            return;
        }
        if(seats[choiceInt-1][choiceLetter-65] == 'X'){
            System.out.println("Seat Unavailable");
        }else {
            seats[choiceInt - 1][choiceLetter - 65] = 'X';
        }
    }

    private static void display(char[][] seats) {
        for(int i = 0; i< 8; i++) {
            System.out.print("\n" + (i+1));
            for (int j = 0; j < 6; j++) {
                System.out.print(" " + seats[i][j]);
            }
        }
    }


    private static char[][] readObject() {
        char seats[][] = null;
        try {
            ObjectInputStream inputStream = new
                    ObjectInputStream(new FileInputStream("seatMap.dat"));
            seats = (char[][]) inputStream.readObject();

            inputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return seats;

    }

    private static void writeObject(char[][] seats) {
        try {
            ObjectOutputStream outputStream = new
                    ObjectOutputStream(new FileOutputStream("seatMap.dat"));
            outputStream.writeObject(seats);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file seats.dat");
            System.exit(0);
        }
    }

    private static void firstWrite(char[][] seats) {
        for(int i = 0; i< 8; i++) {
            char letter = 'A';
            for (int j = 0; j < 6; j++) {
                seats[i][j] = letter;
                letter++;
            }
        }
        writeObject(seats);
    }
}
