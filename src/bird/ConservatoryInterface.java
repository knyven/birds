package bird;

public interface ConservatoryInterface {

    Conservatory rescueBird(AbstractBird object);   // add bird to the conservatory


    Conservatory addAviary(Aviary object);  // creates new aviary to house added birds if an aviary does not exist
    String calculateFood();
    void printMap();
    String printIndex();
    String printSign(int indexOfAviary);
    String guestLookUp(String type);        // returns which aviary and other info about bird
    boolean conservatoryFull();
    boolean conservatoryEmpty();

}
