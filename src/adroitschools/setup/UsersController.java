/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adroitschools.setup;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Okello
 */
public class UsersController implements Initializable {

    @FXML
    private JFXButton createNewUser;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createNewUser(ActionEvent event) {
        
        try {
            AnchorPane root = FXMLLoader.load(getClass().getResource("UserCard.fxml"));
            Scene scene = new Scene(root);
            
            Stage stage = new Stage();
            stage.setMaximized(true);
            stage.setScene(scene);
            stage.show();
            
        } catch (IOException ex) {
            Logger.getLogger(ClassesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void changeUserPassword(ActionEvent event) {
        try {
            AnchorPane root = FXMLLoader.load(getClass().getResource("ChangePassword.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setMaximized(true);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UsersController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
}
