/*
Skeleton program + buttons & events
*/

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class JavaFXEventDemo extends Application {
    
    Label response;
    public static void main(String[] args) {
        launch(args);
    }

    // Override start
    public void start(Stage myStage) {
        myStage.setTitle("Use JavaFX Buttons and Events");

        // horizontal and vertical gaps of 10
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 300, 100);
        myStage.setScene(myScene);

        response = new Label("Push a Button");
        
        Button btnUp = new Button("Up");
        Button btnDown = new Button("Down");
        Button btnRun = new Button("Run");
        Button btnExit = new Button("Exit");

        /* Could choose to use a lambda expression here instead
        btnUp.setOnAction( (ae) ->
            response.setText("You pressed Up.")
        );

        ie. see run and exit
        */
        btnUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent ae) {
                response.setText("You pressed Up.");
            }
        });
        btnDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent ae) {
                response.setText("You pressed Down.");
            }
        });
        btnRun.setOnAction( (ae) -> response.setText("You pressed Run.") );
        btnExit.setOnAction( (ae) -> Platform.exit() );

        // add all children at once
        rootNode.getChildren().addAll(btnUp, btnDown, btnRun, btnExit, response);

        myStage.show();
    }
}