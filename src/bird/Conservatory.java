package bird;

import java.util.ArrayList;
import java.util.Arrays;

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
        // if there is a compatible aviary put and the conservatory
        //
        for(Aviary aviary : this.aviaryList) {
            if (aviary.isCompatible(object) && !aviary.isFull()) {
                aviary.addBird(object);
                return this;
            }

        }
        // CASE 2:
        // if the conservatory is completely empty we have to create a new aviary and put the bird
        // object inside it
        else if(this.conservatoryEmpty())
        {
            Aviary newAviary = (Aviary) this.makeAviary(object);
            newAviary.addBird(object);
            this.addAviary(newAviary);
            return this;
        }
        // CASE 3:
        // if conservatory is not full check for compatible aviaries to put current bird object into
        // the aviary that fits its instance
        else {
            for (Aviary aviary : this.aviaryList) {
                if (aviary.isCompatible(object) && this.conservatoryFull()) {
                    aviary.addBird(object);
                    return this;
                }

                // CASE 4:
                // no compatible aviary but conservatory still has space lets make a new aviary for this bird object
                //
                else if (!aviary.isCompatible(object) && !this.conservatoryFull()){
                    Aviary newAviary = (Aviary) this.makeAviary(object);
                    newAviary.addBird(object);
                    this.addAviary(newAviary);
                    return this;
                }
            }
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

    public String printMap() {
        String map = "Conservatory contains: ";

        for (int i = 0; i < this.aviaryCount; i++) {
            Aviary currentAviary = this.aviaryList.get(i);
            for (int j = 0; i < this.aviaryList.get(j).getBirdNum(); j++) {
                AbstractBird currentBird = currentAviary.birdList.get(j);
                map += currentBird.getName();
            }


        }
        return map;
    }

    public String printIndex() {
        return null;
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

    @Override
    public boolean conservatoryFull() {
        return this.aviaryCount == 20;
    }

    @Override
    public boolean conservatoryEmpty() {
        return this.aviaryCount == 0;
    }
}