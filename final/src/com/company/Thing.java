package com.company;

public class Thing {
    private String name;
    private double weight;

    public Thing(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Thing() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
