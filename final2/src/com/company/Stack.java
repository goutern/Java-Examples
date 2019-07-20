package com.company;

import java.util.ArrayList;

public class Stack<T> {
    ArrayList<T> stack = new ArrayList<>();

    public void push(T item){
        stack.add(item);
        System.out.println("Added " + item.toString() +" to the stack");
    }
    public T pop(){
        if(stack.isEmpty()){
            System.out.println("Nothing to pop");
            return null;
        }
        System.out.println("Popped " + stack.get(stack.size() -1).toString());
        return stack.remove(stack.size() -1);
    }

    public T peak(){
        if(stack.isEmpty()){
            System.out.println("Nothing to peek");
            return null;
        }
        System.out.println("Peeked " + stack.get(stack.size() -1).toString());
        return stack.get(stack.size() -1);
    }
}
