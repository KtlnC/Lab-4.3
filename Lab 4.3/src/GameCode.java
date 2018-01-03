/**Kaitlyn Cao & Lamia Islam
 * Lab 4.3 Button Games*/
import java.awt.Color;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class GameCode extends Application{
	
    public void start(Stage primaryStage) throws Exception 
    {
        primaryStage.setTitle("My First JavaFX App");
 
        Group root = new Group();
    	Scene scene = new Scene(root, 200, 150);
    	//scene.setFill(Color.LIGHT_GRAY);
    	        
       
        Button button = new Button("Click Me!");
        
        /*
        Scene scene = new Scene(button, 100, 50);
        primaryStage.setScene(scene);
        */
        root.getChildren().add(button);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
    	Application.launch(args);
    }

}
