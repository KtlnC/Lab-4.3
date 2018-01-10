/**Kaitlyn Cao & Lamia Islam
 * Lab 4.3 Button Games*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class GameCode extends Application{
	
    public void start(Stage primaryStage) throws Exception 
    {
    
    	
        primaryStage.setTitle("FastClicker");
        
        Group root = new Group();
    	Scene scene = new Scene(root, 200, 150);    	        
    	
        Button button = new Button("Click Me!");
        Text t = new Text("0");
        t.setX(10.0f);
        t.setY(50.0f);
        
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
