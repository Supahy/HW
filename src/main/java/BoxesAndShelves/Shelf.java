package BoxesAndShelves;

import java.util.ArrayList;
import java.util.List;

public class Shelf<T> {

    private List<Box> boxes = new ArrayList<>();

    void putBox(Box box){
        boxes.add(box);
    }

    List<Box> getBoxes() {
        return boxes;
    }

}
