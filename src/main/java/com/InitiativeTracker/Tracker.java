package com.InitiativeTracker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.InitiativeTracker.Creature;

public class Tracker {
    HashMap <Integer,Creature> creatures = new HashMap<Integer,Creature>();
    int id = 0;

    private int next_id(){
        this.id ++;
        return id;
    }

    public void add_creature(Creature creature){
        creatures.put(this.next_id(), creature);
    }

    public List<Integer> get_ids(){
        List<Integer> arr = new ArrayList<Integer>();
        arr.addAll(this.creatures.keySet());
        return arr;
    }

    public Creature get_creature(int id){
        if (!this.creatures.keySet().contains(id)){
            return null;
        }
        return this.creatures.get(id);
    }

}
