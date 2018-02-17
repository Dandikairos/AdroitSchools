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
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Okello
 */
public class ProgrammesController implements Initializable {

    @FXML
    private JFXButton studyLevelAndPaeriod;
    @FXML
    private JFXButton schedule;
    @FXML
    private JFXButton classes;
    @FXML
    private JFXButton programmeStructure;
    @FXML
    private AnchorPane programmeAnchorPane;
    @FXML
    private TableView<?> programmesTable;
    @FXML
    private JFXButton newPrograme;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gotoStudyLevelAndPeriod(ActionEvent event) {
         try {
            AnchorPane root = FXMLLoader.load(getClass().getResource("ProgrameLevelsAndPeriods.fxml"));
            Scene scene = new Scene(root);
            
            Stage stage = new Stage();
            stage.setTitle("Programe Levels & Periods");
            stage.setMaximized(true);
            stage.setScene(scene);
            stage.show();
            
        } catch (IOException ex) {
            Logger.getLogger(ClassesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void gotoSchedule(ActionEvent event) {
        try {
            AnchorPane root = FXMLLoader.load(getClass().getResource("Schedules.fxml"));
            Scene scene = new Scene(root);
            
            Stage stage = new Stage();
            stage.setTitle("Schedules");
            stage.setMaximized(true);
            stage.setScene(scene);
            stage.show();
            
        } catch (IOException ex) {
            Logger.getLogger(ClassesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void gotoClasses(ActionEvent event) {
           try {
            AnchorPane root = FXMLLoader.load(getClass().getResource("Classes.fxml"));
            Scene scene = new Scene(root);
            
            Stage stage = new Stage();
            stage.setTitle("Classes");
            stage.setMaximized(true);
            stage.setScene(scene);
            stage.show();
            
        } catch (IOException ex) {
            Logger.getLogger(ClassesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void gotoProgrammesStructure(ActionEvent event) {
           try {
            AnchorPane root = FXMLLoader.load(getClass().getResource("ProgrameStructure.fxml"));
            Scene scene = new Scene(root);
            
            Stage stage = new Stage();
            stage.setTitle("Programe Structure");
            stage.setMaximized(true);
            stage.setScene(scene);
            stage.show();
            
        } catch (IOException ex) {
            Logger.getLogger(ClassesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void gotoProgrameCard(ActionEvent event) {
         try {
            AnchorPane root = FXMLLoader.load(getClass().getResource("ProgrammeCard.fxml"));
            Scene scene = new Scene(root);
            
            Stage stage = new Stage();
            stage.setTitle("Programe Card");
            stage.setMaximized(true);
            stage.setScene(scene);
            stage.show();
            
        } catch (IOException ex) {
            Logger.getLogger(ClassesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
