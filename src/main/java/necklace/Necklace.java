package main.java.necklace;

import main.java.Stone;

import java.util.ArrayList;
import java.util.List;

public class Necklace {

    List<Stone> stones;
    float fullCost   = 0;
    float fullWeight = 0;

    public Necklace(){
        stones = new ArrayList<Stone>();
    }

    public void addStone(Stone stone){
     if (null != stones) {
                stones.add(stone);
                fullCost += stone.getCost();
                fullWeight += stone.getWeight();
        } else {
                stones = new ArrayList<>();
        }
     }


    @Override
    public String toString() {
        return "This beautiful necklace consists of " + stones + ", necklace costs costs " + fullCost + "$, its " + fullWeight + " carats";
    }


}
