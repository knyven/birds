package bird;

import org.junit.Test;

import static org.junit.Assert.*;

public class AviaryTest {


    @Test
    public void testConstructor(){
        Hawk x = new Hawk("Tommy");
        Hawk y = new Hawk("Sam");
        Cockatoo z = new Cockatoo("John", 20, "Hello");
        Aviary a = new Aviary("Test aviary", "Test location", AviaryTypes.PREY);
        a.addBird(x);
        a.addBird(y);
        a.addBird(z);
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