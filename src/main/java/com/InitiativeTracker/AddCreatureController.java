package com.InitiativeTracker;
import java.io.IOException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AddCreatureController {
    @FXML private VBox creatureDisplay;
    @FXML private Button closeButton;

    @FXML private TextField cName;
    @FXML private Spinner<Integer> cInitiative;

    @FXML
    public void addCreature(){
        String name = cName.getText();
        int initiative = cInitiative.getValue();
        System.out.println(name+" "+initiative);
        Creature c = new Creature(name,initiative);
        Tracker tracker = (Tracker) cName.getScene().getWindow().getUserData();
        tracker.add_creature(c);
        this.closeCurrent();
    }

    @FXML
    public void closeCurrent(){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
