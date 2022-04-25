/*
* The AddressBook Program implements an application that simply
* displays the Contacts in Address Book that can be modified in certain ways.
*
* @author: Sanjana Bhandure
* @version: 1.0
* @date: 26-04-2022
*/

package com.Bridgelabz.Day09_AddressBookSystem;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class AddressBookMain {
    public static Logger logger = Logger.getLogger(AddressBookMain.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
        /*
         * Displaying Welcome to Address Book Program in AddressBookMain class
         */
        logger.info("Welcome to Address Book Program!");
    }
}
