package bird;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
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

    @Test//Tests for getting bird list
    public void testGetBirds() {
        AbstractBird eagle1 = new Eagle("Doge1");
        AbstractBird hawk1 = new Hawk("Doge2");
        AbstractBird eagle2 = new Eagle("Doge3");
        AbstractBird hawk2 = new Hawk("Doge4");
        AbstractBird eagle3 = new Eagle("Doge5");

        Aviary preyAviary = new Aviary("PreyBird1", "Second floor", AviaryTypes.PREY);
        preyAviary.addBird(eagle1);
        preyAviary.addBird(eagle2);
        preyAviary.addBird(eagle3);
        preyAviary.addBird(hawk1);
        preyAviary.addBird(hawk2);

        ArrayList<AbstractBird> listOfAviary = preyAviary.getBirds();
        assertEquals(5, listOfAviary.size());
        assertEquals("Hawk{aviaryTypes=PREY, birdType=HAWK, name='Doge4'," +
                " sharedChar='sharp hooked beaks and visible nostrils', isExtinct=false, wingNum=2, " +
                "favFood=[SMALLMAMMALS, INSECTS]}", listOfAviary.get(4).toString());


    }

    @Test//testing getSize of aviary
    public void getSize() {

        AbstractBird emu1 = new Emus("No Flight");
        AbstractBird kiwi1 = new Kiwis("No Flight2");
        AbstractBird kiwi2 = new Kiwis("No Flight3");

        Aviary flightless = new Aviary("Flightless1", "Second floor", AviaryTypes.FLIGHTLESS);
        flightless.addBird(emu1);
        flightless.addBird(kiwi1);
        flightless.addBird(kiwi2);


        ArrayList<AbstractBird> listOfAviary = flightless.getBirds();
        assertEquals(3, listOfAviary.size());

    }

    @Test(expected = IllegalStateException.class)//test if prey bird added with flightless bird in one aviary
    public void testAviaryException(){
        AbstractBird emu1 = new Emus("No Flight");
        AbstractBird eagle1 = new Eagle("No Flight2");
        AbstractBird kiwi2 = new Kiwis("No Flight3");

        Aviary flightless = new Aviary("Flightless1", "Second floor", AviaryTypes.FLIGHTLESS);
        flightless.addBird(emu1);
        flightless.addBird(eagle1);
        flightless.addBird(kiwi2);


        ArrayList<AbstractBird> listOfAviary = flightless.getBirds();
        assertEquals("Wrong aviary for current bird", listOfAviary.size());
    }

    @Test(expected = IllegalStateException.class)//test if prey bird added with other bird in one aviary
    public void testAviaryExceptionWithOther(){
        AbstractBird geese = new Geese("Geese");
        AbstractBird eagle1 = new Eagle("No Flight2");
        AbstractBird kiwi2 = new Kiwis("No Flight3");

        Aviary flightless = new Aviary("Flightless1", "Second floor", AviaryTypes.FLIGHTLESS);
        flightless.addBird(geese);
        flightless.addBird(eagle1);
        flightless.addBird(kiwi2);


        ArrayList<AbstractBird> listOfAviary = flightless.getBirds();
        assertEquals("Wrong aviary for current bird", listOfAviary.size());
    }

    @Test//testing getting the aviary type with flightless birds
    public void getAviaryType() {
        AbstractBird emu1 = new Emus("No Flight");
        AbstractBird kiwi1 = new Kiwis("No Flight2");
        AbstractBird kiwi2 = new Kiwis("No Flight3");
        Aviary flightless = new Aviary("Flightless1", "Second floor", AviaryTypes.FLIGHTLESS);
        flightless.addBird(emu1);
        flightless.addBird(kiwi1);
        flightless.addBird(kiwi2);

        assertEquals("FLIGHTLESS", flightless.getAviaryType().toString());

    }

    @Test//testing getting the aviary type with non-specific birds
    public void getAviaryTypeOtherBirds() {
        AbstractBird pigeon1 = new Pigeon("My pigeon");
        AbstractBird parakeet1 = new Parakeet("my parakeet", 50, "good");
        AbstractBird cockatoo1 = new Cockatoo("my cockatoo", 100, "help");
        Aviary other = new Aviary("other", "Second floor", AviaryTypes.OTHER);
        other.addBird(pigeon1);
        other.addBird(parakeet1);
        other.addBird(cockatoo1);

        assertEquals("OTHER", other.getAviaryType().toString());

    }

    @Test//testing if birds are added into aviary
    public void addBird() {
        AbstractBird eagle1 = new Eagle("Doge1");
        AbstractBird hawk1 = new Hawk("Doge2");
        AbstractBird eagle2 = new Eagle("Doge3");
        AbstractBird hawk2 = new Hawk("Doge4");
        AbstractBird eagle3 = new Eagle("Doge5");


        Aviary prey = new Aviary("preybirds", "1st floor", AviaryTypes.PREY);
        prey.addBird(eagle1);
        prey.addBird(eagle2);
        prey.addBird(eagle3);
        prey.addBird(hawk1);
        prey.addBird(hawk2);


        assertEquals(5, prey.getSize());


    }

    @Test//testing if all info is printed out when calling print aviary method with type, location and all birds
    public void printAviary() {
        AbstractBird eagle1 = new Eagle("Doge1");
        AbstractBird hawk1 = new Hawk("Doge2");
        AbstractBird eagle2 = new Eagle("Doge3");
        AbstractBird hawk2 = new Hawk("Doge4");
        AbstractBird eagle3 = new Eagle("Doge5");


        Aviary prey = new Aviary("preybirds", "1st floor", AviaryTypes.PREY);
        prey.addBird(eagle1);
        prey.addBird(eagle2);
        prey.addBird(eagle3);
        prey.addBird(hawk1);
        prey.addBird(hawk2);

        assertEquals("Name ============= preybirds\n" +
                "Type ============= PREY\n" +
                "Location ========= 1st floor\n" +
                "Doge1 : EAGLE\n" +
                "Doge3 : EAGLE\n" +
                "Doge5 : EAGLE\n" +
                "Doge2 : HAWK\n" +
                "Doge4 : HAWK\n", prey.printAviary());
    }

    @Test//test for isFull checks true once birds hit 5
    public void isFull() {
        AbstractBird eagle1 = new Eagle("Doge1");
        AbstractBird hawk1 = new Hawk("Doge2");
        AbstractBird eagle2 = new Eagle("Doge3");
        AbstractBird hawk2 = new Hawk("Doge4");
        AbstractBird eagle3 = new Eagle("Doge5");


        Aviary prey = new Aviary("preybirds", "1st floor", AviaryTypes.PREY);
        prey.addBird(eagle1);
        prey.addBird(eagle2);
        prey.addBird(eagle3);
        prey.addBird(hawk1);
        prey.addBird(hawk2);

        assertTrue(prey.isFull());

    }

    @Test//test for isFull checks false if birds less than 5
    public void isFullFalse() {
        AbstractBird eagle1 = new Eagle("Doge1");
        AbstractBird hawk1 = new Hawk("Doge2");
        AbstractBird eagle2 = new Eagle("Doge3");
        AbstractBird hawk2 = new Hawk("Doge4");



        Aviary prey = new Aviary("preybirds", "1st floor", AviaryTypes.PREY);
        prey.addBird(eagle1);
        prey.addBird(eagle2);
        prey.addBird(hawk1);
        prey.addBird(hawk2);

        assertFalse(prey.isFull());
    }

    @Test//testing compatible conditions if flightless bird is added into prey aviary on accident
    public void isCompatible() {

        AbstractBird eagle1 = new Eagle("Doge1");
        AbstractBird hawk1 = new Hawk("Doge2");
        AbstractBird eagle2 = new Eagle("Doge3");
        AbstractBird hawk2 = new Hawk("Doge4");
        AbstractBird emu1 = new Emus("my emu");



        Aviary prey = new Aviary("preybirds", "1st floor", AviaryTypes.PREY);
        prey.addBird(eagle1);
        prey.addBird(eagle2);
        prey.addBird(hawk1);
        prey.addBird(hawk2);

        assertFalse(prey.isCompatible(emu1));

    }

    @Test//testing compatible conditions if prey bird is added into prey aviary
    public void isCompatibleTrue() {

        AbstractBird eagle1 = new Eagle("Doge1");
        AbstractBird hawk1 = new Hawk("Doge2");
        AbstractBird eagle2 = new Eagle("Doge3");
        AbstractBird hawk2 = new Hawk("Doge4");
        AbstractBird owl1 = new Owl("my owl");



        Aviary prey = new Aviary("preybirds", "1st floor", AviaryTypes.PREY);
        prey.addBird(eagle1);
        prey.addBird(eagle2);
        prey.addBird(hawk1);
        prey.addBird(hawk2);

        assertFalse(prey.isCompatible(owl1));

    }

    @Test//testing compatible conditions if flightless bird is added into water aviary
    public void isCompatibleFalseWater() {

        AbstractBird duck1 = new Duck("Doge1");
        AbstractBird duck2 = new Duck("Doge2");
        AbstractBird geese = new Geese("Doge3");
        AbstractBird emu1 = new Emus("Doge4");
        AbstractBird owl1 = new Owl("my owl");



        Aviary water = new Aviary("WaterBirds", "1st floor", AviaryTypes.WATERFOWL);
        water.addBird(duck1);
        water.addBird(duck2);
        water.addBird(geese);


        assertFalse(water.isCompatible(emu1));

    }
}