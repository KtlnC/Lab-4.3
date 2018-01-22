/**Kaitlyn Cao & Lamia Islam
 * Lab 4.3 Button Games - FastClicker*/

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.TimerTask;

import com.sun.glass.ui.Timer;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class GameCode extends Application
{
	private int count;
	private int start = 15;
	private int time = 10;
	private int tim = 10;
	private long delay = tim * 1000;
	private long timeStep;
	private boolean scoring = true;
    @SuppressWarnings("restriction")
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
        
        root.getChildren().add(t);
        root.getChildren().add(button);
       
        
        
        primaryStage.setScene(scene);
        primaryStage.show();
        
        button.setOnAction(value ->
        {
        	if(scoring)
        	{
        	count++;
        	}
        	else
        	{
        		count--;
        	}
        	/*System.out.println(count);
        	String c = Integer.toString(count);
        	t.setText(c);*/
        	
        	
        	
        });
         timeStep = System.nanoTime() + 1000000000L;
        new AnimationTimer()
        {
        	public void handle(long now)
        	{
        		if(now>timeStep)
        		{
        			timeStep = now + 1000000000L;
        			scoring = !scoring;
        		}
        		if(!scoring)
        		{
        			button.setText("Dont Click");
        		}
        		else
        		{
        			button.setText("Click Me");
        		}
        		t.setText(Integer.toString(count));
        	}
        }.start();
        
        
    }
        
    
   
    public static void main(String[] args) throws InterruptedException
    {
    	
    	
    		Application.launch(args);
    	
    }
}
