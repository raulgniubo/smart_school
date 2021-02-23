/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Registration;

import Useful.FXMLParentController;
import Useful.JavaFXUseful;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class SigninFXMLController extends FXMLParentController implements Initializable {

    SigninModel signinModel = new SigninModel();
    
    public static Stage signupStage = null;
    
    public static String user = "";
    
    @FXML
    private AnchorPane parent;
    
    @FXML
    private TextField usernameTextField;
    
    @FXML
    private PasswordField passwordPasswordField;
    
    @FXML
    private Label credentialsLabel;
    
    @FXML
    private Button signinButton;
    
    @FXML
    public void Signin(ActionEvent event) {
        
        try {
            
            if (this.signinModel.isSignin(this.usernameTextField.getText(), this.passwordPasswordField.getText())) {
                
                this.user = usernameTextField.getText();
                
                Stage stage = (Stage)this.signinButton.getScene().getWindow();
                stage.close();
                
                studentLogin(event);
                
            } else {
                this.credentialsLabel.setText("Wrong Credentials");
            }
            
        } catch (Exception localException) {
            
        }
        
    }
    
    @FXML
    public void Signup(ActionEvent event) {
        JavaFXUseful javaFXUsefull = new JavaFXUseful();
        javaFXUsefull.loadStage("/Signup/SignupFXML.fxml");
    }
    
    public void studentLogin(ActionEvent event) {
        JavaFXUseful javaFXUsefull = new JavaFXUseful();
        javaFXUsefull.changeStage("/Home/HomeFXML.fxml", this.getWindowCode());
    }
    
    @FXML
    private void handleClose() {
        System.exit(0);
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        setBorder(parent);
    }
    
    private void setBorder(AnchorPane parent) {
        parent.setBorder(new Border(new BorderStroke(Color.BLACK, 
            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    }
    
}
