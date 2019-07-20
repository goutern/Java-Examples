package com.company;

public class Bat extends Mammal implements Fly{
    public Bat(String name, double weight) {
        super(name, weight);
    }

    public Bat() {
    }

    @Override
    public void flies() {
        System.out.println("I am a mammal and I can fly.");
    }

    @Override
    public String toString() {
        return "I am a mammal. My name is "
                + super.getName()
                + ", My weight is "
                + super.getWeight()
                + "kgs.";
    }
}
