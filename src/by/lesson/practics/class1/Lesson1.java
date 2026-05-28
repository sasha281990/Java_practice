package by.lesson.practics.class1;

import java.util.Scanner;

public class Lesson1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Решить уравнение: (10 + 12) * x == 88
        System.out.println("1. Решение уравнения (10+12)*x=88");
        double x = 88.0 / (10 + 12);
        System.out.println("x = " + x);

        // 4. Ввод x, y, z; операции и вывод
        System.out.println("4. Введите x, y, z:");
        System.out.print("x = ");
        int x4 = sc.nextInt();
        System.out.print("y = ");
        int y4 = sc.nextInt();
        System.out.print("z = ");
        int z = sc.nextInt();

        x4 = x4 + y4;  // x += y
        y4 = y4 * z;   // y *= z

        System.out.println("x = " + x4);
        System.out.println("y = " + y4);

        // 5. Уравнение: 213/x + 258/x + 60 = 217
        System.out.println("5. Решение уравнения 213/x + 258/x + 60 = 217");
        double num = 213.0 + 258.0; // 471
        double right = 217.0 - 60.0; // 157
        double x5 = num / right;
        System.out.println("x = " + x5);

        // 6. Значения x=5, y=2, c=x*y
        System.out.println("6. Пример с инкрементом/декрементом");
        int x6 = 5;
        int y6 = 2;
        System.out.println("Исходно: x = " + x6 + ", y = " + y6);

        // Нужно: после c = x * y → c = 10, x = 6, y = 1
        int c = (++x6) * (y6--);
        System.out.println("c = " + c);
        System.out.println("x = " + x6);
        System.out.println("y = " + y6);

        // 1. a и b, условия
        System.out.println("1. Введите a, b:");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int result1;

        if (a > b) {
            result1 = a - b;
            System.out.println("a > b; разность: " + result1);
        } else if (a == b) {
            result1 = a + b;
            System.out.println("a == b; сумма: " + result1);
        } else {
            result1 = b - a;
            System.out.println("a < b; разность b - a: " + result1);
        }

        // 2. Деление a и b
        System.out.println("2. Введите a, b:");
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        double result2;

        if (a > b && b != 0) {
            result2 = (double) a / b;
            System.out.println("a > b и b != 0; a/b = " + result2);
        } else if (a != 0) {
            result2 = (double) b / a;
            System.out.println("b/a = " + result2);
        } else {
            result2 = a + b;
            System.out.println("a==0; сумма = " + result2);
        }

        // 3. Делится ли число на 3
        System.out.println("3. Введите число:");
        System.out.print("n = ");
        int n = sc.nextInt();
        if (n % 3 == 0) {
            System.out.println("Число делится на 3");
        } else {
            System.out.println("Число не делится на 3");
        }

        // 4. Делится ли на 3 и/или 7
        System.out.println("4. Введите число:");
        System.out.print("n = ");
        n = sc.nextInt();

        if (n % 3 == 0 && n % 7 == 0) {
            System.out.println("Число делится и на 3, и на 7");
        } else if (n % 3 == 0) {
            System.out.println("Число делится на 3, но не на 7");
        } else if (n % 7 == 0) {
            System.out.println("Число делится на 7, но не на 3");
        } else {
            System.out.println("Число не делится ни на 3, ни на 7");
        }

        // 6. Максимум из трёх чисел
        System.out.println("6. Введите три числа:");
        System.out.print("a6 = ");
        int a6 = sc.nextInt();
        System.out.print("b6 = ");
        int b6 = sc.nextInt();
        System.out.print("c6 = ");
        int c6 = sc.nextInt();

        int max = a6;
        if (b6 > max) max = b6;
        if (c6 > max) max = c6;

        System.out.println("Максимум = " + max);

        sc.close();
    }
}