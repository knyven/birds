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
                for(int f = 0; f < sizeOfFood; f++){
                    if(currBird.getFavFood().equals((listOfFood[f]))){
                        foodCounter[f]++;
                    }
                }
            }
        }
        return null;
    }





    @Override
    public void printMap() {
        String map = "Conservatory contains: ";

        for (int i = 0; i < this.aviaryList.size(); i++) {

            // loop over individual aviary list containing up to 5 bird objects
            Aviary currentAviary = this.aviaryList.get(i);
            System.out.println();

            for (int j = 0; j < currentAviary.birdList.size(); j++) {
                AbstractBird currentBird = currentAviary.birdList.get(j);
                System.out.println(currentBird.getName() + " - " + currentBird.getType());
            }
        }
    }

    public String printIndex() {
        return null;
    }


    public String printSign() {
        return null;
    }


    public String printSign(int indexOfAviary) {

        Aviary someAviary = aviaryList.get(indexOfAviary);
        for(int i = 0; i < someAviary.getSize(); ++i){
            AbstractBird bird = someAviary.birdList.get(i);
            System.out.println("Bird " + i
                    + "Name : " + bird.getName()
                    + ", Bird type: " + bird.getType()
                    + ", Characteristics: "
                    + ",Number of Wings:" + bird.getWingNum()
                    + ", Favorite food to eat: " + Arrays.toString(bird.getFavFood()));
        }
        return null;
    }

    @Override
    public int guestLookUp(String name) {
        return 0;
    }

    @Override
    public boolean conservatoryFull() {
        return this.aviaryCount == 20;
    }


    public boolean conservatoryEmpty() {
        return this.aviaryCount == 0;
    }
}
