/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adroitschools;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TouchEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Okello
 */
public class AdroitSchLoginController implements Initializable {

    @FXML
    private AnchorPane loginAnchorPane;
    @FXML
    private JFXTextField userName;
    @FXML
    private JFXPasswordField password;
    @FXML
    private JFXButton login;
    @FXML
    private Hyperlink signup;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         if(!AdroitSchools.isSplashLoaded){
        loadSplash();
        
        }
    }    
    private void loadSplash(){
    AdroitSchools.isSplashLoaded = true;
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("Splash.fxml"));
            
            loginAnchorPane.getChildren().setAll(pane);
            
            FadeTransition fadeIn = new FadeTransition(Duration.seconds(2),pane);
            fadeIn.setFromValue(0);
            fadeIn.setToValue(2);
            fadeIn.setCycleCount(1);
            
            FadeTransition fadeOut = new FadeTransition(Duration.seconds(2),pane);
            fadeOut.setFromValue(2);
            fadeOut.setToValue(0);
            fadeOut.setCycleCount(1);
            
            fadeIn.play();
            fadeIn.setOnFinished(e->{
            fadeOut.play();
            });
            fadeOut.setOnFinished(e->{
                try {
                    AnchorPane ParentContent = FXMLLoader.load(getClass().getResource("AdroitSchLogin.fxml"));
                    
                    loginAnchorPane.getChildren().setAll(ParentContent);
                } catch (IOException ex) {
                    Logger.getLogger(AdroitSchLoginController.class.getName()).log(Level.SEVERE, null, ex);

                }
            });
        } catch (IOException ex) {
            Logger.getLogger(AdroitSchLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    private void login(){
        try {
                AnchorPane rolePane = FXMLLoader.load(getClass().getResource("RoleCenter.fxml"));
                Scene scene = new Scene(rolePane);
                Stage stage  =  new Stage();
                stage.setTitle("Role Centers");
                stage.setScene(scene);
                stage.setMaximized(true);

                stage.show();
                loginAnchorPane.getScene().getWindow().hide();
                
            } catch (IOException ex) {
                Logger.getLogger(AdroitSchLoginController.class.getName()).log(Level.SEVERE, null, ex);

            }
    }
    @FXML
    private void onSignUp(ActionEvent event) {
        try {
            AnchorPane rolePane = FXMLLoader.load(getClass().getResource("setup/SignUp.fxml"));
            Scene scene = new Scene(rolePane);
            Stage stage  =  new Stage();
            stage.setTitle("Sign up");
            stage.setScene(scene);
            stage.show();
            
            } catch (IOException ex) {
            Logger.getLogger(AdroitSchLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
