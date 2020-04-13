package com.codecool.ants;

public class Worker extends Ant {

    public Worker(String name) {
        super(name);
    }
    @Override
    public void setPosition(Ant[][] antColony) {
        throw new UnsupportedOperationException("Method usable only for queen type ants");
    }

    @Override
    public void setPosition(Ant[][] antColony, int line, int column) {
        antColony[line][column] = this;
        this.setLine(line);
        this.setColumn(column);
    }


}
