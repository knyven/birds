package bird;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConservatoryTest {

    @Test
    public void addBird() {

        Conservatory cons = new Conservatory();

        Hawk x = new Hawk("Tommy");
        Hawk y = new Hawk("Sam");
        Cockatoo z = new Cockatoo("John", 20, "Hello");
        Aviary a = new Aviary("Test aviary", "Test location", AviaryTypes.PREY);
        a.addBird(x);
        a.addBird(y);


        for(int i = 0; i < 121; i++) {
            cons.addBird(x);
        }



















        //System.out.println(cons.printMap());





        //System.out.println(cons.printMap());


    }
}