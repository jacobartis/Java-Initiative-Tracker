package com.InitiativeTracker;
class Creature {
    String name = "";
    int initiative = 0;
    
    public Creature(){
        this.name = "Undefined";
        this.initiative = 0;
    }

    public Creature(String name,int initiative){
        this.name = name;
        this.initiative = initiative;
    }

    public String get_name(){
        return this.name;
    }

    public int get_initiative(){
        return this.initiative;
    }

    public void set_name(String name){
        this.name = name;
    }

    public void set_inititative(int initiative){
        this.initiative = initiative;
    }

}