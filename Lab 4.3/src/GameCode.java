/**Kaitlyn Cao & Lamia Islam
 * Lab 4.3 Button Games - FastClicker*/

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.Label;
import java.awt.event.ActionEvent;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class GameCode extends Application
{
	private int count;

	private static final Integer STARTIME = 10;
	private Timeline timeline;
	private Label timerLabel = new Label();
	private Integer timeSeconds = STARTIME;

    public void start(Stage primaryStage) throws Exception 
    {
    
    	
        primaryStage.setTitle("FastClicker");
        
        Group root = new Group();
    	Scene scene = new Scene(root, 200, 150);    	        
    	
        Button button = new Button("Click Me!");
        
        button.setLayoutX(65);
        button.setLayoutY(60);
        Text t = new Text("0");
        t.setX(10.0f);
        t.setY(50.0f);
        button.setOnAction(value ->
        {
        	count++;
        	System.out.println(count);
        	String c = Integer.toString(count);
        	t.setText(c);
        	
        });
        
        
        
      
       
        root.getChildren().add(t);
        root.getChildren().add(button);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
    	Application.launch(args);
    }
}
