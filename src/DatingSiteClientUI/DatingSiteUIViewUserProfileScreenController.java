/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatingSiteClientUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import webservice.Profile;

/**
 * FXML Controller class
 *
 * @author MS-Laptop
 */
public class DatingSiteUIViewUserProfileScreenController extends DatingSiteUIController implements Initializable {

    @FXML
    private TextArea taViewProfileHobbies;
    @FXML
    private Label lblViewProfileAge;
    @FXML
    private TextArea taViewProfileDescriptions;
    @FXML
    private Label lblViewProfileHair;
    @FXML
    private Label lblViewProfileEyes;
    @FXML
    private Label lblViewProfileGender;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setProfile(Profile userProfile){
        taViewProfileHobbies.setText(userProfile.getHobbies());
        taViewProfileDescriptions.setText(userProfile.getDescription());
        lblViewProfileHair.setText(userProfile.getColorHair().toString());
        lblViewProfileEyes.setText(userProfile.getColorEyes().toString());
        lblViewProfileGender.setText(userProfile.getGender().toString());
    }
    
}