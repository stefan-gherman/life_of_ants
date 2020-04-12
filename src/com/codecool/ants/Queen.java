package com.codecool.ants;

public class Queen extends Ant {

    public Queen(String name) {
        super(name);
    }
   public void setPosition(Ant[][] antColony) {
        antColony[0][0] = this;
    }


}
