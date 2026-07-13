package by.lesson.practics.class9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Task4DateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Текущие дата и время: " + now);

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));
        System.out.println(date.format(formatter1));

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy:MM:dd'T'HH:mm:ss");
        System.out.println(now.format(formatter2));
    }
}
