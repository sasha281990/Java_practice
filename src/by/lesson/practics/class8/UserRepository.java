package by.lesson.practics.class8;


import java.util.*;

public class UserRepository {
    static List<User> users;

    // Статический блок инициализации
    static {
        users = new ArrayList<>();
        users.add(new User("alex", "pass123", "Александр", "Филанович"));
        users.add(new User("bob", "bob456", "Боб", "Иванов"));
        users.add(new User("carol", "carol789", "Каролина", "Петрова"));
        users.add(new User("david", "david012", "Давид", "Соколов"));
        users.add(new User("emma", "emma345", "Эмма", "Морозова"));
    }
}