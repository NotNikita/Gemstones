package main.java.factory;

import main.java.Stone;
import main.java.stones.precious.Aquamarine;
import main.java.stones.precious.Opal;
import main.java.stones.precious.Ruby;
import main.java.stones.precious.Sapphire;
import main.java.stones.semiprecious.Amber;
import main.java.stones.semiprecious.Amethyst;
import main.java.stones.semiprecious.Fluorite;
import main.java.stones.semiprecious.Turquoise;


public class StoneFactory {

    public static Stone getInstance(PreciousStonesTypes type) {
        switch(type)
        {

            case SAPPHIRE: return new Sapphire();

            case RUBY: return new Ruby();

            case OPAL: return new Opal();

            case AQUAMARINE: return new Aquamarine();
    // Semi Precious
            case AMBER: return new Amber();

            case TURQUOISE: return new Turquoise();

            case AMETHYST: return new Amethyst();

            case FLUORITE: return new Fluorite();

            default: throw new IllegalArgumentException("Wrong Stone type:" + type);
        }
    }

}