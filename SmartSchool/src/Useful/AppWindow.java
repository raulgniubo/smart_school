
package Useful;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppWindow {

    private int windowCode;
    private FXMLParentController  controller;
    private Stage stage;
    private Scene scene;
    
    public AppWindow(int windowCode, FXMLParentController controller, Stage stage, Scene scene) {
        this.windowCode = windowCode;
        this.controller = controller;
        this.stage = stage;
        this.scene = scene;
    }

    public int getWindowCode() {
        return windowCode;
    }

    public void setWindowCode(int windowCode) {
        this.windowCode = windowCode;
    }

    public FXMLParentController getController() {
        return controller;
    }

    public void setController(FXMLParentController controller) {
        this.controller = controller;
    }
    
    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
}
