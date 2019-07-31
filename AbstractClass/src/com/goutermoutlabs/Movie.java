package com.goutermoutlabs;

public abstract class Movie {
    private String rating;
    private int idNumber;
    private String title;
    public enum ratings{G,PG,PG13,R}

    public Movie(){};

    public Movie(Enum<ratings> ratingsEnum, int idNumber, String title) {
        this.rating = ratingsEnum.toString();
        this.idNumber = idNumber;
        this.title = title;
    }

    public Movie(Movie movie){
        this.setTitle(movie.getTitle());
        this.setIdNumber(movie.getIdNumber());
        this.setRating(movie.getRating());
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double calcLateFees(int days){
        double v = days * 2.0;
        return v;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return idNumber == movie.idNumber;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating='" + rating + '\'' +
                ", idNumber=" + idNumber +
                ", title='" + title + '\'' +
                '}';
    }
}
