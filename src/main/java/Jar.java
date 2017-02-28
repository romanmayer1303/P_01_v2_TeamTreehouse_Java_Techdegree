import java.util.Random;

/**
 * Jar Model
 */
public class Jar {

    private final String ITEM_NAME;
    private final int MAX_NUMBER_OF_ITEMS;
    private final int NUMBER_OF_ITEMS;

    public Jar(String itemName, int maxNumberOfItems) {
        this.ITEM_NAME = itemName;
        this.MAX_NUMBER_OF_ITEMS = maxNumberOfItems;
        this.NUMBER_OF_ITEMS = getRandomNumber(maxNumberOfItems);
    }

    public int getNumberOfItems() {
        return NUMBER_OF_ITEMS;
    }

    private int getRandomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max) + 1;
    }
}
