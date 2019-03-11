package com.example.wswsw.inclassassignment07_canz;

import java.io.Serializable;

public class Pokemon implements Serializable {
    String name;
    String type;
    int combatPower;
    boolean isShiny;

    public Pokemon() {
    }

    public Pokemon(String name, String type, int combatPower, boolean isShiny) {
        this.name=name;
        this.type=type;
        this.combatPower=combatPower;
        this.isShiny=isShiny;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getType(){
        return type;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public int getCombatPower(){
        return combatPower;
    }

    public void setCombatPower(int newCombatPower) {
        this.combatPower = newCombatPower;
    }

    public boolean getIsShiny(){
        return isShiny;
    }

    public void setIsShiny(boolean newIsShiny) {
        this.isShiny = newIsShiny;
    }

    public String toString() {
        return "Pokemon Name: "+ name+
                "\nType: "+type+
                "\nCombat Power: "+combatPower+
                "\nIs Shiny? "+ isShiny;
    }

}

