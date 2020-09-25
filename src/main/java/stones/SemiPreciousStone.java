package main.java.stones;

import main.java.Stone;

public class SemiPreciousStone extends Stone {
    private int cost;
    private double transparency = 0.87;


    public SemiPreciousStone(){ }
    public SemiPreciousStone(String name){ setName(name);}

    @Override
    public void setCost(int _cost) {
        cost = _cost;
    }

    @Override
    public float getCost() {
        return cost;
    }

    public double getTransparency() {
        return transparency;
    }

    @Override
    public String toString() {
        return "The stone: " + getName() + ", transparency: " + getTransparency() + getWeight() + ", costs: " + getCost() + " (semiprecious)";
    }
}
