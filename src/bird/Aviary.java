package bird;

import java.util.ArrayList;

public class Aviary implements AviaryInterface {

    public int birdNum;
    protected String aviaryName;                                // name of the aviary
    private final int CAP = 5;                                // max size of birds in aviary
    protected AviaryTypes aviaryTypes;                          // type of aviary
    public ArrayList<AbstractBird> birdList;                 // list of birds stored in the aviary array
    protected String aviaryLocation;                            // location of the aviary


    //====================================================================================================

    public String getAviaryLocation() {
        return this.aviaryLocation;
    }

    public Aviary(String aviaryName, String aviaryLocation, AviaryTypes aviaryTypes) {
        this.aviaryName = aviaryName;
        this.aviaryLocation = aviaryLocation;
        this.aviaryTypes = aviaryTypes;
        this.birdNum = 0;
        this.birdList = new ArrayList<>();
    }
    //getters and setters for aviaryname and location so user could access if needed and add their own name
    public String getAviaryName() {
        return this.aviaryName;
    }

    public void setAviaryName(){
        this.aviaryName = aviaryName;
    }

    public void setAviaryLocation(){
        this.aviaryLocation = aviaryLocation;
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
        if(this.isFull()) {
            throw new IllegalStateException("Too many birds for the aviary"); // no room to add
        } else {
            if(!this.isCompatible(object)) {
            throw new IllegalStateException("Wrong aviary for current bird");
        } else {
                this.birdList.add((AbstractBird) object);
                this.birdNum ++;
                return this;
            }
        }
    }

    // printAviary prints out all the current birdTypes in the arraylist of the Aviary
    //
    public String printAviary() {

        StringBuilder birds = new StringBuilder("Name ============= ");
        birds.append(this.getAviaryName()).append("\n").append("Type ============= ").append(this.getAviaryType()).append("\n")
                .append("Location ========= ").append(this.aviaryLocation).append("\n");
        for(int i = 0; i < this.birdNum; i++) {
            birds.append(this.birdList.get(i).getName()).append(" : ").
                    append(this.birdList.get(i).getType()).append("\n");
        }
        return birds.toString();
    }


    //
    // return true if the aviary is full
    public boolean isFull() {
        return this.birdList.size() > 5;
    }

    // isCompatible takes a AbstractBird object and compares it to another AbstractBird object by
    // checking the birdType

    @Override
    public boolean isCompatible(AbstractBird object) {
        boolean compatible = switch (this.aviaryTypes) {
            case FLIGHTLESS -> object instanceof FlightlessBirds;
            case PREY -> object instanceof PreyBird;
            //might need to change child classes for this
            case WATERFOWL -> object instanceof WaterBird;
            case OTHER -> !(object instanceof PreyBird) && !(object instanceof WaterBird)
                    && !(object instanceof FlightlessBirds);
        };
        return compatible;
    }

    public void setAviaryName(String aviaryName) {
        this.aviaryName = aviaryName;
    }

    public void setAviaryLocation(String aviaryLocation) {
        this.aviaryLocation = aviaryLocation;
    }

    public int getBirdNum() {
        return this.birdNum;
    }
}


