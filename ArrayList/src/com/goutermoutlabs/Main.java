package com.goutermoutlabs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * This class runs that UI, add, delete and basic search.
 */
public class Main {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        boolean exit = false;
        boolean inputValid = false;

        StringBuilder sb = new StringBuilder();
        sb.append("\n\nPlease select an option\n")
                .append("1.) Add a contact\n")
                .append("2.) Display Contacts\n")
                .append("3.) Search for a contact\n")
                .append("0.) Exit");
        while (!exit) {
            int userChoice = -1;
            System.out.println(sb.toString());
            inputValid = false;
            while(!inputValid) {
                try {
                    userChoice = Integer.parseInt(input.readLine());
                    inputValid = true;
                } catch (Exception e) {
                    System.out.println("Please enter a valid int\n");
                }
            }

            switch (userChoice){
                case 1: addContact();
                break;
                case 2: displayContacts();
                break;
                case 3: searchContacts();
                break;
                case 0: exit = true;
            }
        }
    }


    /**
     * Reads in input for a contact, creates it and adds it to the array list
     */
    public static void addContact(){
        boolean inputValid = false;
        String firstName = "";
        String lastName = "";
        String phone = "";
        String email = "";



        while(!inputValid) {
            try {
                System.out.println("Please enter the first name");
                firstName = input.readLine();
                System.out.println("Please enter the last name");
                lastName = input.readLine();
                System.out.println("Please enter the phone number");
                phone = input.readLine();
                System.out.println("Please enter the email");
                email = input.readLine();
                inputValid = true;
            } catch (Exception e) {
                System.out.println("Please enter a valid string\n");
            }
        }
        contacts.add(new Contact(firstName,lastName,phone,email));

    }


    /**
     * Displays all contacts
     */
    public static void displayContacts(){
        for(Contact contact : contacts){
            System.out.println(contact.toString());
        }
    }


    /**
     * Basic case sensitive search for contacts
     */
    public static void searchContacts(){
        boolean inputValid = false;
        String searchTerm = "";
        char removeItem = ' ';
        while(!inputValid) {
            try {
                System.out.println("Please your search term(case sensitive)");
                searchTerm = input.readLine();
                inputValid = true;
            } catch (Exception e) {
                System.out.println("Please enter a valid string\n");
            }
        }
        for(Contact contact : contacts){
            if(contact.toString().contains(searchTerm)){
                System.out.print("Match Found!\n");
                System.out.println(contact.toString());
                System.out.println("\nRemove this contact? (Y/N)");
                inputValid = false;

                while(!inputValid) {
                    try {
                        removeItem = input.readLine().toUpperCase().charAt(0);
                        inputValid = true;
                    } catch (Exception e) {
                        System.out.println("Please enter a valid string\n");
                    }
                    if(removeItem != 'Y' && removeItem !='N'){
                        inputValid = false;
                        System.out.println("Please enter Y or N");
                    }
                }
                if(removeItem == 'Y'){
                    contacts.remove(contact);
                }
            }
            if (contacts.isEmpty()){
                break;
            }
        }

    }
}
