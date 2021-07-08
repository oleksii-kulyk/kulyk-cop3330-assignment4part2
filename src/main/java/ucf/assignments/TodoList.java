/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ucf.assignments;

import java.util.ArrayList;

class TodoList {
    ArrayList<Item> items;
    String title;
    TodoList(String new_title){ //default constructor for a TodoList
        //items = new ArrayList<Item>();
        //title = new_title;
        //items.add_item(new Item("Hello, this is a blank Item"));
    }

    private void add_item(){
        //calls Item constructor and appends the Item to the ArrayList `items`
    }

    private void add_item(String default_message){
        //calls Item(default_message) constructor and appends the Item to the ArrayList `items`
        //adds a blank item with a default message inside and with the `duedate` set by LocalTime.now()
    }

    private void rm_item(){
        //pulls up a GUI dialog for confirmation
        //searches for the selected item and removes it from the ArrayList
    }

    private void edit_title(String new_title){
        //title = new_title;
    }
}
