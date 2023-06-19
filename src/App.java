import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

// launch -> app , set everything up -> then calls start


public class App extends Application{ // implements means we are using an interface

    Button button;

    public static void main(String[] args){ // first thing called when program is launched
        launch(args); // goes into Applicaion class and build a Javafx app
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
         primaryStage.setTitle("Title of the Window"); 
         button = new Button();
        button.setText("Click me");
      button.setOnAction(e->System.out.println("hello world") ); // lambda expression (e is the event")) , similiar to js es6 arrow function

        StackPane layout = new StackPane();
        layout.getChildren().add(button); // gets all children and adds button to list

        Scene scene = new Scene(layout, 300, 250); // scene is the window
        primaryStage.setScene(scene); // sets the scene on stage / window
        primaryStage.show(); // shows the window (displays to user)
    }

 
}