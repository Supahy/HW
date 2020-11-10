package OopHW.transport;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Transport transport = new Transport();
        PublicTransport publicTransport = new PublicTransport();
        Airplane airplane = new Airplane();
        Bicycle bicycle = new Bicycle();
        Bus bus = new Bus();
        Car car = new Car();
        Motorbike motorbike = new Motorbike();
        Scooter scooter = new Scooter();
        Train train = new Train();
        Tram tram = new Tram();

        transport.drive();
        publicTransport.drive();
        airplane.drive();
        bicycle.drive();
        bus.drive();
        car.drive();
        motorbike.drive();
        scooter.drive();
        train.drive();
        tram.drive();
        }
    }
