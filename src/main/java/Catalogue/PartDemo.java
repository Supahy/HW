package Catalogue;


import java.util.HashMap;

public class PartDemo {
    public static void main(String[] args) {

        Part engine = new Part(3001, "BMW", "BMW Gasoline engine");
        Part breaks = new Part(3002, "Toyota", "Toyota breaks");
        Part leftDoor = new Part(3003, "Range Rover", "Range Rover Sport left door");
        Part rightDoor = new Part(3013, "Range Rover", "Range Rover Sport right door");
        Part bulletproofWindow = new Part(3004, "Mercedes Benz", "Mercedes S Class bulletproof window");




        HashMap<Integer, Part> partsCatalogue = new HashMap<>();

        partsCatalogue.put(engine.getPartNumber(), engine);
       partsCatalogue.put(breaks.getPartNumber(), breaks);
       partsCatalogue.put(leftDoor.getPartNumber(), leftDoor);
       partsCatalogue.put(rightDoor.getPartNumber(), rightDoor);
       partsCatalogue.put(bulletproofWindow.getPartNumber(), bulletproofWindow);




        System.out.println(partsCatalogue.get(3001));
        System.out.println(partsCatalogue.get(3013));
        System.out.println("===========");
        System.out.println(partsCatalogue);


    }
}
