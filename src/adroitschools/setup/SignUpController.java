/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adroitschools.setup;

import adroitschools.AdroitSchLoginController;
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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Okello
 */
public class SignUpController implements Initializable {

    @FXML
    private AnchorPane sIgnUpAnchorPane;
    @FXML
    private JFXButton saveRecord;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backToLogin(ActionEvent event) {
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
