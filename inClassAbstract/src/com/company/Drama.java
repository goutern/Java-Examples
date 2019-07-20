package com.company;

public class Drama extends Movie{
    public Drama() {
    }

    public Drama(Enum<ratings> rating, int idNumber, String title) {
        super(rating, idNumber, title);
    }

    public Drama(Drama movie){
        super(movie);
    }

    @Override
    public double calcLateFees(int days){
        double v = days * 2.0;
        return v;
    }
}
