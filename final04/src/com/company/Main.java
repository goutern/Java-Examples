package com.company;

import java.io.*;
import java.util.HashMap;

public class Main {
    static HashMap<String, Tree> treesDatabase = new HashMap<>();

    public static void main(String[] args) {
        File trees = new File("tree.txt");
        readFile(trees);
        boolean exit = false;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to the Tree Database");
        while (!exit) {
	        System.out.println("Enter a tree name(quit to exit):");
	        String name;
	        try{
                name = read.readLine();
            }catch(Exception e){
	            System.out.println("Error in name entry");
	            continue;
            }
            if(name.equals("quit")){
                exit = true;
                continue;
            }
            searchHash(name);
        }
    }

    private static void readFile(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String name;

            while ((name = reader.readLine()) != null) {
                Tree tree = new Tree();
                tree.setName(name);
                tree.setFoliage(reader.readLine());
                tree.setFruitType(reader.readLine());
                tree.setHeight(Integer.parseInt(reader.readLine()));
                tree.setShape(reader.readLine());
                treesDatabase.put(tree.getName(), tree);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void searchHash(String enteredName) {
        for(String name :treesDatabase.keySet()){
            if(enteredName.equals(name)){
                System.out.println(treesDatabase.get(name).toString());
                return;
            }
        }
        System.out.println("No tree with name '" + enteredName + "' was found");
    }
}
