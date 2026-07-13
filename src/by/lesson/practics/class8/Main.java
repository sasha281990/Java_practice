package by.lesson.practics.class8;


public class Main {
    public static void main(String[] args) {
        AuthService service = new AuthService();

        try {
            // Пример 1: пользователь не найден
            service.authenticate("unknown", "pass");
        } catch (UserNotFoundException e) {
            System.out.println("нет пользователя");
        }

        try {
            // Пример 2: пользователь найден
            service.authenticate("alex", "pass123");
        } catch (UserNotFoundException e) {
            System.out.println("нет пользователя");
        }
    }
}