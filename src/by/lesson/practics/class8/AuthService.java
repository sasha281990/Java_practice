package by.lesson.practics.class8;

public class AuthService {
    public void authenticate(String login, String password)
            throws UserNotFoundException {

        // Проверка наличия пользователя по логину
        User user = null;
        for (User u : UserRepository.users) {
            if (u.login.equals(login)) {
                user = u;
                break;
            }
        }

        // Если пользователя нет — выбрасываем исключение
        if (user == null) {
            throw new UserNotFoundException();
        }

        System.out.println("Пользователь найден: " + user.name);
    }
}