package bird;
//Abstract class for prey bird type
abstract class PreyBird extends AbstractBird{


    protected String sharedChar = "sharp hooked beaks and visible nostrils";


    @Override
    public Food[] getFavFood() {

        return this.favFood;
    }

    abstract String getSharedChar();

}
