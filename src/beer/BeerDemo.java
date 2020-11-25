package beer;

public class BeerDemo {
    public static void main(String[] args) {
        Beer kozel = new Beer("Kozel Ciemny", "Dark", 5, 6.1);
        Beer zywiec = new Beer("Zywiec Biale", "Lager", 4, 4.5);
        Beer litovel = new Beer("Litovel Premium", "Lager", 4, 4.5);
        Beer warka = new Beer("Warka 2%", "Non-alcoholic", 4, 2);

        System.out.println(kozel.equals(zywiec));
        System.out.println(zywiec.equals(litovel));
        System.out.println(litovel.equals(warka));
        System.out.println(warka.equals(kozel));
        System.out.println("=======HASHCODES========");
        System.out.println("Kozel hashcode is " + kozel.hashCode());
        System.out.println("Zywiec hashcode is " + zywiec.hashCode());
        System.out.println("Litovel hashcode is " + litovel.hashCode());
        System.out.println("Warka hashcode is " + warka.hashCode());


    }
}
