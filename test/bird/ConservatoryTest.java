package bird;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConservatoryTest {

    @Test
    public void addBird() {

        Conservatory cons = new Conservatory();

        Hawk a = new Hawk("Sam");
        Osprey b = new Osprey("Sahil");
        Hawk c = new Hawk("Venya");
        Pigeon d = new Pigeon("Sabrina");
        GreatAuk e = new GreatAuk("Frank");
        cons.addBird(a);
        cons.addBird(b);
        cons.addBird(c);
        cons.addBird(d);
        cons.addBird(e);
        System.out.println(cons.printMap());


    }
}