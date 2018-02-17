/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adroitschools.setup;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Okello
 */
public class ProgrameStructureController implements Initializable {

    @FXML
    private AnchorPane programmesStructureAnchorPane;
    @FXML
    private JFXButton newClass;
    @FXML
    private TextField search;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createNewClass(ActionEvent event) {
    }

    @FXML
    private void exitProgrameStructures(KeyEvent event) {
         if (event.getCode() ==KeyCode.ESCAPE) {
		//System.exit(0);
        programmesStructureAnchorPane.getScene().getWindow().hide();
	}
    }
    
}
