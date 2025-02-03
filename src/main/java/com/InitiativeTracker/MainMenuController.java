package com.InitiativeTracker;
import java.io.IOException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainMenuController {
    @FXML private VBox creatureDisplay;
    @FXML private Button closeButton;

    Tracker tracker = new Tracker();

    @FXML
    public void updateCreatureDisplay(){
        System.out.println("Button pressed");
        List<Integer> ids = this.tracker.get_ids();
        this.creatureDisplay.getChildren().clear();
        for (int i=0; i<ids.size(); i++){
            Creature c = tracker.get_creature(ids.get(i));
            Label l = new Label(c.get_name()+" "+c.get_initiative());
            this.creatureDisplay.getChildren().addAll(l);
        }
    }

    @FXML
    public void openAddPopup() {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/com/InitiativeTracker/addCreaturePopup.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root,400,300);
            stage.setUserData(tracker);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Initiative Tracker");
            stage.setScene(scene);
            stage.show();
        }catch (IOException e){
            System.out.println("An error has occured: "+e.getMessage());
        }
    }

    @FXML
    public void closeCurrent(){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
