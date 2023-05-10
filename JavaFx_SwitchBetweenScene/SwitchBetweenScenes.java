import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class SwitchBetweenScenes extends Application{
    private Scene scene1, scene2;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Label label1 = new Label("Welcome to Scene 1");
        Button nextBtn = new Button("Next");
        
        Label label2 = new Label("Welcome to Scene 2");
        Button prevBtn = new Button("Previous");
        
        nextBtn.setOnAction(e -> primaryStage.setScene(scene2));
        prevBtn.setOnAction(e -> primaryStage.setScene(scene1));
        
        VBox vbox1 = new VBox(10);
        vbox1.getChildren().addAll(label1, nextBtn);
        
        VBox vbox2 = new VBox(10);
        vbox2.getChildren().addAll(label2, prevBtn);
        
        scene1 = new Scene(vbox1, 200, 200);
        scene2 = new Scene(vbox2, 200, 200);
        
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Example of switching between scenes");
        primaryStage.show();
    }
}