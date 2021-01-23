package BoxesAndShelves;

public class Food<T extends Item> extends Item {
    private String name;

    public Food(String name) {
        this.name = name;
    }
}
