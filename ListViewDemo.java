/*
List demo
*/

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.beans.value.*;
import javafx.collections.*;

public class ListViewDemo extends Application {
    
    Label response;
    
    public static void main(String[] args) {
        launch(args);
    }

    // Override start
    public void start(Stage myStage) {
        myStage.setTitle("Demonstate List View");

        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 200, 120);
        myStage.setScene(myScene);

        response = new Label("Select Computer Type");

        // Create an ObservableList of enteries for the list view
        ObservableList<String> computerTypes =
            FXCollections.observableArrayList("Smartphone", "Tablet", "Notebook", 
                                              "Desktop");

        ListView<String> lvComputers = new ListView<String>(computerTypes);
        lvComputers.setPrefSize(100, 70);

        // Optional: final void setSelectionMode(SelectionMode mode)
        // SelectionMode.MULTIPLE or SelectionMode.SINGLE
        // ie. lvComputers.setSelectionMode(SelectionMode.MULTIPLE);
        // Then use ObservableList<T> getSelectedItems() and cycle through list w for-each

        MultipleSelectionModel<String> lvSelModel = lvComputers.getSelectionModel();

        lvSelModel.selectedItemProperty().addListener( new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> changed, 
                                String oldVal, String newVal) {
                response.setText("Computer selected is " + newVal);
            }
        });

        // add all children at once
        rootNode.getChildren().addAll(lvComputers, response);

        myStage.show();
    }
}