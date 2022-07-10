package bird;

import java.util.ArrayList;

public interface AviaryInterface {
    ArrayList<AbstractBird> getBirds();
    int getSize();
    // access the bird type stored in BirdType enum
    AviaryTypes getAviaryType();

    Aviary addBird(AbstractBird object);
    String printAviary();

    boolean isFull();
    boolean isCompatible(AbstractBird object);

}
