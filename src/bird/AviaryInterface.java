package bird;

import java.util.ArrayList;

public interface AviaryInterface {
    ArrayList<AbstractBird> getBirds();
    int getSize();
    // access the bird type stored in BirdType enum
    AviaryTypes getAviaryType();

    //adds bird object into an aviary, also checks for type
    Aviary addBird(AbstractBird object);
    String printAviary();

    boolean isFull();
    boolean isCompatible(AbstractBird object);

}
