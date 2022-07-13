package bird;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConservatoryTest {

    @Test // test rescuing one bird
    public void testRescueBirdOne() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        conservatory1.rescueBird(hawk1);
        assertEquals(1, conservatory1.getAviaryCount());
    }

    @Test // test rescuing no birds into aviary
    public void testRescueBirdNone() {
        Conservatory conservatory1 = new Conservatory();
        assertEquals(0, conservatory1.getAviaryCount());
    }

    @Test // test rescuing 90 birds
    public void testRescueBirdNinety() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        for (int i = 0; i < 90; i++) {
            conservatory1.rescueBird(hawk1);
        }
        assertEquals(18, conservatory1.getAviaryCount());
    }
    @Test // test rescuing 90 birds
    public void testRescueBird100() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        for (int i = 0; i < 100; i++) {
            conservatory1.rescueBird(hawk1);
        }
        assertEquals(20, conservatory1.getAviaryCount());
    }
    @Test(expected = IllegalStateException.class) // test rescuing 101
    public void testRescueBird101() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        for (int i = 0; i < 101; i++) {
            conservatory1.rescueBird(hawk1);
        }
        assertEquals("Conservatory is full", conservatory1.getAviaryCount());
    }

    @Test(expected = IllegalStateException.class)// test rescuing way too many birds
    public void testRescueBirdTooMany() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        for (int i = 0; i < 1500; i++) {
            conservatory1.rescueBird(hawk1);
        }
        assertEquals("Conservatory is full", conservatory1.getAviaryCount());

    }

    @Test // testing output for food calculation for 90 hawks
    public void testCalculateFoodNinety() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        for (int i = 0; i < 90; i++) {
            conservatory1.rescueBird(hawk1);
        }
        String expected = "SMALLMAMMALS = 90\n" +
                "INSECTS = 90\n";
        assertEquals(expected, conservatory1.calculateFood().toString());

    }

    @Test // testing output for food calculation for 60 hawks
    public void testCalculateFoodSixty() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        for (int i = 0; i < 60; i++) {
            conservatory1.rescueBird(hawk1);
        }
        String expected = "SMALLMAMMALS = 60\n" +
                "INSECTS = 60\n";
        assertEquals(expected, conservatory1.calculateFood().toString());

    }

    @Test // testing output for food calculation for different birds
    public void testCalculateFoodDiffBirds() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Jenny");
        Kiwis kiwi1 = new Kiwis("Kiwi");
        Parakeet parakeet1 = new Parakeet("Jon", 10, "Hello");
        Pigeon pigeon1 = new Pigeon("Lenny");
        Geese geese1 = new Geese("Nathan");
        Duck duck1 = new Duck("Ducky");
        for(int i = 0; i < 12; i++){
            conservatory1.rescueBird(hawk1);
            conservatory1.rescueBird(kiwi1);
            conservatory1.rescueBird(duck1);
            conservatory1.rescueBird(geese1);
            conservatory1.rescueBird(parakeet1);
            conservatory1.rescueBird(pigeon1);
            conservatory1.rescueBird(hawk1);
        }

        StringBuilder expected = new StringBuilder(
                "SEEDS = 36\n" +
                "NUTS = 12\n" +
                "SMALLMAMMALS = 36\n" +
                "LARVAE = 12\n" +
                "INSECTS = 60\n" +
                "VEGETATION = 36\n");

        assertEquals(expected, conservatory1.calculateFood());
    }

    @Test // testing output for food calculation for one bird
    public void testCalculateFood() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Jenny");
        conservatory1.rescueBird(hawk1);
        String expected = "SMALLMAMMALS = 1\n" +
                "INSECTS = 1\n";
        assertEquals(expected, conservatory1.calculateFood().toString());
    }

    @Test
    public void testPrintMap() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Colby");
        for (int i = 0; i < 1; i++) {
            conservatory1.rescueBird(hawk1);
        }
        conservatory1.printMap();

    }

    @Test
    public void testPrintIndex() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("John");
        for (int i = 0; i < 1; i++) {
            conservatory1.rescueBird(hawk1);
        }
        String actual = conservatory1.printIndex();
        assertEquals("Index of all birds in conservatory: \nJohn========Temp name\n", actual);
    }

    @Test
    public void testPrintSign() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        for (int i = 0; i < 1; i++) {
            conservatory1.rescueBird(hawk1);
        }
        String actual = "Bird : 0  Name : Tommy, Bird type: HAWK, Characteristics: sharp " +
                "hooked beaks and visible nostrils, Number " +
                "of Wings:2, Favorite food to eat: [SMALLMAMMALS, INSECTS]";
        assertEquals(conservatory1.printSign(0),actual);

    }

    @Test
    public void testGuestLookUpName() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Jackson");
        for (int i = 0; i < 1; i++) {
            conservatory1.rescueBird(hawk1);
        }
        String actual = """
                Aviary Name: Temp name
                Aviary Location: Temp location
                Aviary Type: PREY
                Bird: HAWK
                Favorite food to eat: [SMALLMAMMALS, INSECTS]\n\n""";

        assertEquals(conservatory1.guestLookUpName("Jackson").toString(), actual);
    }

    @Test
    public void testGuestLookUpType() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Olga");
        for (int i = 0; i < 1; i++) {
            conservatory1.rescueBird(hawk1);
        }
        String actual = """
                Aviary Name: Temp name
                Aviary Location: Temp location
                Aviary Type: PREY
                Bird: HAWK
                Favorite food to eat: [SMALLMAMMALS, INSECTS]\n\n""";

        assertEquals(conservatory1.guestLookUpType("Hawk").toString(), actual);
    }


    @Test
    public void testAddAviaryLocation() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Lincoln");
        conservatory1.rescueBird(hawk1);
        conservatory1.addAviaryName("Hawk Aviary", 0);

        String actual = "Hawk Aviary";
        assertEquals(conservatory1.getAviaryList(0).getAviaryName(), actual);

    }

    @Test
    public void testAddAviaryNameLocation() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Ben");
        conservatory1.rescueBird(hawk1);
        conservatory1.addAviaryLocation("Hawk Aviary", "Far side of the conservatory",0);

        String actual = "Hawk Aviary" + "Far side of the conservatory";
        assertEquals(conservatory1.getAviaryList(0).getAviaryName() +
                conservatory1.getAviaryList(0).getAviaryLocation(), actual);

    }



}