/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adroitschools;

import adroitschools.setup.UsersController;
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
import javafx.scene.chart.BarChart;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Okello
 */
public class PlugableRoleCenterController implements Initializable {

    @FXML
    private BorderPane PlugableBorderPane;
    @FXML
    private JFXButton changePassword;
    @FXML
    private BarChart<?, ?> barChart;
    @FXML
    private ImageView comapanyImage;
    @FXML
    private Label companyName;
    @FXML
    private JFXButton logout;
    @FXML
    private Label userName;
    @FXML
    private Label userImage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ChangeUserPassword(ActionEvent event) {
         try {
            AnchorPane root = FXMLLoader.load(getClass().getResource("setup/ChangePassword.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UsersController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    
    }
    @FXML
    private void onLogOut(ActionEvent event) {
        try {
                AnchorPane rolePane = FXMLLoader.load(getClass().getResource("AdroitSchLogin.fxml"));
                Scene scene = new Scene(rolePane);
                Stage stage  =  new Stage();
                stage.setTitle("Login");
                stage.setScene(scene);
                stage.show();
                
                
                
            } catch (IOException ex) {
                Logger.getLogger(AdroitSchLoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
