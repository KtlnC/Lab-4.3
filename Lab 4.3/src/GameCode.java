/**Kaitlyn Cao & Lamia Islam
 * Lab 4.3 Button Games*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class GameCode extends Application{
	
    public void start(Stage primaryStage) throws Exception 
    {
        primaryStage.setTitle("My First JavaFX App");
        
        Button button = new Button("Click Me!");
        
        Scene scene = new Scene(button, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
    	Application.launch(args);
    }

}
