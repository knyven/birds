package bird;

import org.junit.Test;

import static org.junit.Assert.*;

public class AviaryTest {


    @Test
    public void testConstructor(){
        Hawk x = new Hawk("Tommy");
        Hawk y = new Hawk("Venya");
        Hawk z = new Hawk("Sahil");
        Hawk q = new Hawk("Samuel");
        Hawk t = new Hawk("Liane");
        Hawk j = new Hawk("Sabrina");
        Cockatoo b = new Cockatoo("John", 20, "Hello");
        Aviary a = new Aviary("Test aviary", "Test location", AviaryTypes.PREY);
        a.addBird(x);
        a.addBird(y);
        a.addBird(z);
        a.addBird(q);
        a.addBird(t);




        System.out.println(a.printAviary());
    }

    @Test
    public void testGetBirds() {
    }

    @Test
    public void getSize() {
    }

    @Test
    public void getAviaryType() {
    }

    @Test
    public void addBird() {
    }

    @Test
    public void printAviary() {
    }

    @Test
    public void isFull() {
    }

    @Test
    public void isCompatible() {
    }
}