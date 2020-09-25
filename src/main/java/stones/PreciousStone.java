package main.java.stones;

import main.java.Stone;

public class PreciousStone extends Stone {
    private double transparency = 0.87;
    private int cost;


    public PreciousStone(){ }
    public PreciousStone(String name){ setName(name);}

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
        return "The stone: " + getName() + ", transparency: " + getTransparency() + ", weight: " + getWeight() + ", costs: " + getCost() + " (precious)";
    }
}
