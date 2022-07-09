package bird;

import java.util.ArrayList;

public class Bird implements BirdInterface {

    private String type;
    private String salientChar;
    private boolean isExtinct;
    private int wingNum;
    public ArrayList<String> favFood = new ArrayList<>();


    public Bird(String type, String salientChar, boolean isExtinct, int wingNum, String item1){
        if(wingNum <= 0 )
        {
            throw new IllegalArgumentException();
        }


        this.type = type;
        this.salientChar = salientChar;
        this.isExtinct = isExtinct;
        this.wingNum = wingNum;
        favFood.add(item1);

    }


    @Override
    public String getType(){
        return this.type;
    }

    @Override
    public String getChar() {
        return this.salientChar;
    }

    @Override
    public int getWings() {
        return this.wingNum;
    }

    @Override
    public boolean boolExtinct() {
        return this.isExtinct;
    }

    @Override
    public ArrayList<String> getFood() {
        return favFood;
    }


    @Override
    public String toString() {
        return "Bird{" +
                "type='" + this.type + '\'' +
                ", salientChar='" + this.salientChar + '\'' +
                ", isExtinct=" + this.isExtinct +
                ", wingNum=" + this.wingNum +
                ", favFood=" + this.favFood +
                '}';
    }
}