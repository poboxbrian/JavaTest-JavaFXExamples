/*
Skeleton program
*/

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class JavaFXSkel extends Application {
    public static void main(String[] args) {
        System.out.println("Launching JavaFX application");
        
        // Start the JavaFX app by calling launch()
        launch(args);
    }

    // Override the init() method
    public void init() {
        System.out.println("Inside the init() method.");
    }

    // Override the start method
    public void start(Stage myStage) {
        System.out.println("Inside the start() method");

        myStage.setTitle("JavaFX Skeleton");

        // Create a root node.  In this case, using a flow layout
        FlowPane rootNode = new FlowPane();

        // Create a scene
        Scene myScene = new Scene(rootNode, 300, 200);

        // Set the scene on the stage   
        myStage.setScene(myScene);

        myStage.show();
    }

    // Override the stop() method
    public void stop() {
        System.out.println("Inside the stop() method.");
    }
}