package bird;

public interface ConservatoryInterface {

    Conservatory addBird(AbstractBird object);   // add bird to the conservatory


    boolean addAviary(Aviary object);  // creates new aviary to house added birds if an aviary does not exist
    String calculateFood();
    StringBuilder printMap();
    String printIndex();
    String printSign();
    int guestLookUp(String name);        // returns which aviary and other info about bird
    boolean conservatoryFull();

}
