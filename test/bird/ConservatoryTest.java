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
        Kiwis u = new Kiwis("Nathan");
        Cockatoo z = new Cockatoo("John", 20, "Hello");
        cons.rescueBird(x);


        for(int i = 0; i < 20; i++) {
            cons1.rescueBird(x);
            cons1.rescueBird(y);
            cons1.rescueBird(z);
            cons1.rescueBird(u);
        }


        cons1.printMap();
        System.out.println(cons1.calculateFood());
        System.out.println(cons1.printIndex());



    }
}