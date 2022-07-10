package bird;

abstract class AbstractBird implements BirdInterface {

    private String name;
    private String type;
    private boolean isExtinct;
    private int wingNum;
    private Food[] favFood;

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