package main.java;

import main.java.Stone;
import main.java.factory.PreciousStonesTypes;
import main.java.factory.StoneFactory;
import main.java.necklace.Necklace;

import java.util.*;

public class NecklaceBuilder {
    //some static variables


    public static void main(String[] args) {
        //class with stones
        Necklace necklace = new Necklace();
        List<Stone> createdStones = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(true) {

            System.out.println("Enter command:\n 1 - Create stone \n 2 - Create necklace \n 3 - Add Stone to necklace \n 4 - Necklace info");
            int choice = in.nextInt();
            switch (choice) {
                //Creating 4 stones with factory method
                case 1: {
                    System.out.println("Choose stone to create: \n 1 - Amethyst \n 2 - Ruby \n 3 - Turquoise \n 4 - Aquamarine");
                    int choice2 = in.nextInt();
                    switch (choice2){
                        case 1: {
                            Stone amethyst = StoneFactory.getInstance(PreciousStonesTypes.AMETHYST);
                            amethyst.setAllAttributes("Amethyst", 2.3, 14000);
                            createdStones.add(amethyst);
                        }break;
                        case 2: {
                            Stone ruby = StoneFactory.getInstance(PreciousStonesTypes.RUBY);
                            ruby.setAllAttributes("Ruby", 5.0, 20000);
                            createdStones.add(ruby);
                        }break;
                        case 3: {
                            Stone turquoise = StoneFactory.getInstance(PreciousStonesTypes.TURQUOISE);
                            turquoise.setAllAttributes("Turquoise", 1.3, 13000);
                            createdStones.add(turquoise);
                        }break;
                        case 4: {
                            Stone aquamarine = StoneFactory.getInstance(PreciousStonesTypes.AQUAMARINE);
                            aquamarine.setAllAttributes("Aquamarine", 3.8, 17000);
                            createdStones.add(aquamarine);
                        }break;
                        case 5: {
                            Stone opal = StoneFactory.getInstance(PreciousStonesTypes.OPAL);
                            opal.setAllAttributes("Opal", 2.8, 23000);
                            createdStones.add(opal);
                        }break;
                        case 6: {
                            Stone amber = StoneFactory.getInstance(PreciousStonesTypes.AMBER);
                            amber.setAllAttributes("Amber", 2.5, 8400);
                            createdStones.add(amber);
                        }break;
                    }
                }break;

                case 2: {
                    System.out.println("Necklace successfully created!\n");
                }break;

                case 3: {
                    System.out.println("Here are your stones :\n");
                    for(int i=0; i< createdStones.size(); i++)
                        System.out.println(i+1 + "-" + createdStones.get(i).toString()+"\n");

                    System.out.println("Choose stone u want to add to your necklace :\n");
                    int choice2 = in.nextInt();
                    if (choice2 >= 5 || choice2 <= 0) choice2 = 2;

                    necklace.addStone(createdStones.get( choice2 - 1));
                }break;

                case 4: {
                    System.out.println("Here is your necklace :\n");
                    System.out.println(necklace.toString());

                    int choice2 = in.nextInt();
                    if (choice2 == 0) break;
                }break;

            }
        }
    }
}
