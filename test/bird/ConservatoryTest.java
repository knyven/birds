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
        assertEquals(15, conservatory1.getAviaryCount());
    }

    @Test(expected = IllegalStateException.class)// test rescuing too many birds
    public void testRescueBirdTooMany() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        for (int i = 0; i < 1500; i++) {
            conservatory1.rescueBird(hawk1);
        }
        assertEquals("Conservatory is full", conservatory1.getAviaryCount());

    }

    @Test // testing output for food calculation for one bird
    public void testCalculateFoodNinety() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        for (int i = 0; i < 90; i++) {
            conservatory1.rescueBird(hawk1);
        }
        String expected = String.valueOf(conservatory1.calculateFood());
        assertEquals(expected, "[SMALLMAMMALS, INSECTS] = 90");

    }

    @Test // testing output for food calculation for one bird
    public void testCalculateFoodSixty() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        for (int i = 0; i < 60; i++) {
            conservatory1.rescueBird(hawk1);
        }
        String expected = String.valueOf(conservatory1.calculateFood());
        assertEquals(expected, "[SMALLMAMMALS, INSECTS] = 60");

    }

    @Test // testing output for food calculation for one bird
    public void testCalculateFood() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        conservatory1.rescueBird(hawk1);
        String expected = String.valueOf(conservatory1.calculateFood());
        assertEquals(expected, "[SMALLMAMMALS, INSECTS] = 1");
    }

    @Test
    public void printMap() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        for (int i = 0; i < 1; i++) {
            conservatory1.rescueBird(hawk1);
        }

    }

    @Test
    public void printIndex() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        for (int i = 0; i < 1; i++) {
            conservatory1.rescueBird(hawk1);
        }
        String actual = conservatory1.printIndex();
        assertEquals("Index of all birds in conservatory: \nTommy========Temp name\n", actual);
    }

    @Test
    public void printSign() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        for (int i = 0; i < 60; i++) {
            conservatory1.rescueBird(hawk1);
        }

    }

    @Test
    public void guestLookUpName() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
        for (int i = 0; i < 1; i++) {
            conservatory1.rescueBird(hawk1);
        }
        String actual = """
                Aviary Name: Temp name
                Aviary Location: Temp location
                Aviary Type: PREY
                Bird: HAWK
                Favorite food to eat: [SMALLMAMMALS, INSECTS]\n\n""";

        assertEquals(conservatory1.guestLookUpName("Tommy").toString(), actual);
    }

    @Test
    public void guestLookUpType() {
        Conservatory conservatory1 = new Conservatory();
        Hawk hawk1 = new Hawk("Tommy");
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

}