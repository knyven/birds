package bird;

import java.util.ArrayList;
import java.util.Collections;

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


    public String calculateFood() {
        Food[] listOfFood = {Food.BERRIES,
                Food.SEEDS,
                Food.FRUIT,
                Food.INSECTS,
                Food.OTHERBIRDS,
                Food.EGGS,
                Food.SMALLMAMMALS,
                Food.FRUIT,
                Food.BUDS,
                Food.LARVAE,
                Food.AQUATICINVERTABRATES,
                Food.NUTS,
                Food.VEGETATION
        };
        //set counter for all 13 foods
        int[] foodCounter = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        int sizeOfFood = 13;
        //access each aviary
        for(int i = 0; i < this.aviaryCount; i++){
            Aviary currAviary = this.aviaryList.get(i);
            //access the birds in each aviary
            for(int j = 0; j < currAviary.getSize(); j++){
                AbstractBird currBird = currAviary.birdList.get(j);
                //if birds fav found is found in listofFood add 1 to the corresponding index in foodCounter
                for(int f = 0; f < sizeOfFood; f++){
                    if(currBird.getFavFood().equals(listOfFood[f])){
                        foodCounter[f]++;
                    }
                }
            }
        }
        //output food counts along with birds
        String str = "Food types \t\t\t\t Number of Birds";
        for(int i = 0; i < sizeOfFood; i++){
            if(foodCounter[i] > 0){
                if(listOfFood[i].toString().length() < 10){
                    str += listOfFood[i] + "\t\t\t\t" + foodCounter[i] + "\n";
                }else {
                    switch (listOfFood[i]) {
                        case VEGETATION, OTHERBIRDS:
                            str += listOfFood[i].toString() + "\t\t\t\t" + foodCounter[i] + "\n";
                            break;
                        case SMALLMAMMALS:
                            str += listOfFood[i].toString() + "\t\t\t" + foodCounter[i] + "\n";
                            break;
                        case AQUATICINVERTABRATES:
                            str += listOfFood[i].toString() + "\t" + foodCounter[i] + "\n";
                            break;
                    }
                }
            }
        }
        return str;
    }


    public void printMap() {
        String map = "Conservatory contains: ";
        for (Aviary currentAviary : this.aviaryList) {
            // loop over individual aviary list containing up to 5 bird objects
            System.out.println(currentAviary.printAviary());
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
        String index = "Index of all birds in conservatory: \n";
        for(int i = 0; i <birdIndex.size(); i++) {
            index += birdIndex.get(i);
        }
        return index;
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
                    + ", Favorite food to eat: " + bird.getFavFood();
        }
        return sign;
    }

    @Override
    public int guestLookUp(String name) {
        return 0;
    }


    public boolean conservatoryFull() {
        return this.aviaryCount == 20;
    }


    public boolean conservatoryEmpty() {
        return this.aviaryCount == 0;
    }
}
