package com.goutermoutlabs;

public class Main {

    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add(10, "X");
        q.add(1, "Y");
        q.add(3, "Z");
        System.out.println(q.remove()); // returns X
        System.out.println(q.remove()); // returns Z
        System.out.println(q.remove()); // returns Y
    }
}
