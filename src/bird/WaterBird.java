package bird;
// Class: Abstract class WaterBird
//
//
// Extends AbstractBird and shares its methods.
//
// This object will be used to extend several child classes. AKA all waterbirds
//====================================================================================================================//
abstract class WaterBird extends AbstractBird{
    protected String nameOfWater;
    protected String sharedChar = "These birds are often found near bodies of water, such as freshwater or the ocean.";

    String getNameOfWater(){
        return this.nameOfWater;
    }

    @Override
    public Food[] getFavFood() {

        return this.favFood;
    }

    abstract String getSharedChar();






}
