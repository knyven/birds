package bird;

import java.util.ArrayList;
import java.util.Collection;

public class Conservatory implements ConservatoryInterface{
    private int aviaryCount;   // num of aviaries in the conservatory
    private ArrayList<Aviary> aviaryList;  // list of aviary objects in the conservatory


    public Conservatory(){
        this.aviaryCount = 0;
        this.aviaryList = new ArrayList<>();
    }


    @Override
    public Conservatory addBird(AbstractBird object) {
            // if conservatory is full return state exception
        if (this.aviaryCount >= 20)
        {
            throw new IllegalStateException("The conservatory is already full");
        }

            // if conservatory is not full check for compatible aviaries to put current bird object into
        for (int i = 0; i < this.aviaryCount; i++) {
            if (this.aviaryCount < 20 && this.aviaryList.get(i).isCompatible(object)) {
                this.aviaryList.get(i).addBird(object);
                this.aviaryCount++;
                return this;
            }
        }
            // no compatible aviary but conservatory still has space lets make a new aviary for this bird object
            if (this.aviaryCount < 20 ) {
                Aviary newAviary = (Aviary) this.makeAviary(object);
                newAviary.addBird(object);
                this.addAviary(newAviary);
                this.aviaryCount++;
                return this;
            }
        return this;
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


    public boolean addAviary(Aviary object) {
        return false;
    }

    public String calculateFood() {
        Food[] listOfFood = {Food.BERRIES
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
        }
        //set counter for all 13 foods
        int[] foodCounter = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        int sizeOfFood = 13;
        //access each aviary
        for(int i = 0; i < this.aviaryCount; i++){
            Aviary currAviary = this.aviaryList.get(i);
            //access the birds in each aviary
            for(int j = 0; j < currAviary.getSize(); j++){
                AbstractBird currBird = currAviary.birdList.get(j);
                for(int f = 0; f < sizeOfFood; f++){
                    if(currBird.getFavFood().contains(listOfFood[f])){
                        foodCounter[f]++;
                    }
                }
            }
        }

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
        for(int i = 0; i < someAviary.getSize(); ++i){
            AbstractBird bird = someAviary.birdList.get(i);
            System.out.println("Bird " + i
                    + "Name : " + bird.getName()
                    + ", Bird type: " + bird.getType()
                    + ", Characteristics: " + bird.g
                    + ",Number of Wings:" + bird.getWingNum()
                    + ", Favorite food to eat: " + bird.getFavFood();
        }
    }

    @Override
    public int guestLookUp(String name) {
        return 0;
    }

    @Override
    public boolean conservatoryFull() {
        return this.aviaryCount == 20;
    }
}