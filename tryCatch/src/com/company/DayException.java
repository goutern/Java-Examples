package com.company;

public class DayException extends Exception {
    DayException(){
        super("You entered an incorrect day, please re-enter");
    }
}
