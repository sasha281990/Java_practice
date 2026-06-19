package by.lesson.practics.class7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
        List<String> greetings = new ArrayList<>();

        greetings.add("Привет");
        greetings.add("Как дела?");
        greetings.add("Праздник!");
        greetings.add("Суфле");

        //1.3 Вывести все записи.
        System.out.println(greetings);

        //1.4 Проверить, содержит ли коллекция слово Конфета
        System.out.println(greetings.contains("конфета"));

        //1.5 Посчитать количество элементов в коллекции
        System.out.println("количество эелементов:" + greetings.size());

        //2. Условие: Создайте ArrayList<String> для хранения списка покупок.
        // Добавь в него 5 товаров. Затем выведите весь список на экран,
        // а после — удалите один товар по названию и снова выведите обновлённый список.
        ArrayList<String> shopList = new ArrayList<>();
        shopList.add("товар01");
        shopList.add("товар02");
        shopList.add("товар03");
        shopList.add("товар04");
        shopList.add("товар05");
        System.out.println("товары до:" + shopList);
        shopList.remove("товар03");
        System.out.println("товары после:" + shopList);

        System.out.println("*************************************");

        //3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();
        List<Book> books = new ArrayList<>();
        Book book01 = new Book("Толстой", "Война и мир");
        Book book02 = new Book("Пушкин", "Сказки");
        Book book03 = new Book("Крылов", "Басни");
        Book book04 = new Book("Крылов", "Басни");

        books.add(book01);
        books.add(book02);
        books.add(book03);

        System.out.println("книги до:" + books);
        books.remove(book02); // т.к. equals переопределен на false, то remove не удаляет
        System.out.println("книги после:" + books);

        System.out.println("*************************************");
        // 4 Создайте множество Set<Book> и добавьте в него несколько книг,
        // включая дубликаты (одинаковое название и автор).
        // Переопределите методы equals() и hashCode() так,
        // чтобы книги с одинаковыми значениями title и author считались одинаковыми.
        // Выведи содержимое множества и убедись, что дубликаты не добавляются.
        Set<Book> booksSet = new HashSet<>();
        //System.out.println(book03.equals(book04));
        booksSet.add(book01);
        booksSet.add(book02);
        booksSet.add(book03);
        booksSet.add(book04);

        System.out.println("Книжки:" + booksSet);

    }
}
