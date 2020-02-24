package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList contacts = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int opt = 0;
        int contactsCount = 1;
        while (opt != 5) {
            printMenu();
            opt = scanner.nextInt();
            switch (opt) {
                case 1: {
                    char option = 'y';
                    char emailOption = 'n';
                    String firstName = "";
                    String lastName = "";
                    String contact = "";
                    ArrayList<String> conts = new ArrayList<String>();
                    String email = "";
                    System.out.println("You have chosen to add a new contact: \n" +
                            "Please enter the name of the Person\n");
                    System.out.print("First Name: ");
                    firstName = scanner.next();
                    System.out.print("Last Name: ");
                    lastName = scanner.next();
                    System.out.print("Contact Number: ");
                    contact = scanner.next();
                    conts.add(contact);
                    while(option != 'n'){
                        System.out.print("Would you like to add another contact number? (y/n):");
                        option = scanner.next().charAt(0);
                        if(option == 'y'){
                            System.out.print("Contact Number: ");
                            contact = scanner.next();
                            conts.add(contact);
                        }
                    }
                    System.out.print("Would you like to add email address? (y/n):");
                    emailOption = scanner.next().charAt(0);
                    if(emailOption == 'y'){
                        System.out.print("Email Address: ");
                        email = scanner.next();
                        contacts.insert(contactsCount,new Person(firstName,lastName,conts,email));
                        contactsCount++;
                    }
                    else{
                     contacts.insert(contactsCount,new Person(firstName,lastName,conts));
                     contactsCount++;
                    }
                    break;
                }
                case 2:{
                    contacts.sort();
                    System.out.println("---Here are all your contacts---");
                    Node temp = contacts.head;
                    while(temp.getNext()!=null){
                        System.out.print(temp.getData().toString());
                        temp = temp.getNext();
                    }
                    System.out.print(temp.getData().toString());
                    break;
                }
                case 3:{
                    String name;
                    boolean searchFlag = false;
                    System.out.print("You could search for a contact from their first names: ");
                    name = scanner.next();
                    Node temp = contacts.head;
                    while(temp.getNext()!=null){
                        if(temp.getData().getfirstName().equals(name)){
                            System.out.println("1 match found!");
                            System.out.println(temp.getData().toString());
                            searchFlag = true;
                        }
                        temp = temp.getNext();
                    }
                        if(temp.getData().getfirstName().equals(name)) {
                            System.out.println("1 match found!");
                            System.out.println(temp.getData().toString());
                            searchFlag = true;
                        }
                        if(!searchFlag){
                            System.out.println("NO RESULTS FOUND!");
                        }
                    break;
                }
                case 4:{
                    System.out.print("Here are all your contacts: \n");
                    boolean deleteFlag = false;
                    Node temp = contacts.head;
                    int num=0;
                    while (temp.getNext()!=null){
                        System.out.println(temp.getIndex()+"\t"+temp.getData().getfirstName()+" "+temp.getData().getLastName());
                        temp = temp.getNext();
                    }
                    System.out.print(temp.getIndex()+"\t"+temp.getData().getfirstName()+" "+temp.getData().getLastName());
                    System.out.print("\nPress the number against the contact to delete it: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                    temp = contacts.getHead();
                    Node tempPrevious = contacts.getHead();
                    while (temp.getNext()!=null){
                        if(temp.getIndex() == num){
                            tempPrevious.setNext(temp.getNext());
                            deleteFlag = true;
                            break;
                        }
                        tempPrevious = temp;
                        temp = temp.getNext();
                    }
                    if(temp.getIndex() == num){
                        tempPrevious.setNext(temp.getNext());
                        deleteFlag = true;
                        break;
                    }
                    if(!deleteFlag){
                        System.out.println("Reffered Number Not Found");
                    }
                    System.out.println(temp.getData().getfirstName()+" "+temp.getData().getLastName()+"'s"+" contact deleted from list!");
                }
                case 5:{
                    opt = 5;
                    break;
                }
                default:{
                    System.out.println("Invalid Option");
                }
            }
        }
    }

    static void printMenu() {
        System.out.println("Welcome to DBC's Contact List App\n" +
                "Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to exit program");
        System.out.print("Enter your Input : ");
    }
}
