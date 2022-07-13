package bird;

import java.util.*;
import java.util.stream.Collectors;

//===================================================================================================================//
//                                                                                                                   //
//      Conservatory class to be used with Aviary class                                                              //
//      ------------------------------------------------                                                             //
//                                                                                                                   //
//===================================================================================================================//
public class Conservatory implements ConservatoryInterface {
    private int aviaryCount;   // num of aviaries in the conservatory
    private ArrayList<Aviary> aviaryList;  // list of aviary objects in the conservatory

    //====================================================================================================================//
//=============================================CONSTRUCTOR============================================================//
    public Conservatory() {
        this.aviaryCount = 0;
        this.aviaryList = new ArrayList<>();
    }

//====================================================================================================================//
//===========================================MAIN METHODS=============================================================//

    //
    // makeAviary used by rescueBird in case where a new aviary is needed
    //
    public Aviary makeAviary(AbstractBird object) {
        String location = "Temp location";
        String name = "Temp name";
        AviaryTypes type;
        if (object.aviaryTypes == AviaryTypes.FLIGHTLESS) {
            type = AviaryTypes.FLIGHTLESS;
        } else {
            if (object.aviaryTypes == AviaryTypes.WATERFOWL) {
                type = AviaryTypes.WATERFOWL;
            } else {
                if (object.aviaryTypes == AviaryTypes.PREY) {
                    type = AviaryTypes.PREY;
                } else {
                    type = AviaryTypes.OTHER;
                }
            }
        }
        return new Aviary(name, location, type);
    }

    //
    // rescueBird takes a AbstractBird object and adds it to the conservatory
    //
    public Conservatory rescueBird(AbstractBird object) {
        // loop over aviaries in the aviaryList and check if any are compatible
        // that includes checking if it is full and if the Aviary type is compatible
        for (Aviary aviary : this.aviaryList) {
            if (aviary.isCompatible(object) && !aviary.isFull()) {
                aviary.addBird(object);
                return this;
            }
        }
        // Check if the whole conservatory is full
        // if it is throw an exception for full conservatory
        if (this.conservatoryFull()) {
            throw new IllegalStateException("Conservatory is full");
        }
        // Create new aviary using the makeAviary function
        // Store the aviary in the aviaryList using addAviary function
        else {
            Aviary newAviary = (Aviary) this.makeAviary(object);
            newAviary.addBird(object);
            this.addAviary(newAviary);
            return this;
        }
    }

    //
    //  Used by rescueBird in creation of new aviary
    //
    public Conservatory addAviary(Aviary object) {
        if (this.conservatoryFull()) {
            throw new IllegalStateException("Aviary is full!");
        } else {
            this.aviaryList.add(object);
            this.aviaryCount++;
        }
        return this;
    }

    //
    //  addAviaryName adds aviary name to conservatory object aviaryList based on aviaryIndex
    //
    public Conservatory addAviaryName(String newName, int aviaryIndex) {
        if (this.aviaryList.get(aviaryIndex) == null) {
            return this;
        }
        aviaryList.get(aviaryIndex).setAviaryName(newName);
        return this;
    }

    //
    //  addAviaryName adds aviary name and location to conservatory object aviaryList based on aviaryIndex
    //
    public Conservatory addAviaryLocation(String newName, String aviaryLocation, int aviaryIndex) {

        if (this.aviaryList.get(aviaryIndex) == null) {
            return this;
        } else {
            aviaryList.get(aviaryIndex).setAviaryLocation(aviaryLocation);
            aviaryList.get(aviaryIndex).setAviaryName(newName);
            return this;
        }
    }

    //
    //  calculateFood loops over all the birds and collects all food in an arrayList
    //  then stream().collects maps and counts the instances of each food type in a map
    //  return the foodList as StringBuilder object with each food and total amount needed
    //
    public StringBuilder calculateFood() {
        ArrayList<String> food = new ArrayList<>();
        StringBuilder foodList = new StringBuilder();
        for (Aviary currAviary : this.aviaryList) {
            for (int i = 0; i < currAviary.getSize(); i++) {
                AbstractBird currBird = currAviary.birdList.get(i);
                food.add(Arrays.toString(currBird.getFavFood()));
            }
        }
        //TODO we can flatten the list here and get the output to be each individual food item
        Map<String, Long> counts = food.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        for (Map.Entry<String, Long> entry : counts.entrySet()) {
            foodList.append(entry.getKey()).append(" = ").append(entry.getValue());
        }
        return foodList;
    }

    //
    // Prints map of all the birds in each aviary using the printAviary from aviary
    //
    public void printMap() {
        String map = "Conservatory contains: ";
        for (int i = 0; i < this.aviaryList.size(); i++) {
            // loop over individual aviary list containing up to 5 bird objects
            System.out.println("Index ============ " + i);
            System.out.println(this.aviaryList.get(i).printAviary());
        }
    }

    //
    // Print Index goes over all the birds in the conservatory collects them into a arrayList and
    // alphabetizes the list and returns the list
    //
    public String printIndex() {
        ArrayList<String> birdIndex = new ArrayList<>();
        for (Aviary currAviary : this.aviaryList) {
            for (int i = 0; i < currAviary.getSize(); i++) {
                AbstractBird currBird = currAviary.birdList.get(i);
                birdIndex.add(currBird.getName() + "========" + currAviary.getAviaryName() + "\n");
            }
        }
        Collections.sort(birdIndex);
        StringBuilder index = new StringBuilder("Index of all birds in conservatory: \n");
        for (String s : birdIndex) {
            index.append(s);
        }
        return index.toString();
    }

    //
    // print sign loops over a birdList based on the index passed in
    // and returns the String with all the Bird characteristics
    //
    public String printSign(int indexOfAviary) {

        Aviary someAviary = aviaryList.get(indexOfAviary);
        String sign = "";
        for (int i = 0; i < someAviary.getSize(); ++i) {
            AbstractBird bird = someAviary.birdList.get(i);
            sign += "Bird " + i
                    + "Name : " + bird.getName()
                    + ", Bird type: " + bird.getType()
                    + ", Characteristics: " + bird.getSharedChar()
                    + ",Number of Wings:" + bird.getWingNum()
                    + ", Favorite food to eat: " + Arrays.toString(bird.getFavFood());
        }
        return sign;
    }
    //
    // GuestLookUpName looks for the bird name in the conservatory
    // and returns the StringBuilder object with all instances
    //
    public StringBuilder guestLookUpName(String birdName) {
        String name = birdName.toUpperCase();
        StringBuilder returnLocation = new StringBuilder();
        for (Aviary currAviary : this.aviaryList) {
            for (int i = 0; i < currAviary.getSize(); i++) {
                AbstractBird currBird = currAviary.birdList.get(i);
                if (name.equals(currBird.getName().toUpperCase())) {
                    returnLocation.append("Aviary Name: ").append(currAviary.getAviaryName()).append("\n").
                            append("Aviary Location: ").append(currAviary.getAviaryLocation()).append("\n").
                            append("Aviary Type: ").append(currAviary.getAviaryType()).append("\n").
                            append("Bird: ").append(currBird.getType()).append("\n").
                            append("Favorite food to eat: ").append(Arrays.toString(currBird.getFavFood())).append("\n\n");
                }
            }
        }
        if (returnLocation.toString().equals("")) {
            return new StringBuilder("Bird not found");
        } else {
            return returnLocation;
        }
    }
    //
    // GuestLookUpType looks for the bird type in the conservatory
    // and returns the StringBuilder object with all instances
    //
    public StringBuilder guestLookUpType(String birdType) {
        String name = birdType.toUpperCase();
        StringBuilder returnLocation = new StringBuilder();
        for (Aviary currAviary : this.aviaryList) {
            for (int i = 0; i < currAviary.getSize(); i++) {
                AbstractBird currBird = currAviary.birdList.get(i);
                if (name.equals(currBird.birdType.toString())) {
                    returnLocation.append("Aviary Name: ").append(currAviary.getAviaryName()).append("\n").
                            append("Aviary Location: ").append(currAviary.getAviaryLocation()).append("\n").
                            append("Aviary Type: ").append(currAviary.getAviaryType()).append("\n").
                            append("Bird: ").append(currBird.getType()).append("\n").
                            append("Favorite food to eat: ").append(Arrays.toString(currBird.getFavFood())).append("\n\n");
                }
            }
        }
        if (returnLocation.toString().equals("")) {
            return new StringBuilder("Bird not found");
        } else {
            return returnLocation;
        }
    }
//====================================================================================================================//
//===========================================GETTERS==================================================================//

    public boolean conservatoryFull() {
        return this.aviaryCount == 20;
    }

    public boolean conservatoryEmpty() {
        return this.aviaryCount == 0;
    }

    public int getAviaryCount() {
        return this.aviaryCount;
    }

    public ArrayList<Aviary> getAviaryList() {
        return this.aviaryList;
    }
}