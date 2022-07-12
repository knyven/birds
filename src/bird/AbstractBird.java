package bird;

abstract class AbstractBird implements BirdInterface {
    protected AviaryTypes aviaryTypes;
    protected BirdType birdType;
    protected String name;
    protected String sharedChar;
    protected boolean isExtinct;
    protected int wingNum;
    protected Food[] favFood;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return String.valueOf(this.birdType);
    }

    @Override
    public boolean isExtinct() {
        return isExtinct;
    }

    @Override
    public int getWingNum() {
        return this.wingNum;
    }

    @Override
    public Food[] getFavFood() {
        return favFood;
    }

    public String getSharedChar(){
        return this.sharedChar;
    }

}