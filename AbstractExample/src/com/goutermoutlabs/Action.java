package com.company;

public class Action extends Movie {

    public Action(Enum<ratings> rating, int idNumber, String title) {
        super(rating, idNumber, title);
    }

    public Action(Action movie) {
        super(movie);
    }

    @Override
    public double calcLateFees(int days){
        double v = days * 3.0;
        return v;
    }
}
