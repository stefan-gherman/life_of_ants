package com.codecool.ants;

public abstract class Ant {
    private String name = "";

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

    @Override
    public String toString() {
        return "Ant {" +
                "name='" + name + '\'' +
                '}';
    }
}
