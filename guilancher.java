
import java.time.Duration;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


public class guilancher extends Application {

	@Override
	public void start(Stage PrimaryStage) throws Exception {
		

		
		// stage one setup
		
		// Insert initializing of buttons here
		Text banner = new Text("L@undry V13w");
		banner.setFill(Color.GREEN);
		banner.setStyle("-fx-font: 34 arial;");
		Text spacer = new Text(" ");
		Text line = new Text("__________________________________");
		line.setStyle("-fx-font: 34 arial;");
		line.setFill(Color.WHITE);
		Text infoTxt = new Text("Please select desired laundry room from the dropdown");
		infoTxt.setStyle("-fx-font: 34 arial;");
		
		ComboBox slectRoom = new ComboBox();
		slectRoom.getItems().addAll("Pit");
		slectRoom.setValue("Select Room");
		// top navagation buttons
		Button Go = new Button();
		Go.setText("Help"); 
		
		Button info = new Button();
		info.setText("About");
		
		//begin seting enviorment
		GridPane root = new GridPane();
		Scene scene  =new Scene(root, 1280, 720);
		root.add(banner, 0,0);
		root.add(spacer, 1, 1);
		root.add(slectRoom, 2, 2);
		root.add(line, 2, 0);
		root.add(Go, 3, 0);
		root.add(info,4 , 0);
		root.add(infoTxt, 2, 3);
		
	
		
		////////////////////////////////////////////////////////////
		//stage two set up. 
		// Insert initializing of buttons here
				
		Text banner2 = new Text("L@undry V13w");
		banner2.setFill(Color.GREEN);
		banner2.setStyle("-fx-font: 34 arial;");
		Text spacer2 = new Text(" ");
		Text line2 = new Text("__________________________________");
		line2.setStyle("-fx-font: 34 arial;");
		line2.setFill(Color.WHITE);
		Text washer = new Text("Washers");
		washer.setStyle("-fx-font: 20 arial;");
		Text dryer = new Text("Dryers");
		dryer.setStyle("-fx-font: 20 arial;");
		Text Wcount = new Text("W1-58");
		Text Dcount = new Text("D1-00");
		
		
		
		ComboBox slectRoom2 = new ComboBox();
		slectRoom2.getItems().addAll("Pit");
		slectRoom2.setPromptText("Current Room: Pit");
		// top navagation buttons
		Button Go2 = new Button();
		Go2.setText("Help"); 
		
		Button info2 = new Button();
		info2.setText("About");
		Button mapMode =new Button();
		mapMode.setText("Map Mode");
				//begin seting enviorment
				GridPane root2 = new GridPane();
				Scene scene2  =new Scene(root2, 1280, 720);
				root2.add(banner2, 0,0);
				root2.add(spacer2, 1, 1);
				root2.add(slectRoom2, 2, 2);
				root2.add(line2, 2, 0);
				root2.add(Go2, 3, 0);
				root2.add(info2,4 , 0);
				root2.add(washer, 1, 3);
				root2.add(dryer, 3, 3);
				root2.add(mapMode, 3, 2);
				root2.add(Wcount, 1, 4);
				root2.add(Dcount, 3, 4);
		
		///////////////////////////////////////////////////////////
		
		
		PrimaryStage.setTitle("l@undry v13w");
		PrimaryStage.setScene(scene); 
		PrimaryStage.show();
		////////////////////////////////////////////////
		// Action handelers
		
	
		
		slectRoom.setOnAction(event ->{
			if(slectRoom.getSelectionModel().getSelectedItem().equals("Select Room")){
				
				PrimaryStage.setScene(scene);
			}
			else if(slectRoom.getSelectionModel().getSelectedItem().equals("Pit")){
				
				PrimaryStage.setScene(scene2);
			}
			
			
		});
	}
		
	//////////////////////////////////////////////////////////	
		

	
	

	
	public static void main(String[] args){
		launch(args);
	}
}
