package by.lesson.practics.class3;

public class Bookmain {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book(1, "Книга 1", "Автор 1", "Издательство 1", 2010, 300, 25.5);
        books[1] = new Book(2, "Книга 2", "Автор 2", "Издательство 2", 2015, 250, 30.0);
        books[2] = new Book(3, "Книга 3", "Автор 3", "Издательство 3", 2008, 400, 40.0);
        books[3] = new Book(4, "Книга 4", "Автор 4", "Издательство 4", 2020, 150, 15.0);
        books[4] = new Book(5, "Книга 5", "Автор 5", "Издательство 5", 2012, 500, 50.0);

        System.out.println("Все книги:");
        for (Book book : books) {
            System.out.println(book.info());
        }

        books[0].changePrice(99.9);
        System.out.println("\nПосле изменения цены первой книги:");
        System.out.println(books[0].info());

        Book[] oldBooks = Book.booksByYear(books, 2015);
        System.out.println("\nКниги с годом издания ниже 2015:");
        for (Book book : oldBooks) {
            System.out.println(book.info());
        }
    }
}