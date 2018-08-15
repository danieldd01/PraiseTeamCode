package praiseTeam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//import java.awt.Point;
//import java.util.ArrayList;
//import java.util.List;
//
import javafx.*;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class App extends Application {

	App window;

	public void load() {
		window = new App();
	}

	// @Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws FileNotFoundException {
		int pos = 0;

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
		// grid.getChildren().add(new ImageView(image1));

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

		Label email = new Label("Email:");
		grid.add(email, 0, 4);

		final TextField emailField = new TextField();
		grid.add(emailField, 1, 4);

		Label phoneNum = new Label("Phone #:");
		grid.add(phoneNum, 0, 5);

		final TextField phoneNumField = new TextField();
		grid.add(phoneNumField, 1, 5);

		CheckBox cInYG = new CheckBox("In Youth Group?");
		grid.add(cInYG, 0, 6);
		/*
		 * BackgroundImage myBI= new BackgroundImage(new
		 * Image("file:\\C:\\Users\\danie_s1veecg\\Pictures\\koninstruments.jpg",800,800
		 * ,false,false), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
		 * BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT); grid.setBackground(new
		 * Background(myBI));
		 */

		// CheckBox cb1 = new CheckBox("Piano");
		// CheckBox cb2 = new CheckBox("Guitar");
		// CheckBox cb3 = new CheckBox("Drums");
		// CheckBox cb4 = new CheckBox("Bass guitar");
		// CheckBox cb5 = new CheckBox("Vocal");
		//
		// CheckBox[] checkboxes = { cb1, cb2, cb3, cb4, cb5 };
		// grid.add(cb1, 0, 7);
		// grid.add(cb2, 0, 8);
		// grid.add(cb3, 0, 9);
		// grid.add(cb4, 0, 10);
		// grid.add(cb5, 0, 11);

		Label Instruments = new Label("Instrument Type:");
		grid.add(Instruments, 0, 7);

		final ToggleGroup tg = new ToggleGroup();
		RadioButton r1 = new RadioButton("Piano");
		r1.setUserData("Piano");
		r1.setToggleGroup(tg);

		RadioButton r2 = new RadioButton("Guitar");
		r2.setUserData("Guitar");
		r2.setToggleGroup(tg);

		RadioButton r3 = new RadioButton("Drums");
		r3.setUserData("Drums");
		r3.setToggleGroup(tg);

		RadioButton r4 = new RadioButton("Bass guitar");
		r4.setUserData("Bass guitar");
		r4.setToggleGroup(tg);

		RadioButton r5 = new RadioButton("Vocal");
		r5.setUserData("Vocal");
		r5.setToggleGroup(tg);
		VBox box = new VBox(20, r1, r2, r3, r4, r5);

		grid.add(box, 0, 8);
		RadioButton selectedRadioButton = (RadioButton) tg.getSelectedToggle();
		// String temp = (String) tg.getSelectedToggle().getUserData();
		// tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
		// public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle,
		// Toggle new_toggle) {
		// if (tg.getSelectedToggle() != null) {
		// final String temp = (String) tg.getSelectedToggle().getUserData();
		// }
		// }
		// });
		System.out.print(selectedRadioButton);

		Slider slider = new Slider();
		slider.setMin(0);
		slider.setMax(10);
		slider.setValue(0);
		slider.setMinorTickCount(0);
		slider.setMajorTickUnit(1);
		slider.setSnapToTicks(true);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);

		slider.setLabelFormatter(new StringConverter<Double>() {

			public String toString(Double n) {
				if (n <= 1)
					return "Novice";
				if (n <= 3)
					return "Intermediate";
				if (n <= 5)
					return "Advanced";

				return "Expert";
			}

			public Double fromString(String s) {
				switch (s) {
				case "Novice":
					return 0d;
				case "Intermediate":
					return 1d;
				case "Advanced":
					return 2d;
				case "Expert":
					return 3d;

				default:
					return 3d;
				}
			}
		});

		grid.add(slider, 0, 12);

		final Text actiontarget = new Text();
		grid.add(actiontarget, 2, 14);

		Button btn2 = new Button();
		grid.add(btn2, 1, 13);
		btn2.setText("Make new Member!");
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				actiontarget.setText("Submitted!");
				RadioButton selectedRadioButton = (RadioButton) tg.getSelectedToggle();
//				switch (selectedRadioButton) {
//				case "Piano":
//					System.out.println("PIANO SELECTED");
//					break;
//				case "Guitar":
//					System.out.println("PIANO SELECTED");
//					break;
//
//				}

				// }
				// Person newPerson = System.out.println(fn.getText() + " " +
				// userTextField2.getText());

			}
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(grid, 800, 800);

		primaryStage.setTitle("Praise Team"); // Set the stage title1
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		App.launch(App.class, args);
	}
}
