package CloningHW;

public class CloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Processor Intel = new Processor("Intel", 2.9, 4 );
        HardDrive Kingston = new HardDrive("Kingston", "SSD", 1024);
        Laptop MSI = new Laptop("MSI", Intel, Kingston, 17, 3, 8192);

        System.out.println(MSI.toString());

        Laptop clonedLaptop = MSI.clone();

        System.out.println(clonedLaptop.toString());

        Laptop anotherLaptop = Laptop.CreateCopy(MSI);

        System.out.println(anotherLaptop.toString());
        System.out.println(MSI.getProcessor() + " " + MSI.getHardDrive());
        System.out.println(clonedLaptop.getProcessor() + " " + clonedLaptop.getHardDrive());
        System.out.println(anotherLaptop.getProcessor() + " " + anotherLaptop.getHardDrive());


    }
}
