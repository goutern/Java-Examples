package com.company;

import java.awt.desktop.SystemEventListener;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Comedy comedyMovie = new Comedy();
        Action actionMovie = new Action(Movie.ratings.G, 178, "Action Time");
        Drama dramaMovie = new Drama(Movie.ratings.PG, 233, "Crazy Drama");

        Action actionMovie2 = new Action(actionMovie);

        System.out.println(actionMovie.toString());
        System.out.println(actionMovie.calcLateFees(5));
        System.out.println(actionMovie.equals(actionMovie2));

        comedyMovie.setIdNumber(12);
        comedyMovie.setRating("PG");
        comedyMovie.setTitle("Funny");
        System.out.println(comedyMovie.toString());
        System.out.println(comedyMovie.calcLateFees(5));

        System.out.println(dramaMovie.toString());
        System.out.println(dramaMovie.calcLateFees(5));


        Movie polyMovie = new Action(Movie.ratings.R, 433, "A polymorphic Movie!");
        System.out.println(polyMovie.calcLateFees(5));
    }
}
