/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adroitschools.setup;

import java.net.URL;
import java.util.ResourceBundle;
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
public class ClassCardController implements Initializable {

    @FXML
    private TextField search;
    @FXML
    private AnchorPane classCardAnchorPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void exitCard(KeyEvent event) {
        if (event.getCode() ==KeyCode.ESCAPE) {
		//System.exit(0);
        classCardAnchorPane.getScene().getWindow().hide();
	}
    }
    
}
