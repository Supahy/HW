package BoxesAndShelves;

import java.util.ArrayList;

public class Box<T> {

    public ArrayList<T> items = new ArrayList<T>();

    void putItem(T item){
        items.add(item);
    }

    ArrayList<T> getItems(){
        return items;
    }
}
