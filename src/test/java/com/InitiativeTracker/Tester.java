package com.InitiativeTracker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.InitiativeTracker.Creature;


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
}