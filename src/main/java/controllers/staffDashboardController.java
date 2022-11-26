package main.java.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

public class staffDashboardController implements Initializable{

	Alert alert;
	
	
	
	
	 @FXML
	    private Button account_refreshBtn;

	    @FXML
	    private Button addBtn;

	    @FXML
	    private TextField category;

	    @FXML
	    private Button deleteBtn;

	    @FXML
	    private TextField delete_itemID;

	    @FXML
	    private Button findBtn;

	    @FXML
	    private TextField itemID;

	    @FXML
	    private TableView<?> itemTable;

	    @FXML
	    private TextField name;

	    @FXML
	    private TextField price;
	    
	    @FXML
	    private TextField count;

	    @FXML
	    private Button signoutBtn;
	    
	    @FXML
	    private AnchorPane leftPane;
	    
	    @FXML
	    private AnchorPane rightPane;
	    
	    @FXML
	    private AnchorPane topPane;



	    @FXML
	    private Button updateBtn;
	    
	    @FXML
	    private Button closeBtn;
	    
	    
	    
	    public void initialize(URL arg0, ResourceBundle arg1) {
			
			
		}
	    
	    
	    
	    
	    @FXML
	    public void close() {
	    	
	    	alert = new Alert (AlertType. CONFIRMATION) ;
	    	alert.setTitle("Confirmation Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("Are you sure you want to Exit?") ;
	    	Optional<ButtonType> option = alert.showAndWait();
	    	
	    	if (option.get().equals(ButtonType.OK)) {
	    		System.exit(0);
	    	}
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    @FXML
	    public void addItem(ActionEvent event) {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("addItem called with values:\n" +name.getText() +"\n" + itemID.getText() +"\n"+ category.getText()+"\n"+ price.getText() +"\n"+ count.getText());
	    	alert.showAndWait();
	    	
	    	
	    	// check if any to be int or double is not empty warna error in parsing
	    	// addItem( name, Integer.parseint(delete_itemID.getText()) , Double. parseDouble(price.getText()) , category.getText() , Integer.parseint(count.getText()) );
	    	
	    }
	    
	    
	    @FXML
	    public void updateItem(ActionEvent event) {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("updateItem called with values:\n" +name.getText() +"\n" + itemID.getText() +"\n"+ category.getText()+"\n"+ price.getText() +"\n"+ count.getText()) ;
	    	alert.showAndWait();
	    	
	    	// check if any to be int or double is not empty warna error in parsing
	    	// editItem( name, Integer.parseint(delete_itemID.getText()) , Double. parseDouble(price.getText()) , category.getText() , Integer.parseint(count.getText()) );
	    
	    	// editItem function missing category
	    }


	    @FXML
	    public void deleteItem(ActionEvent event) {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("deleteItem called with values:\n" +delete_itemID.getText()) ;
	    	alert.showAndWait();
	    	
	    	
	    	// check if any to be int or double is not empty warna error in parsing
	    	// deleteltem( Integer.parseint(delete_itemID.getText()));
	    	
	    	
	    }

	    @FXML
	    public void findItem(ActionEvent event) {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("findItem called with values:\n" +delete_itemID.getText()) ;
	    	alert.showAndWait();
	    	
	    	// check if any to be int or double is not empty warna error in parsing
	    	// findltem( Integer.parseint(delete_itemID.getText()));
	    	
	    	//return found item to itemTable
	    }

	    @FXML
	    public void refreshItemTable(ActionEvent event) {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("findItem called with values:\n" +itemID.getText()) ;
	    	alert.showAndWait();
	    	
	    	//return all items to itemTable
	    }

	    @FXML
	    public void signOut(ActionEvent event) {
	    	try {
	    		
	    		alert = new Alert (AlertType. CONFIRMATION) ;
		    	alert.setTitle("Confirmation Message");
		    	alert. setHeaderText (null) ;
		    	alert.setContentText ("Are you sure you want to Sign Out?") ;
		    	Optional<ButtonType> option = alert.showAndWait();
		    	
		    	if (option.get().equals(ButtonType.OK)) {
					Parent root = FXMLLoader.load(getClass().getResource("/main/resources/layout/login.fxml"));
					Scene scene = new Scene(root);
					Stage stage = new Stage();
					
					signoutBtn.getScene().getWindow().hide();
					
					stage.setScene(scene);
					stage.show();
			    	}
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }

	  

}
