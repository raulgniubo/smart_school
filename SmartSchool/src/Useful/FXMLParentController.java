
package Useful;

import java.util.ArrayList;
import java.util.List;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FXMLParentController {
    
    private static List<AppWindow> windowsList = new ArrayList<AppWindow>();
    
    private static int windowCodeAuto = 0;
    private int windowCode = 0;
    
    private double initX;
    private double initY;

    public double getInitX() {
        return initX;
    }

    public void setInitX(double initX) {
        this.initX = initX;
    }

    public double getInitY() {
        return initY;
    }

    public void setInitY(double initY) {
        this.initY = initY;
    }
    
    public int getWindowCode() {
        return windowCode;
    }

    public void setWindowCode(int windowCode) {
        this.windowCode = windowCode;
    }
    
    public static int registerNewWindow(FXMLParentController controller, Stage stage, Scene scene) {
        
        windowCodeAuto ++;
        AppWindow appWin = new AppWindow(windowCodeAuto, controller, stage, scene);
        windowsList.add(appWin);
        return windowCodeAuto;
        
    }
    
    public static void unregisterWindow(int windowCode) {
        
        AppWindow applicationWindow = null;
        
        for (AppWindow AppWin : windowsList) {
            if (AppWin.getWindowCode() == windowCode) {
                applicationWindow = AppWin;
            }
        }
        
        if (applicationWindow != null) {
            windowsList.remove(applicationWindow);
        }
        
    }
    
    public static AppWindow getWindow(int windowCode) {
        AppWindow applicationWindow = null;
        for (AppWindow AppWin : windowsList) {
            if (AppWin.getWindowCode() == windowCode) {
                applicationWindow = AppWin;
            }
        }
        return applicationWindow;
    }
    
    public static int getOpenWindowsQty() {
        return windowsList.size();
    }
    
    public void makeTransparentWhenDragging(Stage windowStage, Pane rootPane, double transparency) {
        //when mouse button is pressed, save the initial position of screen
        rootPane.setOnMousePressed(new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        initX = me.getScreenX() - windowStage.getX();
                        initY = me.getScreenY() - windowStage.getY();
                    }
                });
        //when screen is dragged, translate it accordingly
        rootPane.setOnMouseDragged(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                windowStage.setX(me.getScreenX() - initX);
                windowStage.setY(me.getScreenY() - initY);
                windowStage.setOpacity(transparency);
            }
        });
        //set opacity 100% on drag done
        rootPane.setOnDragDone(new EventHandler<DragEvent>() {
                    public void handle(DragEvent me) {
                        windowStage.setOpacity(1.0f);
                    }
                });
        //set opacity 100% on mouse released
        rootPane.setOnMouseReleased(new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        windowStage.setOpacity(1.0f);
                    }
                });
    }
    
}
