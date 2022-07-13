package bird;

abstract class AbstractBird implements BirdInterface {
    protected AviaryTypes aviaryTypes;
    protected BirdType birdType;
    protected String name;
    protected String sharedChar;
    protected boolean isExtinct;
    protected int wingNum;
    protected Food[] favFood;

    //get name of bird
    @Override
    public String getName() {
        return name;
    }
    //get type of bird
    @Override
    public BirdType getType() {
        return this.birdType;
    }
    //true if bird is extinct otherwise false
    @Override
    public boolean isExtinct() {
        return isExtinct;
    }
    //get number of wings for bird
    @Override
    public int getWingNum() {
        return this.wingNum;
    }

    //get favorite food of bird based off of enums list
    public Food[] getFavFood() {
        return this.favFood;
    }
    //get shared characteristics of bird groups: flightless, prey bird, parrots, owls, waterbirds
    abstract String getSharedChar();


}