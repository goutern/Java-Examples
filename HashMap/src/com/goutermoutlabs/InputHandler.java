package com.goutermoutlabs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputHandler {
    public String readInfo(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            return reader.readLine();
        }catch(Exception e){
            e.getMessage();
        }
        return "-1";
    }
    public String[] parseCourses(String coursesString){
        String[] courses;
        courses = coursesString.split("\\s+");
        return courses;
    }

}
