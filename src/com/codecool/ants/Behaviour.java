package com.codecool.ants;

public interface Behaviour {
    void setPosition(Ant[][] antColony);
    void setPosition(Ant[][] antColony , int line, int column);
    default int getDistanceToQueen(Ant[][] antColony, Queen queen) {

        if(((Ant) this).getLine() == queen.getLine()) {
            return Math.abs(((Ant) this).getColumn() - queen.getColumn());
        } else if (((Ant) this).getColumn() == queen.getColumn()) {
            return Math.abs(((Ant) this).getLine() - queen.getLine());
        } else {
            return Math.abs(((Ant) this).getLine() - queen.getLine()) + Math.abs(((Ant) this).getColumn() - queen.getColumn());
        }

    }
}
