package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        boolean exit = true;
        String line;
        int studentID;
        String studentClass;
        String[] studentInfo;
        while(!exit) {
            line = "";
            try {
                line = br.readLine();
                studentInfo = line.split("\\s+");
                names[i] = name[0];
                pop[i] = Integer.parseInt(name[1]);
            }catch(Exception e){

            }
        }
    }
}
