package bird;

public interface BirdInterface {
    //returns String of bird name
    String getName();
    //gets type of bird
    BirdType getType();
    //checks for if bird is extinct or not
    boolean isExtinct();
    //returns integer value of number of wings
    int getWingNum();

    Food[] getFavFood();

    String getSharedChar();
}
