package com.company;

public class Main {

    public static void main(String[] args) {
        Fly[] flies = new Fly[3];
        flies[0] = new Bird("Peacock", 5);
        flies[1] = new Bat("Bumblebee bat", 2);
        flies[2] = new Airplane("Boeing 777", 351500);

        for(Fly flyer: flies){
            System.out.println(flyer.toString());
            flyer.flies();
        }
    }
}
