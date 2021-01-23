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

        Transport transports [] = {transport, publicTransport, airplane, bicycle, bus, car, motorbike, scooter, train, tram};

        for (int i = 0; i < transports.length; i++) {
            transports[i].drive();
        }

        }
    }
