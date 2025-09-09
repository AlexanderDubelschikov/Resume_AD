package HW;

public class HW_6 {

    public static void main(String[] args) {

        Author author1 = new Author("Льюис", "Кэрол", 100);
        Author author2 = new Author("Alex", "Dub", 10);

        Book book = new Book("Алиса в стране чудес", 1865, author1, 600);
        Book book2 = new Book("Random", 2025, author2, 10);

        System.out.println(book.matches("Алиса"));
        System.out.println(book.matches("Льюис"));
        System.out.println(book.matches("Кэрол"));
        System.out.println(book.matches("322"));
        System.out.println(book.isBig());
        System.out.println(book2.isBig());
        System.out.println(book.estimatePrice());
        System.out.println(book2.estimatePrice());



    }
}
