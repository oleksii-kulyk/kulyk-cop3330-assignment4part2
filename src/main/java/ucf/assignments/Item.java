/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ucf.assignments;

import java.time.LocalDate;

class Item {
String description;
/*
I will be using java.time.LocalDate to store the due date and LocalDate.parse to enter the date into the system.
We need a method that will prompt user to enter data into the fields and a method to validate the entry
 */
LocalDate duedate; //<YYYY-MM-DD>
//Can be represented as a simple checkmark in the GUI
boolean complete;

    //creates an `Item` object and prompts the user to enter the description and the due date
    Item(){
        complete = false;
        //set_description();
        //set_duedate();
    }

    //creates a default blank Item
    Item(String default_message){
        complete = false;
        description = default_message;
        duedate = LocalDate.now();
    }

    String get_description(){
        return description;
    }

    LocalDate get_duedate(){
        return duedate;
    }

    private void set_description(String description){
        this.description = description;
        //creates an overlay dialog that displays the description stored in the Item
        //then lets the user enter or edit the description for the Item
        //the entered text is then stored as a String and assigned to the `description` variable
    }

    private void set_duedate(LocalDate duedate){
        this.duedate = duedate;
        //creates an overlay dialog with three separate fields <YYYY>, <MM>, <DD> that prompts to enter the date as integers
        //three fields are then validated to see if a user entered an integer
        //each field is then assigned to a separate variable and the date is stored within `duedate` using `LocalDate.of()`
    }

    private void set_complete(){
        //watches for a checked check mark in the GUI
        //once the check mark is checked it does: `complete = true`
    }

}
