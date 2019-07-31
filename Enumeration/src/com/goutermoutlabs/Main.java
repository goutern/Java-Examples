package com.goutermoutlabs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] names = {"nick","jon", "richard","frank"};
        NameCollection nameCollection = new NameCollection(names);

        Enumeration enumerate = nameCollection.getEnumeration();

        while(enumerate.hasNext()){
            System.out.println(enumerate.getNext());
        }
    }
}
