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
        	
        	count++;
        	System.out.println(count);
        	String c = Integer.toString(count);
        	t.setText(c);
        	
        	
        	
        });
        
    	}
        
    
    public static void time()
    {
    	Thread thread = new Thread();
    	for(int i = 10;i>=0;i--)
    	{
    		try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		System.out.println(i);
    	}
    }
    public static void main(String[] args) throws InterruptedException
    {
    	Timing timer = new Timing(10);
    	timer.doSomething();
    	while(timer.getSeconds()>0)
    	{
    		Application.launch(args);
    	}
    }
}
