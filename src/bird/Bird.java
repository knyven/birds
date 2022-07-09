package bird;

public class Bird implements BirdInterface {

    private String type;
    private boolean isExtinct;
    private int wingNum;
    private String favFood;


    public Bird(String type, boolean isExtinct, int wingNum, String favFood) {
        if(wingNum <= 0 )
        {
            throw new IllegalArgumentException();
        }
        this.type = type;
        this.isExtinct = isExtinct;
        this.wingNum = wingNum;
        this.favFood = favFood;
    }

    @Override
    public String getType(){
        return this.type;
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
    public String getFood() {
        return null;
    }
}