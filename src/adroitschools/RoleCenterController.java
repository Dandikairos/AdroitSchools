/*
Adroit Schools V1.0.0 - (c)Copyright Adroit Solutions Ltd. 2017.
This object includes confidential information and intellectual property of Adroit Solutions Ltd,
and is protected by local and international copyright and Trade Secret laws and agreements.
------------------------------------------------------------------------------------------------------------
Change Log
------------------------------------------------------------------------------------------------------------
Date             | Author               | Version   | Description
------------------------------------------------------------------------------------------------------------
09-09-2017       | Okello Dan           | V1.0.0    | Version Completed

 */
package adroitschools;

import adroitschools.setup.UsersController;
import adroitschools.setup.*;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Okello
 */
public class RoleCenterController implements Initializable {
    private ObservableList<String> homeSubList; 
    private ObservableList<String> studentMgtSubList; 
    private ObservableList<String> classesAndExamsSubList; 
    private ObservableList<String> clubsSubList; 
    private ObservableList<String> setUpSubList; 
    
    @FXML
    private AnchorPane RoleCenterAnchorPane;
    @FXML
    private JFXListView<String> homeList;
    @FXML
    private TitledPane classesAndExams;
    @FXML
    private JFXListView<String> classesAndExamsList;
    @FXML
    private TitledPane clubs;
    @FXML
    private TitledPane setUp;
    @FXML
    private JFXListView<String> setUpList;
    @FXML
    private TabPane RoleCenterTab;
    @FXML
    private BorderPane PlugableBorderPane;
    @FXML
    private BarChart<?, ?> barChart;
    @FXML
    private JFXListView<String> clubsList;
      @FXML
    private JFXListView<String> studentMgtList;
    @FXML
    private TitledPane studentMgt;
    @FXML
    public Tab roleCenterTab;
        
    @FXML
    public AnchorPane mainRoleCenterAnchorPane;
    @FXML
    private ImageView comapanyImage;
    @FXML
    private Label companyName;
    @FXML
    private JFXButton changePassword;
    @FXML
    private Label userName;
    @FXML
    private Label userImage;
    @FXML
    private Label companyNameLabel;
    @FXML
    private Label timeStamp;
    @FXML
    private TitledPane homeAccordion;
    @FXML
    private Accordion roleCenterAccordion;

    
    private void generateSubList(){
        //Generate home Sublist +
        homeSubList = FXCollections.observableArrayList();
        homeSubList.add("Role Center");
        homeSubList.add("Active Students");
        homeSubList.add("New Applications");
        homeSubList.add("Committed Applications");
        homeSubList.add("Admitted Applicants");
        homeSubList.add("Registered Students");
        homeSubList.add("Rejected Applicants");
        homeSubList.add("Pending Applications");
        //homeSubList.add("");
        homeList.setItems(homeSubList);
        //Generate home Sublist -
        
        //Generate Student Management Sublist +
        studentMgtSubList = FXCollections.observableArrayList();
        studentMgtSubList.add("Active Students");
        studentMgtSubList.add("Former Students");
        studentMgtSubList.add("Suspended Students");
        studentMgtSubList.add("Expelled Students");
        studentMgtSubList.add("Drop-Out Student");
        studentMgtSubList.add("Deffered Students");
        studentMgtList.setItems(studentMgtSubList);
        //Generate Student Management Sublist -
        
        //Generate Classes & Exams Sublist +
        classesAndExamsSubList =FXCollections.observableArrayList();
        classesAndExamsSubList.add("Classes");
        classesAndExamsSubList.add("Active Classes");
        classesAndExamsSubList.add("Closed Classes");
        classesAndExamsSubList.add("Classes In Recess");
        classesAndExamsList.setItems(classesAndExamsSubList);
        
        //Generate Classes & Exams Sublist -
        
        //Generate Club Sublist +
        clubsSubList =FXCollections.observableArrayList();
        clubsSubList.add("Clubs");
        clubsList.setItems(clubsSubList);
        //Generate Club Management Sublist -
        //public String textString;    
        //Generate Setup Sublist +
        setUpSubList =FXCollections.observableArrayList();
        setUpSubList.add("Programmes");
        setUpSubList.add("Sessions");
        setUpSubList.add("Classes");
        setUpSubList.add("Sponsors");
        setUpSubList.add("Grading Systems");
        setUpSubList.add("Student Setup");
        setUpSubList.add("Profiles");
        setUpSubList.add("Permissions");
        setUpSubList.add("Users");
        setUpSubList.add("Change Password");
        setUpSubList.add("Navigation Pane Layout");
        setUpSubList.add("Company Information");
        setUpList.setItems(setUpSubList);
        //Generate Setup & Exams Sublist -
        
    }
    private void selectListForm(){
    // Generate Home ListView Items and Place them into the List Retrieveing the approriate name when called +
    //Role Center, Active Students, New Applications, Committed Applications,
    //Admitted Students, Registered Students, Rejected Applicants, Pending Applications
    homeList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            int home1 = homeList.getSelectionModel().getSelectedIndex();
            String homeListName = homeList.getSelectionModel().getSelectedItem();
            switch (home1) {
                case 0:
                    {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("PlugableRoleCenter.fxml"));
                        roleCenterTab.setText(homeListName);
                        AnchorPane.setTopAnchor(NewApplications, 0.0);
                        AnchorPane.setRightAnchor(NewApplications, 0.0);
                        AnchorPane.setLeftAnchor(NewApplications, 0.0);
                        AnchorPane.setBottomAnchor(NewApplications, 0.0);
                        mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                }
                
                case 1:
                {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("home/ActiveStudents.fxml"));
                        roleCenterTab.setText(homeListName);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 2:
                {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("home/NewApplications.fxml"));
                        roleCenterTab.setText(homeListName);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 3:
                {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("home/CommittedApplications.fxml"));
                        roleCenterTab.setText(homeListName);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 4:
                {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("home/AdmittedApplicants.fxml"));
                        roleCenterTab.setText(homeListName);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 5:
                {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("home/RegisteredStudents.fxml"));
                        roleCenterTab.setText(homeListName);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 6:
                {
                    Node NewApplications = null;
                    try {
                      NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("home/RejectedApplications.fxml"));
                        roleCenterTab.setText(homeListName);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 7:
                {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("home/PendingApplications.fxml"));
                        roleCenterTab.setText(homeListName);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                default:
                    try {
                        Node NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("PlugableRoleCenter.fxml"));
                        roleCenterTab.setText(homeListName);
                        AnchorPane.setTopAnchor(NewApplications, 0.0);
                        AnchorPane.setRightAnchor(NewApplications, 0.0);
                        AnchorPane.setLeftAnchor(NewApplications, 0.0);
                        AnchorPane.setBottomAnchor(NewApplications, 0.0);
                        mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
            }
        }
    });
    // Generate Home ListView Items and Place them into the List Retrieveing the approriate name when called -
    
    //Generate the Student Management List View and Retrive the approriate String Name when called +
    //Active Students, Former Students, Suspended Students,Expelled Students, Drop-Out Students, Deferred Students
    studentMgtList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            int studentMgtNo = studentMgtList.getSelectionModel().getSelectedIndex();
            String studentMgtName = studentMgtList.getSelectionModel().getSelectedItem();
            switch(studentMgtNo){
                case 0: 
                 {
                Node NewApplications = null;
                  try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("studentMgt/ActiveStudents.fxml"));
                        roleCenterTab.setText(studentMgtName);
                        AnchorPane.setTopAnchor(NewApplications, 0.0);
                        AnchorPane.setRightAnchor(NewApplications, 0.0);
                        AnchorPane.setLeftAnchor(NewApplications, 0.0);
                        AnchorPane.setBottomAnchor(NewApplications, 0.0);
                        mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }     
                break;
            }
                case 1:
                    {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("studentMgt/FormerStudents.fxml"));
                        roleCenterTab.setText(studentMgtName);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }      
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 2:
                 {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("studentMgt/SuspendedStudents.fxml"));
                        roleCenterTab.setText(studentMgtName);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }    
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 3:
                 {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("studentMgt/ExpelledStudents.fxml"));
                        roleCenterTab.setText(studentMgtName);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 4:
                     {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("studentMgt/DropOutStudents.fxml"));
                        roleCenterTab.setText(studentMgtName);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 5:
                     {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("studentMgt/DefferedStudents.fxml"));
                        roleCenterTab.setText(studentMgtName);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                default:
                    try {
                        Node NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("PlugableRoleCenter.fxml"));
                        roleCenterTab.setText(studentMgtName);
                        AnchorPane.setTopAnchor(NewApplications, 0.0);
                        AnchorPane.setRightAnchor(NewApplications, 0.0);
                        AnchorPane.setLeftAnchor(NewApplications, 0.0);
                        AnchorPane.setBottomAnchor(NewApplications, 0.0);
                        mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    break;
            }
        }
    });
    //Generate the Student Management List View and Retrive the approriate String Name when called -
    
    //Generate the Clases and Exams List Retriveing the approriate names when called +
    //Classes, Active Classes, Closed Classes, Classes In Recess
    classesAndExamsList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            int classesAndExamsNo = classesAndExamsList.getSelectionModel().getSelectedIndex();
            String classesAndExamsNames = classesAndExamsList.getSelectionModel().getSelectedItem();
            switch(classesAndExamsNo){
                case 0:
                      {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("setup/Classes.fxml"));
                        roleCenterTab.setText(classesAndExamsNames);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }      
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                
                case 1:
                   {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("classesAndExams/ActiveClasses.fxml"));
                        roleCenterTab.setText(classesAndExamsNames);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }      
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 2:
                       {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("classesAndExams/ClosedClasses.fxml"));
                        roleCenterTab.setText(classesAndExamsNames);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }      
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 3:
                       {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("classesAndExams/ClassesInRecess.fxml"));
                        roleCenterTab.setText(classesAndExamsNames);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }      
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                       default:
                    try {
                        Node NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("PlugableRoleCenter.fxml"));
                        roleCenterTab.setText(classesAndExamsNames);
                        AnchorPane.setTopAnchor(NewApplications, 0.0);
                        AnchorPane.setRightAnchor(NewApplications, 0.0);
                        AnchorPane.setLeftAnchor(NewApplications, 0.0);
                        AnchorPane.setBottomAnchor(NewApplications, 0.0);
                        mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    break;
                       
            }
        }
    });
    //Generate the Clases and Exams List Retriveing the approriate names when called - 
    
    //Generate the club List View and Retrive the approriate String Name when called +
    
    clubsList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            int clubNo = clubsList.getSelectionModel().getSelectedIndex();
            String clubNames = clubsList.getSelectionModel().getSelectedItem();
            switch(clubNo){
                case 0:
                        {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("club/Clubs.fxml"));
                        roleCenterTab.setText(clubNames);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
               default:
                    try {
                        Node NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("PlugableRoleCenter.fxml"));
                        roleCenterTab.setText(clubNames);
                        AnchorPane.setTopAnchor(NewApplications, 0.0);
                        AnchorPane.setRightAnchor(NewApplications, 0.0);
                        AnchorPane.setLeftAnchor(NewApplications, 0.0);
                        AnchorPane.setBottomAnchor(NewApplications, 0.0);
                        mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    break;
            }
        }
    });
    //Generate the club List View and Retrive the approriate String Name when called -
    
    //Generate the Setup List View and Retrive the approriate String Name when called +
    setUpList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            int setupNo = setUpList.getSelectionModel().getSelectedIndex();
            String SetupNames = setUpList.getSelectionModel().getSelectedItem();
            switch(setupNo){
                case 0://Programmes
                        {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("setup/Programmes.fxml"));
                        roleCenterTab.setText(SetupNames);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 1://Sessions
                        {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("setup/Sessions.fxml"));
                        roleCenterTab.setText(SetupNames);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 2://Classes
                        {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("setup/Classes.fxml"));
                        roleCenterTab.setText(SetupNames);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                 case 3://Sponsors
                        {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("setup/Sponsors.fxml"));
                        roleCenterTab.setText(SetupNames);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                case 4://Grading System
                        {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("setup/GradingSystems.fxml"));
                        roleCenterTab.setText(SetupNames);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
               
                    case 5://Student Setup
                        {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("setup/StudentSetUpCard.fxml"));
                        roleCenterTab.setText(SetupNames);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                    case 6://Profiles
                        {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("setup/Profiles.fxml"));
                        roleCenterTab.setText(SetupNames);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                    case 7://Permissions
                        {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("setup/Permissions.fxml"));
                        roleCenterTab.setText(SetupNames);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                    case 8://Users
                        {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("setup/Users.fxml"));
                        roleCenterTab.setText(SetupNames);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    AnchorPane.setTopAnchor(NewApplications, 0.0);
                    AnchorPane.setRightAnchor(NewApplications, 0.0);
                    AnchorPane.setLeftAnchor(NewApplications, 0.0);
                    AnchorPane.setBottomAnchor(NewApplications, 0.0);
                    mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    break;
                }
                    case 9://Change Password
                        {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("setup/ChangePassword.fxml"));
                        Scene scene = new Scene((Parent) NewApplications);
                        Stage stage = new Stage();
                        stage.setScene(scene);
                        stage.show();
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    break;
                }
                        //NavigationPaneSetUp
                    case 10://Navigation Pane Layout
                        {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("setup/NavigationPaneSetUp.fxml"));
                        roleCenterTab.setText(SetupNames);
                        AnchorPane.setTopAnchor(NewApplications, 0.0);
                        AnchorPane.setRightAnchor(NewApplications, 0.0);
                        AnchorPane.setLeftAnchor(NewApplications, 0.0);
                        AnchorPane.setBottomAnchor(NewApplications, 0.0);
                        mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    break;
                }
                    case 11://Navigation Pane Layout
                        {
                    Node NewApplications = null;
                    try {
                        NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("setup/CompanyInfo.fxml"));
                        roleCenterTab.setText(SetupNames);
                        AnchorPane.setTopAnchor(NewApplications, 0.0);
                        AnchorPane.setRightAnchor(NewApplications, 0.0);
                        AnchorPane.setLeftAnchor(NewApplications, 0.0);
                        AnchorPane.setBottomAnchor(NewApplications, 0.0);
                        mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    break;
                }
               default:
                    try {
                        Node NewApplications = FXMLLoader.load(RoleCenterController.this.getClass().getResource("PlugableRoleCenter.fxml"));
                        roleCenterTab.setText(SetupNames);
                        AnchorPane.setTopAnchor(NewApplications, 0.0);
                        AnchorPane.setRightAnchor(NewApplications, 0.0);
                        AnchorPane.setLeftAnchor(NewApplications, 0.0);
                        AnchorPane.setBottomAnchor(NewApplications, 0.0);
                        mainRoleCenterAnchorPane.getChildren().setAll(NewApplications);
                    }catch (IOException ex) {
                        Logger.getLogger(RoleCenterController.class.getName()).log(Level.SEVERE, null, ex);
                    }   
                    break;
            
            }
        }
    });
    //Generate the Setup List View and Retrive the approriate String Name when called -
    
    }
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        generateSubList();
        selectListForm();
        roleCenterAccordion.setExpandedPane(homeAccordion);
     //homeList
        setTime();
        
        //homeList.getSelectionModel().select("Role Center");
        homeList.getSelectionModel().selectFirst();
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
    private int minute;
    private int hour;
    private int second;
    private int day;
    private int month;
    private int year;
    public void setTime(){
        Thread clock;
        clock = new Thread() {
            public void run() {
                for (;;) {
                    DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
                    Calendar cal = Calendar.getInstance();
                    second = cal.get(Calendar.SECOND);
                    minute = cal.get(Calendar.MINUTE);
                    hour = cal.get(Calendar.HOUR);
                    month = cal.get(Calendar.MONTH +1);
                    day = cal.get(Calendar.DAY_OF_WEEK);
                    //day = cal.get(Calendar.)
                    year = cal.get(Calendar.YEAR);
                   // timeStamp.setText(year+" ,"+month+", "+day+" "+hour + ":" + (minute) + ":" + second);

                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        //...
                    }
                }
            }
        };
    clock.start();
    }
    public void getCompanyInfo(){
        //companysName;
    }
    
}
