package com.company;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String line = "";
        while(!line.equals("N")) {


            System.out.println("Please enter the time in the following format HH:MM or N to exit");

            line = scan.nextLine();

            int h1;
            int h2;
            int m1;
            int m2;

            try {
                h1 = Integer.parseInt(line.substring(0,1));
            } catch (Exception e) {
                System.out.println("Your first character was not a number");
                continue;
            }
            try {
                h2 = Integer.parseInt(line.substring(1,2));
            } catch (Exception e) {
                System.out.println("Your second character was not a number");
                continue;
            }
            try {
                m1 = Integer.parseInt(line.substring(3,4));
            } catch (Exception e) {
                System.out.println("Your fourth character was not a number");
                continue;
            }
            try {
                m2 = Integer.parseInt(line.substring(4,5));
            } catch (Exception e) {
                System.out.println("Your fifth character was not a number");
                continue;
            }

            try {
                if (h1 > 1 ||  h1 < 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Your first number was not between 0 and 1");
                continue;
            }
            try {
                if (h2 > 9 || h2 < 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Your second number was not between 0 and 9");
                continue;
            }
            try {
                if (m1 > 6 || m1 < 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Your third number was not between 0 and 6");
                continue;
            }
            try {
                if (m2 > 9 || m2 < 0) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Your fourth number was not between 0 and 9");
                continue;
            }
            System.out.println("" + h1 + h2 + ":" + m1 + m2 );
        }

    }
}
