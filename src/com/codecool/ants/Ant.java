package com.codecool.ants;

public abstract class Ant implements Behaviour {
    private String name = "";
    private int line;
    private int column;

    public Ant() {
        this.name = "Some unknown ant";
    }
    public Ant(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void saySomething(String phrase) {
        System.out.println(phrase);
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setLine(int line) {
        this.line = line;
    }

    @Override
    public void setPosition(Ant[][] antColony) {

    }

    @Override
    public void setPosition(Ant[][] antColony, int line, int column) {

    }

    @Override
    public String toString() {
        return "Ant {" +
                "name='" + name + '\'' +
                '}';
    }
}
