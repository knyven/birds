package bird;

public interface ConservatoryInterface {

    Conservatory rescueBird(AbstractBird object);   // add bird to the conservatory


    Conservatory addAviary(Aviary object);  // creates new aviary to house added birds if an aviary does not exist
    StringBuilder calculateFood(); //prints out food quantities for birds in the conservatory
    String printMap();
    String printIndex(); //prints index of aviaries
    String printSign(int indexOfAviary); //prints out specific aviary signs and takes in the index of aviary to print
    StringBuilder guestLookUpType(String birdType);        // returns which aviary and other info about bird
    StringBuilder guestLookUpName(String name); //returns info of aviary the name of the bird is in
    boolean conservatoryFull(); //checks if conservatory is full at 20 aviaries
    boolean conservatoryEmpty(); //checks if conservatory is empty

}
