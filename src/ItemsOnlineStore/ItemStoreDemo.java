package ItemsOnlineStore;

import java.util.List;
import java.util.TreeSet;

public class ItemStoreDemo {
    public static void main(String[] args) {
        Item backpack = new Item("Backpack", 210);
        Item boots = new Item("Nike Air Force", 360);
        Item bike = new Item("B-Twin bike", 1400);
        Item table = new Item("IKEA table", 600);
        Item patelnia = new Item("IKEA patelnia", 80);
        Item clock = new Item("Clock for a wall", 20);
        Item lavalamp = new Item("Lava lamp", 65);

        TreeSet<Item> catalogue = new TreeSet<>(List.of(backpack, boots, bike, table, patelnia, clock, lavalamp ));


        ItemByPriceComparator priceComp = new ItemByPriceComparator();
        ItemByNameComparator nameComp = new ItemByNameComparator();

        catalogue = new TreeSet<>(priceComp);
        catalogue.add(backpack);
        catalogue.add(boots);
        catalogue.add(bike);
        catalogue.add(table);
        catalogue.add(patelnia);
        catalogue.add(clock);
        catalogue.add(lavalamp);

        System.out.println(catalogue);

        catalogue = new TreeSet<>(priceComp.reversed());
        catalogue.add(backpack);
        catalogue.add(boots);
        catalogue.add(bike);
        catalogue.add(table);
        catalogue.add(patelnia);
        catalogue.add(clock);
        catalogue.add(lavalamp);

        System.out.println(catalogue);

        catalogue = new TreeSet<>(nameComp);
        catalogue.add(backpack);
        catalogue.add(boots);
        catalogue.add(bike);
        catalogue.add(table);
        catalogue.add(patelnia);
        catalogue.add(clock);
        catalogue.add(lavalamp);

        System.out.println(catalogue);

        catalogue = new TreeSet<>(nameComp.reversed());
        catalogue.add(backpack);
        catalogue.add(boots);
        catalogue.add(bike);
        catalogue.add(table);
        catalogue.add(patelnia);
        catalogue.add(clock);
        catalogue.add(lavalamp);

        System.out.println(catalogue);



    }
}
