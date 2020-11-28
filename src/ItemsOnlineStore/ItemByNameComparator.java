package ItemsOnlineStore;

import java.util.Comparator;

public class ItemByNameComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2){
        return  item1.getName().compareTo(item2.getName());
    }
}
