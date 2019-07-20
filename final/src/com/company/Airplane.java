package com.company;

public class Airplane extends Thing implements Fly {
    public Airplane(String name, double weight) {
        super(name, weight);
    }

    public Airplane() {
    }

    @Override
    public void flies() {
        System.out.println("I am a Thing and I can fly.");
    }

    @Override
    public String toString() {
        return "I am an Airplane. My name is "
                + super.getName()
                + ", My weight is "
                + super.getWeight()
                + "kgs.";
    }
}
