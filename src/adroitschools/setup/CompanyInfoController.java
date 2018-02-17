/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adroitschools.setup;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;

/**
 * FXML Controller class
 *
 * @author Okello
 */
public class CompanyInfoController implements Initializable {

    @FXML
    private Accordion companyInfoAccordion;
    @FXML
    private TitledPane generalFastTab;
    @FXML
    private JFXTextField companyName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        companyInfoAccordion.setExpandedPane(generalFastTab);
        
    }  
    public void saveinitRecords(){
        String CompanysName = companyName.getText();
    }
      
}
