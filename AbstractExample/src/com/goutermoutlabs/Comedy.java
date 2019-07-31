package com.goutermoutlabs;

public class Comedy extends Movie{

    public Comedy() {
    }

    public Comedy(Enum<ratings> rating, int idNumber, String title) {
        super(rating, idNumber, title);
    }

    public Comedy(Comedy movie){
        super(movie);
    }

    @Override
    public double calcLateFees(int days){
        double v = days * 2.5;
        return v;
    }
}
