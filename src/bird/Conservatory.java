package bird;

import java.util.*;
import java.util.stream.Collectors;


public class Conservatory implements ConservatoryInterface{
    private int aviaryCount;   // num of aviaries in the conservatory
    private ArrayList<Aviary> aviaryList;  // list of aviary objects in the conservatory


    public Conservatory(){
        this.aviaryCount = 0;
        this.aviaryList = new ArrayList<>();
    }

    public ArrayList<Aviary> getAviaryList() {
        return this.aviaryList;
    }



    public Aviary makeAviary(AbstractBird object) {
        String location = "Temp location";
        String name = "Temp name";
        AviaryTypes type;
        if (object.aviaryTypes == AviaryTypes.FLIGHTLESS) {
            type = AviaryTypes.FLIGHTLESS;
        } else {
            if (object.aviaryTypes == AviaryTypes.WATERFOWL) {
                type = AviaryTypes.WATERFOWL;
            }else {
                if(object.aviaryTypes == AviaryTypes.PREY) {
                    type = AviaryTypes.PREY;
                } else {
                    type = AviaryTypes.OTHER;
                }
            }
        }
        return new Aviary(name, location, type);
    }


    @Override
    public Conservatory rescueBird(AbstractBird object) {
        //
        // if there is a compatible aviary, and it is not full put the bird object in there
        //
        for(Aviary aviary : this.aviaryList) {
            

            if (aviary.isCompatible(object) && !aviary.isFull()) {
                aviary.addBird(object);
                return this;
            }
        }
        if(this.conservatoryFull())
        {
            throw new IllegalStateException("Conservatory is full");
        }
        else {
            Aviary newAviary = (Aviary) this.makeAviary(object);
            newAviary.addBird(object);
            this.addAviary(newAviary);
            return this;
        }
    }

    public Conservatory addAviary(Aviary object) {
        if(this.conservatoryFull())
        {
            throw new IllegalStateException("Aviary is full!");
        }
        else
        {
            this.aviaryList.add(object);
            this.aviaryCount++;
        }
        return this;
    }

    public Conservatory addAviaryName(String newName, int aviaryIndex) {
        if (this.aviaryList.get(aviaryIndex) == null) {
            return this;
        }
        aviaryList.get(aviaryIndex).setAviaryName(newName);
        return this;
        }


    public Conservatory addAviaryLocation(String newName, String aviaryLocation, int aviaryIndex) {

        if (this.aviaryList.get(aviaryIndex) == null) {
            return this;
        } else {
            aviaryList.get(aviaryIndex).setAviaryLocation(aviaryLocation);
            aviaryList.get(aviaryIndex).setAviaryName(newName);
            return this;
        }
    }

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

        //System.out.println("For the conservatory we will need: \n");
        for(Map.Entry<String, Long> entry : counts.entrySet()){
             foodList.append(entry.getKey()).append(" = ").append(entry.getValue());
        }
        return foodList;
    }

    public void printMap() {
        String map = "Conservatory contains: ";
        for (int i = 0; i < this.aviaryList.size(); i++) {
            // loop over individual aviary list containing up to 5 bird objects
            System.out.println("Index ============ " + i);
            System.out.println(this.aviaryList.get(i).printAviary());
        }
    }


    public String printIndex() {
        ArrayList<String> birdIndex = new ArrayList<>();
        for(Aviary currAviary : this.aviaryList) {
            for(int i = 0; i <currAviary.getSize(); i++) {
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

    public StringBuilder guestLookUpName(String birdName){
        String name = birdName.toUpperCase();
        StringBuilder returnLocation = new StringBuilder();
        for(Aviary currAviary : this.aviaryList) {
            for (int i = 0; i < currAviary.getSize(); i++) {
                AbstractBird currBird = currAviary.birdList.get(i);
                if (name.equals(currBird.birdType.toString())) {
                    returnLocation.append("Aviary Name: ").append(currAviary.getAviaryName()).append("\n").append("Aviary Location: ").append(currAviary.getAviaryLocation()).
                            append("\n").append("Aviary Type: ").append(currAviary.getAviaryType()).append("\n").append("Bird: ").append(currBird.getType()).append("\n").
                            append("Favorite food to eat: ").append(Arrays.toString(currBird.getFavFood())).append("\n\n");
                }
            }
        }
        if(returnLocation.toString().equals("")){
            return new StringBuilder("Bird not found");
        } else {
            return returnLocation;
        }
    }
    public StringBuilder guestLookUpType(String birdType){
        String name = birdType.toUpperCase();
        StringBuilder returnLocation = new StringBuilder();
        for(Aviary currAviary : this.aviaryList) {
            for (int i = 0; i < currAviary.getSize(); i++) {
                AbstractBird currBird = currAviary.birdList.get(i);
                if (name.equals(currBird.birdType.toString())) {
                    returnLocation.append("Aviary Name: ").append(currAviary.getAviaryName()).append("\n").append("Aviary Location: ").append(currAviary.getAviaryLocation()).
                            append("\n").append("Aviary Type: ").append(currAviary.getAviaryType()).append("\n").append("Bird: ").append(currBird.getType()).append("\n").
                            append("Favorite food to eat: ").append(Arrays.toString(currBird.getFavFood())).append("\n\n");
                }
            }
        }
        if(returnLocation.toString().equals("")){
            return new StringBuilder("Bird not found");
        } else {
            return returnLocation;
        }
    }

    public boolean conservatoryFull() {
        return this.aviaryCount == 20;
    }


    public boolean conservatoryEmpty() {
        return this.aviaryCount == 0;
    }

    public int getAviaryCount() {
        return this.aviaryCount;
    }
}
