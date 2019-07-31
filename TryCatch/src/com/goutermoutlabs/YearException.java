package com.goutermoutlabs;

public class YearException extends Exception {
    YearException(){
        super("You entered an incorrect year, please re-enter");
    }
}
