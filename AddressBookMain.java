/*
* The AddressBook Program implements an application that simply
* displays the Contacts in Address Book that can be modified in certain ways.
*
* @author: Sanjana Bhandure
* @version: 1.2
* @date: 26-04-2022
*/

package com.Bridgelabz.Day09_AddressBookSystem;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static Logger logger = Logger.getLogger(AddressBookMain.class);
    static boolean isRunning = true;

    //ArrayList object is created
    ArrayList<Contacts> person = new ArrayList<Contacts>();

    //Taking input from the user
    static Scanner scanner = new Scanner(System.in);

    public void console() {
        logger.info("-----------------");
        logger.info("1. Create contact");
        logger.info("2. Exit");
        logger.info("Enter your choice: ");

        int option = scanner.nextInt();
            switch (option) {
                case 1:
                    createContacts();
                    break;

                case 2:
                    logger.info("Exit...");
                    isRunning = false;
                    break;

                default:
                    logger.info("Enter valid option: ");
                    break;
        }
    }

    /*
     * createContacts method created to create contacts with the given fields.
     */
    public void createContacts() {
        Contacts contacts = new Contacts();

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter First Name: ");
        String firstName = scanner.nextLine();
        contacts.setFirstName(firstName);

        logger.info("Enter Last Name: ");
        String lastName = scanner.nextLine();
        contacts.setLastName(lastName);

        logger.info("Enter Address: ");
        String address = scanner.nextLine();
        contacts.setAddress(address);

        logger.info("Enter City: ");
        String city = scanner.nextLine();
        contacts.setCity(city);

        logger.info("Enter State: ");
        String state = scanner.nextLine();
        contacts.setCity(state);

        logger.info("Enter zip: ");
        String zip = scanner.nextLine();
        contacts.setZip(zip);

        logger.info("Enter PhoneNumber: ");
        String phoneNumber = scanner.nextLine();
        contacts.setPhoneNumber(phoneNumber);

        logger.info("Enter Email: ");
        String email = scanner.nextLine();
        contacts.setEmail(email);

        person.add(contacts);
        logger.info("Contact Added Successfully");
        logger.info(person.toString());
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        /*
         * Displaying Welcome to Address Book Program in AddressBookMain class
         */
        logger.info("Welcome to Address Book Program!");
        //AddressBookMain object created
        AddressBookMain addressBookMain = new AddressBookMain();
        while (isRunning) {
            addressBookMain.console();
        }
    }
}
