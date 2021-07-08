package ucf.assignments;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    //instantiates a `Database` object

    private void add_todo_test(String new_title) {
        //calls add_todo to add a `TodoList` object to the `todoLists` array
        //check if the object is in the array by accessing it and reading the contents of the `TodoList` element
        //Affirms_equal to see if the contents of `Database` correspond with the expected values
    }

    private void rm_todo_test(String title){
        //calls rm_todo to remove the `TodoList` object added by the method above
        //then checks if the `Database` object is empty
    }

    private void display_items_test(String title){
        //calls add_todo to create a test `TodoList` object
        //then calls display_items and checks if the contents of the `TodoList` object match the expected test values
        //calls rm_todo so no entries are left in the `Database` object
    }

    private void display_incomplete_test(String title){
        //calls add_todo to create a `TodoList` object and marks it with complete = false flag
        //then calls display_incomplete and checks if the entry created above has been pulled up
        //calls rm_todo so no entries are left in the `Database` object
    }

    private void display_complete_test(String title){
        //calls add_todo to create a `TodoList` object and marks it with complete = true flag
        //then calls display_complete and checks if the entry created above has been pulled up
        //calls rm_todo so no entries are left in the `Database` object
    }

    private void save_oneTodo_test(String title, String path){
        //calls add_todo to create a test `TodoList` object
        //looks up the `TodoList` object by matching the given title
        //calls save_oneTodo(String title, String path) and saves the TodoList into a test directory
        //then checks if the directory is there and if the contents of th file match the test contents
        //deletes the test file and the test directory
        //calls rm_todo so no entries are left in the `Database` object

    }

    private void save_all_test(String path){
        //calls add_todo to create a test `TodoList` object
        //calls add_todo once more to create another test `TodoList` object
        //then calls save_all to save the entries above to a test directory
        //then checks if the directory is there and if the contents of th file match the test contents
        //deletes the test file and the test directory
        //calls rm_todo so no entries are left in the `Database` object
    }

    private void load_one_test(String path, String title){
        //calls add_todo to create a test `TodoList` object
        //creates a test directory
        //calls save_oneTodo to save the test object to a test directory
        //then calls rm_todo so no entries are left in the `Database` object
        //calls load_one to load the test object into the `Database`
        //and checks whether the contents of the object match with the test contents
        //deletes the test file and the test directory
        //calls rm_todo so no entries are left in the `Database` object
    }

    private void load_all_test(String path){
        //calls add_todo to create a test `TodoList` object
        //calls add_todo once more to create another test `TodoList` object
        //then calls save_all to save the entries above to a test directory
        //then calls rm_todo so no entries are left in the `Database` object
        //calls load_all to load the test object into the `Database`
        //and checks whether the contents of the object match with the test contents
        //deletes the test file and the test directory
        //calls rm_todo so no entries are left in the `Database` object
    }
}