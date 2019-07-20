package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        File boysFile = new File("boys.txt");
        File girlsFile = new File("girls.txt");
        String[] boysNames = new String[20];
        String[] girlsNames = new String[20];
        int[] boysPop = new int[20];
        int[] girlsPop = new int[20];
        String enteredName;

        Scanner scan = new Scanner(System.in);

        readFile(boysFile, boysNames, boysPop);
        readFile(girlsFile, girlsNames, girlsPop);

        System.out.println("Please enter a name:");
        enteredName = scan.next();

        boolean nameFound = false;
        int boy = searchArray(boysNames, enteredName);
        int girl = searchArray(girlsNames, enteredName);
        if(boy != -1){
            System.out.println(boysNames[boy] + "is ranked "+ (boy+1) +
                    " in popularity among girls with "+ boysPop[boy] + " namings.");
            nameFound = true;
        }
        if(girl != -1){
            System.out.println(girlsNames[girl] + " is ranked "+ (girl+1) +
                    " in popularity among girls with "+ girlsPop[girl] + " namings.");
            nameFound = true;
        }
        if(!nameFound){
            System.out.println(enteredName + " is not ranked among the top 20 girl names or boy names.");
        }


    }
    private static void readFile(File file, String[] names, int[] pop){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            String[] name;
            int i = 0;
            while ((line = reader.readLine()) != null){
                name = line.split("\\s+");
                names[i] = name[0];
                pop[i] = Integer.parseInt(name[1]);
                i++;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static int searchArray(String[] names, String enteredName){
        for(int i = 0; i < names.length; i++){
            if(enteredName.equals(names[i])){
                //System.out.println(enteredName + names[i]);
                return i;
            }
        }
        return -1;
    }
}
