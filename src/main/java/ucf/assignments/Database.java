/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ucf.assignments;

import java.nio.file.Path;
import java.util.ArrayList;

class Database {
    ArrayList<TodoList> todoLists;
    Database(){ //default constructor to be called at the beginning of the program
        //todoLists = new ArrayList<TodoList>();
        //todoLists.add_todo(new TodoList("Here's your first TODO List"));
    }

    private void add_todo(String new_title){
        //creates an instance of `todoList`
        //then calls the constructor of a `TodoList` object and sets TodoList.title = new_title
        //and then appends said object to the `todoLists` ArrayList
    }

    private void rm_todo(String title){
        //pulls up a GUI prompt to confirm deletion
        //searches up the TodoList object by matching the given title with the title in the ArrayList `todoLists`
        //in case two objects found with the same title, prompts the user for choice based on the preview of contained Items
    }

    private void display_items(String title){
        //looks up the `TodoList` object by matching the given title
        //if two objects of the same title exist, gives GUI prompt to the user to make a selection based upon preview of the Items
        //then pulls up a GUI window and prints all the items using a loop into the window
    }

    private void display_incomplete(String title){
        //looks up the `TodoList` object by matching the given title
        //if two objects of the same title exist, gives GUI prompt to the user to make a selection based upon preview of the Items
        //then pulls up a GUI window and prints using a loop into the window only the items that have the `complete` flag set to false
    }

    private void display_complete(String title){
        //looks up the `TodoList` object by matching the given title
        //if two objects of the same title exist, gives GUI prompt to the user to make a selection based upon preview of the Items
        //then pulls up a GUI window and prints using a loop into the window only the items that have the `complete` flag set to true
    }

    private void save_oneTodo(String title, String path){
        //looks up the `TodoList` object by matching the given title
        //if two objects of the same title exist, gives GUI prompt to the user to make a selection based upon preview of the Items
        //takes in the `path` String and converts it to the system specific Path variable using file.Path methods
        //upon passing validation checks if the head of the text file contains a predefined signature so a random text file is not specified
        //validates of such file exists, if no, creates it
        //if yes - traverses the text file to look up the stored TodoList and overrides that entry
    }

    private void save_all(String path){
        //takes in the `path` String and converts it to the system specific Path variable using file.Path methods
        //validates if such file exists, if no, creates it; if yes - overrides.
        //if the file exists checks if the head of the text file contains a predefined signature
        //so a random text file is not overwritten
        //then traverses the structure of the `Database` object writing the elements into the corresponding text format
    }

    private void load_one(String path, String title){ //loading multiple entries is achieved by calling this method several times
        //takes in the `path` String and converts it to the system specific Path variable using file.Path methods
        //upon passing validation checks if the head of the text file contains a predefined signature so a random text file is not specified
        //validates if such file exists
        //if yes - traverses the text file to look up the stored TodoList by matching `title` and loads that entry into the `Database` structure
        //if two objects of the same title exist, gives GUI prompt to the user to make a selection based upon preview of the Items
    }

    private void load_all(String path){
        //takes in the `path` String and converts it to the system specific Path variable using file.Path methods
        //validates if such file exists
        //upon passing validation checks if the head of the text file contains a predefined signature so a random text file is not specified
        //then traverses the structure of the file assigning the elements for the corresponding variables in the
        //dynamically expanded ArrayList
    }
}
