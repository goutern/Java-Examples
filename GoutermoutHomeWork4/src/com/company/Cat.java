package com.company;

public class Cat extends Pet{

    public Cat(String initialName, int initialAge, double initialWeight) {
        super(initialName, initialAge, initialWeight);
    }

    public Cat(String initialName) {
        super(initialName);
    }

    public Cat(int intitialAge) {
        super(intitialAge);
    }

    public Cat(double initialWeight) {
        super(initialWeight);
    }

    public Cat() {
    }

    @Override
    public double acepromazine(){
        double dose;
        dose = super.calcDose(super.getWeight(), .002,10);
        return dose;
    }

    @Override
    public double carprofen(){
        double dose;
        dose = super.calcDose(super.getWeight(), 0.25,12);
        return dose;
    }

    @Override
    public String toString() {
        return super.toString() +" Cat{" +
                "acepomazineDose=" + acepromazine() +
                ", carprofenDose=" + carprofen() +
                '}';
    }
}
