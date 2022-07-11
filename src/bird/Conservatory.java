package bird;

import java.util.ArrayList;

public class Conservatory implements ConservatoryInterface{
    private int aviaryCount;   // num of aviaries in the conservatory
    private ArrayList<Aviary> aviaryList;  // list of aviary objects in the conservatory


    public Conservatory(){
        this.aviaryCount = 0;
        this.aviaryList = new ArrayList<>();
    }


    @Override
    public Conservatory addBird(AbstractBird object) {
        for (int i = 0; i < this.aviaryCount; i++) {
            // iterate all the aviaries that are active and if one is not full and compatible put bird in there
            if (!this.aviaryList.get(i).isFull() && this.aviaryList.get(i).isCompatible(object)) {
                this.aviaryList.get(i).addBird(object);
                return this;
            }
            if (this.aviaryList.get(i).isFull() && this.conservatoryFull()) {
                throw new IllegalStateException("all aviaries are full and the conservatory is full whoops");
            }
                else { // aviary is full but conservatory still has space lets make a new aviary
                    if (this.aviaryList.get(i).isFull() && !this.conservatoryFull()) {
                        Aviary newAviary = (Aviary) this.makeAviary(object);
                        newAviary.addBird(object);
                        this.addAviary(newAviary);
                        return this;
                    }
                }
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
        return null;
    }

    public StringBuilder printMap() {
        StringBuilder map = new StringBuilder();
        for (int i = 0; i < this.aviaryCount; i++) {
            for(int j = 0; i < this.aviaryList.get(i).getBirdNum(); j++){
                AbstractBird current = this.aviaryList.get(j).getBirds();
            }

        }
        return map;
    }

    public String printIndex() {
        return null;
    }

    public String printSign() {
        return null;
    }

    @Override
    public int guestLookUp(String name) {
        return 0;
    }

    @Override
    public boolean conservatoryFull() {
        return this.aviaryCount == 1;
    }
}
