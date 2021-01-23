package BoxesAndShelves;

public class Toy<T extends Item> extends Item {
    private String name;

    public Toy(String name) {
        this.name = name;
    }
}
