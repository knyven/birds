package bird;

import java.util.ArrayList;

public class Bird implements BirdInterface {

    private String type;
    private String salientChar;
    private boolean isExtinct;
    private int wingNum;
    private ArrayList<food> favFood;


    public Bird(String type, String salientChar, boolean isExtinct, int wingNum, ArrayList<food> favFood) {
        if(wingNum <= 0 )
        {
            throw new IllegalArgumentException();
        }
        this.type = type;
        this.salientChar = salientChar;
        this.isExtinct = isExtinct;
        this.wingNum = wingNum;
        this.favFood = favFood;
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
    public ArrayList<food> getFood() {
        return this.favFood;
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