package praiseTeam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//import java.awt.Point;
//import java.util.ArrayList;
//import java.util.List;
//
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

	App window;

	public void load() {
		window = new App();
	}

	// @Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws FileNotFoundException {
		load();

		Button btn = new Button();
		btn.setText("Make new Member");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				System.out.println("Hello World!");
			}
		});

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_LEFT);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Image image1 = new Image(new FileInputStream("C:\\Users\\danie_s1veecg\\Pictures\\koninstruments.jpg"));
		grid.getChildren().add(new ImageView(image1));
		
		Text scenetitle = new Text("Welcome!");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 1);
		
		Text scenetitle2 = new Text("Please type in a member name!");
		grid.add(scenetitle2, 1, 1);
		
		Label userName = new Label("First Name:");
		grid.add(userName, 0, 2);

		final TextField fn = new TextField();
		grid.add(fn, 1, 2);
		

		Label ln = new Label("Last Name:");
		grid.add(ln, 0, 3);
		
		final TextField userTextField2 = new TextField();
		grid.add(userTextField2, 1, 3);
		String in1 = userTextField2.getText();
		
		
		final Text actiontarget = new Text();
        	grid.add(actiontarget, 2, 4);
        
		Button btn2 = new Button();
		grid.add(btn2, 1, 4);
		btn2.setText("Make new Member!");
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				actiontarget.setText("Submitted!");
				System.out.println(fn.getText() + " " + userTextField2.getText());
			}
		});
			// Create a scene and place it in the stage
		Scene scene = new Scene(grid, 800, 800);
		
		primaryStage.setTitle("Praise Team"); // Set the stage title1
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support. Not
	 * needed for running from the command line.
	 */
	public static void main(String[] args) {
		App.launch(App.class, args);
	}
}
