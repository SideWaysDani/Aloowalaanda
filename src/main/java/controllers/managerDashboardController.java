package main.java.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class managerDashboardController implements Initializable {

		Alert alert;
	
	   @FXML
	    private Button accountBtn;

	    @FXML
	    private Button account_addBtn;

	    @FXML
	    private Button account_deleteBtn;

	    @FXML
	    private TextField account_delete_userID;

	    @FXML
	    private Button account_findBtn;

	    @FXML
	    private TextField account_name;

	    @FXML
	    private TextField account_password;

	    @FXML
	    private TableView<?> account_table;

	    @FXML
	    private Button account_updateBtn;

	    @FXML
	    private TextField account_userID;

	    @FXML
	    private Button inventoryBtn;

	    @FXML
	    private AnchorPane inventoryForm;

	    @FXML
	    private Button inventory_checkBtn;

	    @FXML
	    private Button inventory_generateBtn;

	    @FXML
	    private TableView<?> inventory_itemTable;

	    @FXML
	    private TableView<?> inventory_shortageTable;

	    @FXML
	    private Button salesBtn;

	    @FXML
	    private AnchorPane salesForm;
	    
	    @FXML
	    private AnchorPane accountForm;
	    
	    @FXML
	    private Label sales_avgRevenueText;

	    @FXML
	    private BarChart<?, ?> sales_barchart;

	    @FXML
	    private Button sales_checkBtn;

	    @FXML
	    private Button sales_generateBtn;

	    @FXML
	    private Label sales_totalRevenueText;

	    @FXML
	    private Label sales_totalSalesText;

	    @FXML
	    private Button signoutBtn;

	    @FXML
	    private Button staffBtn;
	    
	    @FXML
	    private Button account_refreshBtn;

	    @FXML
	    private AnchorPane staffForm;

	    @FXML
	    private Button staff_addBtn;

	    @FXML
	    private Button staff_dismissBtn;

	    @FXML
	    private TextField staff_dismiss_staffID;

	    @FXML
	    private TextField staff_name;

	    @FXML
	    private TextField staff_phoneNum;

	    @FXML
	    private TextField staff_staffID;
	    
	    @FXML
	    private Button closeBtn;
	    
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
	    public void signOut() {
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
	    
	    
	    //Staff Form Event Handlers
	    
	    @FXML
	    public void addStaff() {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("Add staff called with values:\n" +staff_name.getText() +"\n" + staff_staffID.getText() +"\n"+ staff_phoneNum.getText()) ;
	    	alert.showAndWait();
	    	
	    	// check if any to be int or double is not empty warna error in parsing
	    	// addStaff( staff_name.getText(), Integer.parseint(staff_staffID.getText()) , staff_phoneNum.getText()  ); /// check yeh passwrod wali shizzz
	    	
	    	//void addStaff (String name, int id, String phoneNumber, String password) 
	    }
	    
	    @FXML
	    public void dismissStaff() {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("Dismiss staff called with values:\n" +staff_dismiss_staffID.getText()) ;
	    	alert.showAndWait();
	    	
	    	// check if any to be int or double is not empty warna error in parsing
	    	// dismissStaff( Integer.parseint(staff_staffID.getText())  ); 
	    	
	    	//void dismissStaff (int staffId)
	    	
	    }
	    
	    
	    
	    
	    //Inventory Form Event Handlers

	    @FXML
	    public void generateItemsRecord() {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("generateItemsRecord called ") ;
	    	alert.showAndWait();
	    	
	    	//generateRecord();
	    	
	    	// Return items to inventory_itemTable
	    	
	    }
	    
	    @FXML
	    public void checkShortage() {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("checkShortage called ") ;
	    	alert.showAndWait();
	    	
	    	
	    	//notifyShortage ();
	    	
	    	// Return items to inventory_shortageTable
	    }
	    
	    
	    
	    //Sales Form Event Handlers
	    
	    @FXML
	    public void generateSalesReport() {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("generateSalesReport called ") ;
	    	alert.showAndWait();
	    	
	    	//generateSalesReport ();
	    	
	    	// Return items to sales_totalSalesText, sales_totalRevenueText, sales_avgRevenueText
	    	
	    }
	    
	    @FXML
	    public void checkPopularItems() {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("checkShortage called ") ;
	    	alert.showAndWait();
	    	
	    	
	    	//getPopularltems ();
	    	
	    	// Return items to sales_barchart
	    
	    }
	    
	    
	    //Account Form Event Handlers

	    @FXML
	    public void addAccount() {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("addAccount called with values:\n" +account_name.getText() +"\n" + account_userID.getText() +"\n"+ account_password.getText()) ;
	    	alert.showAndWait();
	    	
	    	
	    	// check if any to be int or double is not empty warna error in parsing
	    	// createAccount( account_name.getText(), Integer.parseint(account_userID.getText()) , account_password.getText()  );
	    	
	    	
	    	//	void createAccount (String name, int id, String password)

	    }
	    
	    @FXML
	    public void updateAccount() {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("updateAccount called with values:\n" +account_name.getText() +"\n" + account_userID.getText() +"\n"+ account_password.getText()) ;
	    	alert.showAndWait();
	    	
	    	
	    	// check if any to be int or double is not empty warna error in parsing
	    	// editAccount( account_name.getText(), Integer.parseint(account_userID.getText()) , account_password.getText()  );
	    	
	    	
	    	//	void editAccount (String name, int id, String password)
	    	
	    }
	    
	    @FXML
	    public void findAccount() {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("findAccount called with values:\n" +account_delete_userID.getText()) ;
	    	alert.showAndWait();
	    	
	    	// check if any to be int or double is not empty warna error in parsing
	    	// editAccount( Integer.parseint(account_delete_userID.getText())  );
	    	
	    	
	    	//		void findAccount (int userId)

	    	
	    	//return account to account_table
	    	
	    }
	    
	    @FXML
	    public void deleteAccount() {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("deleteAccount called with values:\n" +account_delete_userID.getText()) ;
	    	alert.showAndWait();
	    	
	    	// check if any to be int or double is not empty warna error in parsing
	    	// clearAccount( Integer.parseint(account_delete_userID.getText())  );
	    	
	    	
	    	//			void clearAccount (String name, int userId) // remove String name from params


	    	
	    	
	    }
	    
	    @FXML
	    public void refreshAccountTable() {
	    	alert = new Alert (AlertType. INFORMATION) ;
	    	alert.setTitle("Info Message");
	    	alert. setHeaderText (null) ;
	    	alert.setContentText ("refreshAccountTable called!") ;
	    	alert.showAndWait();
	    	
	    	//refresh account_table (return all the accounts to it)
	    	
	    }
	    
	    
	    public void changeForm(ActionEvent event) {
	    	
	    	
	    	if (event.getSource() == staffBtn) {
	    		
	    		staffForm.setVisible(true);
	    		
	    		inventoryForm.setVisible(false);
	    		salesForm.setVisible(false);
	    		accountForm.setVisible(false);
	    	}
	    	else if (event.getSource() == inventoryBtn) {
	    		
	    		inventoryForm.setVisible(true);
	    		
	    		staffForm.setVisible(false);
	    		salesForm.setVisible(false);
	    		accountForm.setVisible(false);
	    	}
	    	else if (event.getSource() == salesBtn) {
	    		
	    		salesForm.setVisible(true);
	    		
	    		staffForm.setVisible(false);
	    		inventoryForm.setVisible(false);
	    		accountForm.setVisible(false);
	    	}
	    	else if (event.getSource() == accountBtn) {
	    		
	    		accountForm.setVisible(true);
	    		
	    		staffForm.setVisible(false);
	    		inventoryForm.setVisible(false);
	    		salesForm.setVisible(false);
	    	}
	    	
	    }

		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			staffForm.setVisible(true);
    		
    		inventoryForm.setVisible(false);
    		salesForm.setVisible(false);
    		accountForm.setVisible(false);
		}

	
}
