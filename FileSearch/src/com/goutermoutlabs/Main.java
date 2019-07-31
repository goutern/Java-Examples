package com.goutermoutlabs;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File root = new File("/home/");
        System.out.println(search(root, "seatMap.dat"));
    }

    public static String search(File currentPath, String target){
        for(File file : currentPath.listFiles()) {
            if(file.getName().startsWith(".")){
                continue;
            }
            if(file.isDirectory()) {
                String result = search(file, target);
                if(!result.equals("File Not Found")){
                    return result;
                }
            }else if(file.getName().equals(target)) {
                    return file.getPath();
            }
        }
        return "File Not Found";
    }
}
