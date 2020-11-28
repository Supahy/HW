package ItemsOnlineStore;

import java.util.Comparator;

public class Item implements Comparable<Item> {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price + " zloty ";
    }

    @Override
    public int compareTo(Item another){
        int result = price - another.price;
        return result;
    }
}
