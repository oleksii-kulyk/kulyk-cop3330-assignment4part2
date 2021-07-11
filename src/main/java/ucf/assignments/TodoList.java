/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ucf.assignments;

import javafx.scene.control.ListView;
import java.util.ArrayList;

class TodoList {
    ArrayList<Item> items;
    //ListView<String> viewItems;
    String title;

    //default constructor for a TodoList
    TodoList(String new_title){
        items = new ArrayList<Item>();
        //viewItems = new ListView<String>();
        title = new_title;
        add_item("Hello, this is a blank Item");
    }



    void add_item(){
        items.add(new Item());
    }

    void add_item(String default_message){
        Item newItem = new Item(default_message);       //creates an Item with a default message and duedate of LocalTime.now()
        items.add(newItem);                             //appends the above Item to the ArrayList of Items of this TodoList
        //viewItems.getItems().add(newItem.description);  //adds the description of the above Item to be displayed by viewItems ListView
    }

    void rm_item(){
        //pulls up a GUI dialog for confirmation
        //searches for the selected item and removes it from the ArrayList
    }

    void edit_title(String new_title){
        //title = new_title;
    }
}
