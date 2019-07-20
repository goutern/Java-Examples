package com.company;

public class Mammal extends Animal {
    public Mammal(String name, double weight) {
        super(name, weight);
    }

    public Mammal() {
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() +"}";
    }
}
