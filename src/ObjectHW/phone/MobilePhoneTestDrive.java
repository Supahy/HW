package ObjectHW.phone;

public class MobilePhoneTestDrive {
    public static void main(String[] args) {
        MobilePhone iPhone = new MobilePhone("iPhone", "SE", 1000, 500 );

        iPhone.charge();
        iPhone.installApp("Tinder", 100);
        iPhone.installApp("Google Maps", 200);
        iPhone.installApp("Safari", 400);
        iPhone.use("YouTube", 4);
        iPhone.use("Google Maps", 3);
        iPhone.use("Safari", 4);
        iPhone.use("YouTube", 1);
        iPhone.charge();
        iPhone.use("Safari", 2);


    }
}
