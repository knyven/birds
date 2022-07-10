package bird;

abstract class AbstractBird implements BirdInterface {

    protected String name;
    protected String type;
    protected boolean isExtinct;
    protected int wingNum;
    protected Food[] favFood;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public boolean isExtinct() {
        return isExtinct;
    }

    @Override
    public int getWingNum() {
        return wingNum;
    }

    @Override
    public Food[] getFavFood() {
        return favFood;
    }
}