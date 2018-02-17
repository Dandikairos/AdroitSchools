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
import javafx.scene.control.Accordion;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;

/**
 * FXML Controller class
 *
 * @author Okello
 */
public class NavigationPaneSetUpController implements Initializable {

    @FXML
    private TextField search;
    @FXML
    private TitledPane homeNavigationPane;
    @FXML
    private Accordion navigationAccordion;
    @FXML
    private TextField roleCenter;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        navigationAccordion.setExpandedPane(homeNavigationPane);
    }    
    
}
