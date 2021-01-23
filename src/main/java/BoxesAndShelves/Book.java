package BoxesAndShelves;

public class Book<T extends Item> extends Item {
    private String name;

    public Book(String name) {
        this.name = name;
    }
}
