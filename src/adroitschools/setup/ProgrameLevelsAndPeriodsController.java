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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Okello
 */
public class ProgrameLevelsAndPeriodsController implements Initializable {

    @FXML
    private AnchorPane programmeLevelsAndPeriods;
    @FXML
    private JFXButton newClass;
    @FXML
    private TextField search;
    @FXML
    private JFXButton awards;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createNewStudyLevel(ActionEvent event) {
        try {
            AnchorPane root = FXMLLoader.load(getClass().getResource("ProgrameLevelAndPeriodCard.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setMaximized(true);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UsersController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }

    @FXML
    private void gotoAwards(ActionEvent event) {
        try {
            AnchorPane root = FXMLLoader.load(getClass().getResource("Awards.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("Awards");
            stage.setMaximized(true);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(UsersController.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
}
