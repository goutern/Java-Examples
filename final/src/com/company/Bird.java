package com.company;

public class Bird extends Animal implements  Fly {
    public Bird(String name, double weight) {
        super(name, weight);
    }

    public Bird() {
    }

    @Override
    public void flies() {
        System.out.println("I have wings and I can Fly.");
    }

    @Override
    public String toString() {
        return "I am a Bird. My name is "
                + super.getName()
                + ", My weight is "
                + super.getWeight()
                + "kgs.";
    }
}
