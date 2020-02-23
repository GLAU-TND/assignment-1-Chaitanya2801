package main;

import contact.ContactList;
import contact.Person;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactList contactList = new ContactList();
        String FirstName;
        String LastName;
        String[] contactNumber = new String[3];
        String email;
        boolean flag;
        while (flag = true) {
            System.out.println("Welcome to Chaitanya contact list");
            System.out.println("Press 1 to add a new contact\n " +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program");
            int number = scanner.nextInt();
        }
    }
}
