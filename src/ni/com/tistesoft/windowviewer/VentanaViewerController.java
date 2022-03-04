/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ni.com.tistesoft.windowviewer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
//
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
//
import ni.com.tistesoft.beans.Flower;
/**
 * FXML Controller class
 *
 * @author Armando
 */
public class VentanaViewerController implements Initializable {
    
    @FXML ListView<Flower> flowersListView;
    @FXML ImageView flowerImageView;
    
    private final ObservableList<Flower> flowers =
            FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        this.flowers.add( new Flower("Image 1", "images/large/img1.jpg") );
        this.flowers.add( new Flower("Image 2", "images/large/img2.jpg") );
        this.flowers.add( new Flower("Image 3", "images/large/img3.jpg") );
        this.flowers.add( new Flower("Image 4", "images/large/img4.jpg") );
        
        flowersListView.setItems(this.flowers);
        
        flowersListView.getSelectionModel()
                .selectedItemProperty()
                .addListener( new ChangeListener<Flower>() {
                        @Override
                        public void changed(ObservableValue<? extends Flower> ov, Flower oldValue, Flower newValue ) {
                            Image imageFlor = new Image( newValue.getImageUrl());
                            flowerImageView.setImage(imageFlor);
                        }
                });
    }
}
