/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ucf.assignments;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class FXMLController implements Initializable {

    @FXML
    private ListView<String> TODOList;
    @FXML
    private Text todoTitle;
    @FXML
    private Button addTODO;
    @FXML
    private Button rmTODO;
    @FXML
    private Button saveTODO;
    @FXML
    private ListView<String> itemList;
    @FXML
    private Button addITEM;
    @FXML
    private Button rmITEM;

    ArrayList<String> getItems(TodoList todoList){
        ArrayList<String> descriptions = new ArrayList<String>();
        for(int i = 0; i < todoList.items.size(); i++){
            descriptions.add(todoList.items.get(i).description);
        }
        return descriptions;
    }
/*
    private void addItem(TodoList todoList){
        todoList.add_item();

    }
*/
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Database data = new Database();
        itemList.getItems().addAll(getItems(data.todoLists.get(0)));
    }

}