package com.InitiativeTracker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import com.InitiativeTracker.*;


public class Tester {
    @Test
    void creatureCreation(){
        Creature creature = new Creature();
        assertNotNull(creature);
    }

    @Test
    void creatureName1(){
        String name = "test_name";
        Creature creature = new Creature(name,0);
        assertTrue(creature.get_name().equals(name));
    }
    @Test
    void creatureName2(){
        String name = "dfagra okjor -oj12 `1224%32_324f;'.'fdg";
        Creature creature = new Creature(name,0);
        assertTrue(creature.get_name().equals(name));
    }

    @Test
    void creatureInitiative1(){
        int initiative = 10;
        Creature creature = new Creature("",initiative);
        assertTrue(creature.get_initiative()==initiative);
    }
    @Test
    void creatureInitiative2(){
        int initiative = 154354252;
        Creature creature = new Creature("",initiative);
        assertTrue(creature.get_initiative()==initiative);
    }
    @Test
    void creatureInitiative3(){
        Creature creature = new Creature("",-12309);
        assertTrue(creature.get_initiative()==0);
    }

    @Test
    void creatureSetName1(){
        Creature creature = new Creature("",0);
        String name = "cool_name";
        creature.set_name(name);
        assertTrue(creature.get_name().equals(name));
    }

    @Test
    void creatureSetName2(){
        Creature creature = new Creature("",0);
        String name = "iejij 2in4oi3n kfna[]/]`. '.[]#]'] '";
        creature.set_name(name);
        assertTrue(creature.get_name().equals(name));
    }

    @Test
    void creatureSetInitiative1(){
        Creature creature = new Creature("",0);
        int initiative = 20;
        creature.set_inititative(initiative);
        assertTrue(creature.get_initiative()==initiative);
    }
    @Test
    void creatureSetInitiative2(){
        Creature creature = new Creature("",0);
        int initiative = 2032490488;
        creature.set_inititative(initiative);
        assertTrue(creature.get_initiative()==initiative);
    }

    @Test
    void trackerCreation(){
        Tracker tracker = new Tracker();
        assertNotNull(tracker);
    }

    @Test
    void trackerCreatureAdd1(){
        Tracker tracker = new Tracker();
        Creature creature = new Creature("",0);
        tracker.add_creature(creature);
        List<Integer> test_list = new ArrayList<Integer>(); 
        test_list.add(1);
        assertTrue(tracker.get_ids().equals(test_list));
    }

    @Test
    void trackerCreatureAdd2(){
        Tracker tracker = new Tracker();
        Creature creature = new Creature("",0);
        tracker.add_creature(creature);
        Creature creature2 = new Creature("",10);
        tracker.add_creature(creature2);
        List<Integer> test_list = new ArrayList<Integer>(); 
        test_list.add(1);
        test_list.add(2);
        assertTrue(tracker.get_ids().equals(test_list));
    }

    @Test
    void trackerCreatureGet1(){
        Tracker tracker = new Tracker();
        int initiative = 0;
        Creature creature = new Creature("",initiative);
        tracker.add_creature(creature);
        assertTrue(tracker.get_creature(1).get_initiative()==initiative);
    }

    @Test
    void trackerCreatureGet2(){
        Tracker tracker = new Tracker();
        Creature creature = new Creature("",20);
        tracker.add_creature(creature);
        int initiative = 7897;
        Creature creature2 = new Creature("",initiative);
        tracker.add_creature(creature2);
        assertTrue(tracker.get_creature(2).get_initiative()==initiative);
    }
}