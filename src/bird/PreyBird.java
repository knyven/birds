package bird;

public class PreyBird extends Bird{

    private String salientChar;
    private String name;

    public PreyBird(String type, boolean isExtinct, int wingNum, String favFood) {
        super(type, isExtinct, wingNum, favFood);
    }

    public PreyBird(String type, boolean isExtinct, int wingNum, String favFood, String name, String salientChar) {
        super(type, isExtinct, wingNum, favFood);
        this.name = name;
        this.salientChar = salientChar;
    }
}
