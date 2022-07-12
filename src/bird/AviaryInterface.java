package bird;

import java.util.ArrayList;

public interface AviaryInterface {
    //method for getting birds to put them into an Array list
    ArrayList<AbstractBird> getBirds();
    int getSize();
    // access the bird type stored in BirdType enum
    AviaryTypes getAviaryType();

    //adds bird object into an aviary, also checks for type
    Aviary addBird(AbstractBird object);

    //returns a string that prints the aviary and all the info
    String printAviary();

    //checks if aviary is full at 5 bird cap
    boolean isFull();
    //checks to make sure the bird types (waterbird, prey, flightless, and other)
    //are not in the same aviary
    boolean isCompatible(AbstractBird object);

}
