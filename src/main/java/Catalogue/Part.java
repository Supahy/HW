package Catalogue;

public class Part {
    private int partNumber;
    private String brand;
    private String name;

    public Part(int partNumber, String brand, String name) {
        this.partNumber = partNumber;
        this.brand = brand;
        this.name = name;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Part{" +
                "partNumber=" + partNumber +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
