/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ni.com.tistesoft.windowviewer;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
/**
 *
 * @author Armando
 */
public class VentanaViewer extends Application {
    
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(
                getClass()
                .getResource("VentanaViewer.fxml")
        );
        Scene scena = new Scene( root );
        stage.setTitle("Window Viewer");
        stage.setScene(scena);
        stage.show();
    }
    
    
    public static void main(String [] args ){
        launch( args);
    }
    
}
