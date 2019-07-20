package com.company;

public class Main {

    public static void main(String[] args) {
        Dog fido = new Dog();
        Dog spot = new Dog("Spot");
        Dog pluto = new Dog(10);
        Dog goofy = new Dog(100.5);
        Dog spike = new Dog("Spike", 8, 50.8);

        fido.set("Fido", 1, 15.5);
        System.out.println(fido.toString());

        spot.setAge(12);
        spot.setWeight(60.3);
        System.out.println(spot.toString());

        pluto.setName("Pluto");
        pluto.setWeight(120.2);
        System.out.println(pluto.toString());

        goofy.setName("Goofy");
        goofy.setAge(45);
        System.out.println(goofy.toString());

        spike.toString();



        Cat fry = new Cat();
        Cat leela = new Cat("Leela");
        Cat bender = new Cat(3);
        Cat amy = new Cat(15.6);
        Cat hermes = new Cat("Hermes", 4, 28.7);

        fry.set("Fry", 13, 19.9);
        System.out.println(fry.toString());

        leela.setAge(14);
        leela.setWeight(14.4);
        System.out.println(leela.toString());

        bender.setName("Bender");
        bender.setWeight(17.7);
        System.out.println(bender.toString());

        amy.setName("Amy");
        amy.setAge(6);

        System.out.println(hermes.toString());


    }

    public int findMax(int[] ints){
        int maxValue = Integer.MIN_VALUE;
        for(int i : ints){
            if(i > maxValue){
                maxValue = i;
            }
        }
        return maxValue;

    }
}
