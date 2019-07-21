package com.company;

public class MonthException extends Exception {
    MonthException(){
        super("You entered an incorrect month, please re-enter");
    }
}

