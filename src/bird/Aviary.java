package bird;

import java.util.ArrayList;

public class Aviary implements AviaryInterface {

    private int birdNum;
    private String aviaryName;                                // name of the aviary
    private final int CAP = 5;                                // max size of birds in aviary
    protected AviaryTypes aviaryTypes;                          // type of aviary
    protected ArrayList<AbstractBird> birdList;                 // list of birds stored in the aviary array
    private String aviaryLocation;                            // location of the aviary


    //====================================================================================================

    public Aviary(String aviaryName, String aviaryLocation, AviaryTypes aviaryTypes) {
        this.aviaryName = aviaryName;
        this.aviaryLocation = aviaryLocation;
        this.aviaryTypes = aviaryTypes;
        this.birdNum = 0;
        this.birdList = new ArrayList<>();
    }


    // returns back a list of birds in current aviary object
    public ArrayList<AbstractBird> getBirds() {
        return this.birdList;
    }

    public int getSize() {
        return this.birdNum;
    }

    public AviaryTypes getAviaryType() {
        return this.aviaryTypes;
    }

    //  addBird method takes a AbstractBird object and adds it to a aviary arraylist if
    //  the current bird is compatible with the aviary, and it is not full
    //
    public Aviary addBird(AbstractBird object) {
        if(this.birdNum == 5) {
            throw new IllegalStateException("Too many birds for the aviary"); // no room to add
        } else {
            if(!this.isCompatible(object)) {
            throw new IllegalStateException("Wrong aviary for current bird");
        } else {
                this.birdList.add(object);
                this.birdNum ++;
            }
        }

        return this;
    }

    // printAviary prints out all the current birdTypes in the arraylist of the Aviary
    //
    public String printAviary() {
        StringBuilder birds = new StringBuilder("Current aviary is a : ");
        birds.append(this.aviaryTypes).append(" aviary\n");
        for(int i = 0; i < this.birdNum; i++) {
            birds.append(this.birdList.get(i).getName()).append(" : ").append(this.birdList.get(i).getType()).append("\n");
        }
        return birds.toString();
    }


    //
    // return true if the aviary is full
    public boolean isFull() {
        return this.birdNum == 5;
    }

    // isCompatible takes a AbstractBird object and compares it to another AbstractBird object by
    // checking the birdType

    @Override
    public boolean isCompatible(AbstractBird object) {
        boolean compatible = false;
        switch (this.aviaryTypes){
            case FLIGHTLESS:
                if (object instanceof FlightlessBirds){
                    compatible = true;
                }else{
                    compatible = false;
                }
                break;

            case PREY:
                if (object instanceof PreyBird){
                    compatible = true;
                }else{
                    compatible = false;
                }
                break;
            //might need to change child classes for this
            case WATERFOWL:
                if (object instanceof WaterBird){
                    compatible = true;
                }else{
                    compatible = false;
                }
                break;

            case OTHER:
                if (object instanceof PreyBird || object instanceof WaterBird
                || object instanceof FlightlessBirds){
                    compatible = false;
                }else {
                    compatible = true;
                }
                break;
        }
        return compatible;
    }

    public int getBirdNum() {
        return this.birdNum;
    }
}


