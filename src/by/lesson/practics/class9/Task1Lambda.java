package by.lesson.practics.class9;

public class Task1Lambda {
    public static void main(String[] args) {
        Multiplication multiplication = (a, b) -> a * b;
        System.out.println("5 * 10 = " + multiplication.multiplication(5, 10));
    }
}
