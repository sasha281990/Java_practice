package by.lesson.practics.class7;

import java.util.Objects;

public class Book {
    //3 Условие: Создай класс Book с полями:
    //• String title
    //• String author
    String author;
    String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    //3.2 Переопределите метод equals на книгах так,
    // чтобы он всегда возвращал false
//    public boolean equals(Object object){
//        return false;
//    }
    // Переопределите методы equals() и hashCode() так,
    // чтобы книги с одинаковыми значениями title и author считались одинаковыми.
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        super.equals(object);
        return Objects.equals(author, book.author) && Objects.equals(title, book.title);
        //return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
        //return author.hashCode()+title.hashCode();
        //return 1;
    }

    @Override
    public String toString() {
        return "Книга: Автор - " + author+"; Название - " + title ;
    }
}
