package bird;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConservatoryTest {

    @Test
    public void addBird() {

        Conservatory cons = new Conservatory();
        Conservatory cons1 = new Conservatory();

        Hawk x = new Hawk("Tommy");
        Hawk y = new Hawk("Sam");
        Cockatoo z = new Cockatoo("John", 20, "Hello");
        cons.addBird(x);


        for(int i = 0; i < 20; i++) {
            cons1.addBird(x);
        }

        cons1.printMap();






















        //System.out.println(cons.printMap());





        //System.out.println(cons.printMap());


    }
}