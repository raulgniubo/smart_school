/*
 * Smart School App
 * This Application was made for students to keep track of their college duties.
 * It cannot be distributed or sold without the permission of the author.
 * @author Raul Gutierrez Niubo
 * website: raulgutierrezniubo.com
 */
package Main;

import Useful.FXMLParentController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    
    public static Stage stage = null;
    
    public void start(Stage stage) throws Exception {
        
//        Parent root = FXMLLoader.load(getClass().getResource("yesFXML.fxml"));
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/View/Registration/RegistrationFXML.fxml"));
        Parent root = loader.load();
        FXMLParentController controller = loader.getController();
        
        Scene scene = new Scene(root);
        //scene.setFill(Color.TRANSPARENT);
        stage.setScene(scene);
        //stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("Smart School");
        
        int windowCode = FXMLParentController.registerNewWindow
                (controller, stage, scene);
        controller.setWindowCode(windowCode);
        
        Pane pane = (Pane) root;
        
        FXMLParentController newScreen = new FXMLParentController();
        newScreen.makeTransparentWhenDragging(stage, pane, 1.0f);  // 0.5f for transparency
        
        this.stage = stage;
        
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
