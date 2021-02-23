
package Useful;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class JavaFXUseful extends FXMLParentController {
    
    public int loadStage(String fxmlScreen) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(fxmlScreen));
            
            Parent root = loader.load();
            FXMLParentController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            
            int windowCode = FXMLParentController.registerNewWindow
                (controller, stage, scene);
            controller.setWindowCode(windowCode);

            Pane pane = (Pane) root;
            makeTransparentWhenDragging(stage, pane, 1.0f);  // 0.5f for transparency

            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setResizable(false);
            //stage.initStyle(StageStyle.TRANSPARENT);
            
            stage.show();
            return windowCode;
        }
        catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    public void changeStage(String fxmlScreen, int currentWindowCode) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(fxmlScreen));
            
            Parent root = loader.load();
            FXMLParentController controller = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            
            int windowCode = FXMLParentController.registerNewWindow
                (controller, stage, scene);
            controller.setWindowCode(windowCode);

            Pane pane = (Pane) root;
            makeTransparentWhenDragging(stage, pane, 1.0f);  // 0.5f for transparency

            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setResizable(false);
            //stage.initStyle(StageStyle.TRANSPARENT);
            
            stage.show();
            
            AppWindow AssignmentsWindow = FXMLParentController.getWindow(currentWindowCode);
            Stage myStage = AssignmentsWindow.getStage();
            myStage.close();
            FXMLParentController.unregisterWindow(currentWindowCode);
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    
}
