package main.java;

public abstract class Stone{
    private String name;
    private double weight;

    // Конструкторы
    public Stone(){ }

    public void setAllAttributes(String name, double weight, int cost)
    {
        setName(name);
        setWeight(weight);
        setCost(cost);
    }

    //Methods
    public abstract void setCost(int cost);
    public abstract float getCost();

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight(){return weight;}

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){return name;}

    public abstract String toString();
}
