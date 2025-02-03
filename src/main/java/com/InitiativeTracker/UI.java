package com.InitiativeTracker;
import java.util.List;

import com.InitiativeTracker.Creature;
import com.InitiativeTracker.Tracker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UI extends Application{
    private Tracker tracker = new Tracker();
    private VBox root = new VBox(10);
    private VBox creature_display = new VBox(10);
    @Override
    public void start(Stage stage){
        Button add_creature = new Button("Add Creature");
        add_creature.setOnAction(event -> {
            Creature c = new Creature("name",6);
            this.tracker.add_creature(c);
        });

        Button update = new Button("Update");
        update.setOnAction(event -> this.update_creatures());

        this.root.getChildren().addAll(add_creature,update,creature_display);
        Scene scene = new Scene(root,400,300);

        stage.setTitle("Initiative Tracker");
        stage.setScene(scene);
        stage.show();
    }

    public void update_creatures(){
        List<Integer> ids = tracker.get_ids();
        this.creature_display.getChildren().clear();
        for (int i=0; i<ids.size(); i++){
            Creature c = tracker.get_creature(ids.get(i));
            Label l = new Label(c.get_name()+" "+c.get_initiative());
            this.creature_display.getChildren().addAll(l);
        }
    }
}
