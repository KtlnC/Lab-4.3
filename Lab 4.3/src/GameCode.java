/**Kaitlyn Cao & Lamia Islam
 * Lab 4.3 Button Games*/

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class GameCode extends Application
{
	 private int count;
	 
    public void start(Stage primaryStage) throws Exception 
    {
        primaryStage.setTitle("FastClicker");
 
        Group root = new Group();
    	Scene scene = new Scene(root, 200, 150);    	        
       
        Button button = new Button("Click Me!");
        
        button.setLayoutX(65);
        button.setLayoutY(60);
        
        button.setOnAction(value ->
        {
        	count++;
        	System.out.println(count);
        });
        
        root.getChildren().add(button);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
    	Application.launch(args);
    }
}
