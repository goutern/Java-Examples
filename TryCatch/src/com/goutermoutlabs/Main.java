package com.goutermoutlabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String userDate;
        boolean correct = false;
        Scanner scan = new Scanner(System.in);
        String month;
        String day;
        String year;
        while (!correct) {
            System.out.println("Please enter a date to convert (MM/DD/YYYY): ");
            try {
                userDate = scan.nextLine();
                month = parseMonth(userDate);
                year = parseYear(userDate);
                day = parseDay(userDate);
                System.out.println(month + " " + day + "," + year);

            } catch (MonthException|YearException|DayException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static String parseMonth(String date) throws MonthException {
        int month;
        try {
            month = Integer.parseInt(date.substring(0, 2));
        }catch (Exception e){
            throw new MonthException();
        }
        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                throw new MonthException();
        }
        return monthName;
    }

    private static String parseDay(String date) throws DayException{
        int day;
        try {
            day = Integer.parseInt(date.substring(3, 5));
        }catch(Exception e){
            throw new DayException();
        }
        int compareDay = 0;
        int month = Integer.parseInt(date.substring(0,2));

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                compareDay = 31;
                break;
            case 4: case 6: case 11:
                compareDay = 30;
                break;
            case 2:
                compareDay = (leapYear(date))? 29:28;
        }
        if(day <= 0 || day > compareDay){
            throw new DayException();
        }
        return Integer.toString(day);
    }

    private static String parseYear(String date)throws YearException{
        int year;
        try{
            year = Integer.parseInt(date.substring(6,10));
        }catch (Exception e){
            throw new YearException();
        }
        if(year < 1000){
            throw new YearException();
        }
        if(year > 3000){
            throw new YearException();
        }
        return Integer.toString(year);
    }

    private static boolean leapYear(String date){
        int year = Integer.parseInt(date.substring(6,10));

        if(year % 4 != 0){
            return false;
        }else if(year % 100 == 0){
            if(year % 400 != 0){
                return false;
            }else{
                return true;
            }
        }else{
            return true;
        }

    }
}
