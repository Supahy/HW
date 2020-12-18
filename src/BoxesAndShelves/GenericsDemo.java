package BoxesAndShelves;

public class GenericsDemo {
    public static void main(String[] args) {
        Box<Book> books = new Box<>();
        Box<Toy> toys = new Box<>();
        Box<Food> food = new Box<>();
        Box<Fantasy> fantasyBooks = new Box<>();

        Shelf<Box<Toy>> toysShelf = new Shelf<>();
        Shelf<Box<Book>> booksShelf = new Shelf<>();
        Shelf<Box<?>> stuffShelf = new Shelf<>();

        Book horrorBook = new Book("Haunted Forest");
        Fantasy fantasyBook = new Fantasy("Harry");
        Toy bear = new Toy("Teddy");
        Food hotdog  = new Food("Hotdog");

        books.putItem(horrorBook);
        books.putItem(fantasyBook);
        fantasyBooks.putItem(fantasyBook);
        //toys.putItem(hotdog); // doesnt work
        //food.putItem(bear); // doesnt work





    }
}
