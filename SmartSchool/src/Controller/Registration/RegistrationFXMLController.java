/*
 * Smart School App
 * This Application was made for students to keep track of their college duties.
 * It cannot be distributed or sold without the permission of the author.
 * @author Raul Gutierrez Niubo
 * website: raulgutierrezniubo.com
 */
package Controller.Registration;

import Model.Registration.RegistrationModel;
import Useful.FXMLParentController;
import Useful.JavaFXUseful;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author raulgutierrezniubo
 */
public class RegistrationFXMLController extends FXMLParentController implements Initializable {
    
    RegistrationModel registrationModel = new RegistrationModel();
    
    
    
    /**
     * SignUp Method
     * To sign up the user
     * @param event 
     */
    
    @FXML
    public void signUp(ActionEvent event) {
        JavaFXUseful javaFXUsefull = new JavaFXUseful();
        javaFXUsefull.loadStage("/View/SignUp/SignUpFXML.fxml");
    }
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
