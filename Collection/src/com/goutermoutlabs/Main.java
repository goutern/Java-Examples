package com.goutermoutlabs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class Main {
    static File moviesFile = new File("movies.txt");
    static HashMap movies = new HashMap<String, int[]>();

    public static void main(String[] args) {
	// write your code here
        readFile(moviesFile, movies);
        movies.forEach((key, value) -> {
            int[] ratings = (int[])value;
            double average = ratings[1]/(double)ratings[0];
            System.out.println(key);
            System.out.println("Reviews " + ratings[0] + "  Average Rating " +average +"/5");
        });

    }
    private static void readFile(File file, HashMap movies){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            int count = 0;
            int i = 0;
            //name = line.split("\\s+");
            while ((line = reader.readLine()) != null){
                if(count == 0){
                    count ++;
                    continue;
                }
                String name = "";
                int rating = 0;
                int[] ratings = new int[2];
                name = line;
                rating = Integer.parseInt(reader.readLine());

                if(movies.containsKey(name)){
                    ratings =  (int[])movies.get(name);
                    ratings[0] += 1;
                    ratings[1] += rating;
                }else {
                    ratings[0] = 1;
                    ratings[1] = rating;
                }
                movies.put(name, ratings);
                count ++;
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
