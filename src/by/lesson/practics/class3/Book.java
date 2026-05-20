package by.lesson.practics.class3;

public class Book {
    int id;
    String name;
    String author;
    String publisher;
    int year;
    int quantity;
    double price;

    public Book() {
    }

    public Book(int id, String name, String author, String publisher, int year, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.quantity = quantity;
        this.price = price;
    }

    public String info() {
        return "id: " + id +
                ", name: " + name +
                ", author: " + author +
                ", publisher: " + publisher +
                ", year: " + year +
                ", quantity: " + quantity +
                ", price: " + price;
    }

    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    public static Book[] booksByYear(Book[] books, int year) {
        int count = 0;
        for (Book book : books) {
            if (book.year < year) {
                count++;
            }
        }

        Book[] result = new Book[count];
        int index = 0;
        for (Book book : books) {
            if (book.year < year) {
                result[index++] = book;
            }
        }
        return result;
    }

    public static Book[] removeBook(Book[] books, int id) {
        int count = 0;
        for (Book book : books) {
            if (book.id != id) {
                count++;
            }
        }

        Book[] result = new Book[count];
        int index = 0;
        for (Book book : books) {
            if (book.id != id) {
                result[index++] = book;
            }
        }
        return result;
    }
}