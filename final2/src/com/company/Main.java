package com.company;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        stringStack.push("Nick");
        stringStack.push("Jon");
        stringStack.push("Greg");
        stringStack.push("Chuck");
        stringStack.peak();
        stringStack.pop();
        stringStack.peak();

        integerStack.push(17);
        integerStack.push(23);
        integerStack.push(18);
        integerStack.push(40);
        integerStack.peak();
        integerStack.pop();
        integerStack.peak();




    }
}
