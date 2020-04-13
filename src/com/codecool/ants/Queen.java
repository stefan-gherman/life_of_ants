package com.codecool.ants;

public class Queen extends Ant {

    public Queen(String name) {
        super(name);
    }
    @Override
   public void setPosition(Ant[][] antColony) {
        antColony[0][0] = this;
        this.setLine(0);
        this.setColumn(0);
    }

    @Override
    public void setPosition(Ant[][] antColony, int line, int column) {
        throw new UnsupportedOperationException("Method usable only for non-queen type ants");
    }




}
