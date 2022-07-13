package bird;

import java.util.ArrayList;
//====================================================================================================================//
//                                                                                                                    //
//      Aviary class to be used to store AbstractBird Child class objects                                              //
//      ------------------------------------------------                                                              //
//                                                                                                                    //
//       Ideal use case:                                                                                              //
//       Step 1: Create an aviary using the constructor                                                               //
//       Step 2: Create a bird object using one of the child classes in the bird package.                             //
//       Step 3: Add the bird to the aviary by calling addBird(object) on the aviary you created in step 1.           //
//                                                                                                                    //
//====================================================================================================================//
public class Aviary implements AviaryInterface {

    public int birdNum;
    protected String aviaryName;                                // name of the aviary
    protected AviaryTypes aviaryTypes;                          // type of aviary
    public ArrayList<AbstractBird> birdList;                 // list of birds stored in the aviary array
    protected String aviaryLocation;                            // location of the aviary


//====================================================================================================================//
//=============================================CONSTRUCTOR============================================================//

    public Aviary(String aviaryName, String aviaryLocation, AviaryTypes aviaryTypes) {
        this.aviaryName = aviaryName;
        this.aviaryLocation = aviaryLocation;
        this.aviaryTypes = aviaryTypes;
        this.birdNum = 0;
        this.birdList = new ArrayList<>();
    }

//====================================================================================================================//
//===========================================MAIN METHODS=============================================================//

    //
    //  addBird method takes a AbstractBird object and adds it to an aviary arraylist if
    //  the current bird is compatible with the aviary, and it is not full
    //
    public Aviary addBird(AbstractBird object) {
        if (object.isExtinct) {
            throw new IllegalStateException("Bird you are trying to add is extinct");
        }
        if (this.isFull()) {
            throw new IllegalStateException("Too many birds for the aviary"); // no room to add
        } else {
            if (!this.isCompatible(object)) {
                throw new IllegalStateException("Wrong aviary for current bird");
            } else {
                this.birdList.add(object);
                this.birdNum++;
                return this;
            }
        }
    }

    //
    // printAviary prints out all the current birdTypes in the arraylist of the Aviary
    //
    public String printAviary() {

        StringBuilder birds = new StringBuilder("Name of Aviary ============= ");
        birds.append(this.getAviaryName()).append("\n").
                append("Type of Aviary ============= ").append(this.getAviaryType()).append("\n")
                .append("Location of Aviary========= ").append(this.aviaryLocation).append("\n\n")
                .append("Name   : Type").append("\n");
        for (int i = 0; i < this.birdNum; i++) {
            birds.append(this.birdList.get(i).getName()).append(" : ").
                    append(this.birdList.get(i).getType());
        }
        return birds.toString();
    }

    //
    // isCompatible takes a AbstractBird object and compares it to another AbstractBird object by
    // checking the birdType
    //
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
    //
    //  isFull return true if the aviary is full
    //
    public boolean isFull() {
        return this.birdList.size() >= 5;
    }
//====================================================================================================================//
//===========================================SETTERS==================================================================//

    public void setAviaryName(String aviaryName) {
        this.aviaryName = aviaryName;
    }

    public void setAviaryLocation(String aviaryLocation) {
        this.aviaryLocation = aviaryLocation;
    }



//====================================================================================================================//
//===========================================GETTERS==================================================================//

    public ArrayList<AbstractBird> getBirds() {

        return this.birdList;
    }

    public int getSize() {

        return this.birdNum;
    }

    public AviaryTypes getAviaryType() {

        return this.aviaryTypes;
    }

    public String getAviaryLocation() {
        return this.aviaryLocation;
    }
    public String getAviaryName() {
        return this.aviaryName;
    }

}