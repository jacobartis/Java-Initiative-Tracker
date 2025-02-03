package com.InitiativeTracker;
import java.util.List;

import com.InitiativeTracker.Creature;
import com.InitiativeTracker.Tracker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class UIController {
    @FXML private VBox creatureDisplay;

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
    public void addCreature(){
        Creature c = new Creature("test",10);
        this.tracker.add_creature(c);
        this.updateCreatureDisplay();
    }
}
