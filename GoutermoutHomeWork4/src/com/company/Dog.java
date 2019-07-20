package com.company;

public class Dog extends Pet{

    public Dog(String initialName, int initialAge, double initialWeight) {
        super(initialName, initialAge, initialWeight);
    }

    public Dog(String initialName) {
        super(initialName);
    }

    public Dog(int intitialAge) {
        super(intitialAge);
    }

    public Dog(double initialWeight) {
        super(initialWeight);
    }

    public Dog() {
    }

    @Override
    public double acepromazine(){
        double dose;
        dose = super.calcDose(super.getWeight(), .03,10);
        return dose;
    }

    @Override
    public double carprofen(){
        double dose;
        dose = super.calcDose(super.getWeight(), .5,12);
        return dose;
    }

    @Override
    public String toString() {
        return super.toString() +"Dog{" +
                "acepomazineDose=" + acepromazine() +
                ", carprofenDose=" + carprofen() +
                '}';
    }
}
