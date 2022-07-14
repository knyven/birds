package bird;
// Class: Pigeon
// Creates a bird object Pigeon with the characteristics of a Pigeon.
// Name is initialized to the String name passed in to the constructor.
//
// Extends AbstractBird and shares its methods.
//
// This object may interact with the Aviary Class and be places into created aviaries.
//====================================================================================================================//
public class Pigeon extends AbstractBird{

    public String salientChar;

    public Pigeon(String name) {
        this.name = name;
        this.birdType = BirdType.PIGEON;
        this.aviaryTypes = AviaryTypes.OTHER;
        this.isExtinct = false;
        this.wingNum = 2;
        this.sharedChar = "Feed young bird milk";
        this.favFood = new Food[] {Food.SEEDS, Food.INSECTS};
    }


    @Override
    public String getSharedChar() {
        return sharedChar;
    }
}
