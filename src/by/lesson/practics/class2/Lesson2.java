package by.lesson.practics.class2;

import java.util.Scanner;
import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        task1();
        task2();
        task3();
        task3_1();
        task4();
        task5();
        task6();
        task7(scanner);
        task8(scanner);
        task9();

        scanner.close();
    }

    // 1. Последовательность 7 14 21 ... 98
    public static void task1() {
        System.out.println("1. Отображение последовательности");
        int i = 7;
        while (i <= 98) {
            System.out.print(i + " ");
            i += 7;
        }
        System.out.println();
    }

    // 2. Сумма первых 10 чисел
    public static void task2() {
        System.out.println("2. Сумма первых 10 чисел");
        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum += i;
            i++;
        }

        System.out.println(sum);
    }

    // 3. Вывести числа от 100 до 1 через запятую (for)
    public static void task3() {
        System.out.println("3. Вывести числа от 100 до 1 через запятую. В конце без запятой");
        for (int i = 100; i >= 1; i--) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
        System.out.println();
    }

    // 3.1 Каждый десяток от 1 до 100 (for)
    public static void task3_1() {
        System.out.println("3.1  Вывести каждый десяток от 1 до 100");
        for (int i = 10; i <= 100; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 4. Только нечётные числа от 1 до 100
    public static void task4() {
        System.out.println("4. Вывести только нечётные числа от 1 до 100");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 5. Создать массив чисел от 1 до 100. Вывести массив
    public static void task5() {
        System.out.println("5. Создать массив чисел от 1 до 100. Вывести полученный массив");
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr));
    }

    // 6. Создать массив из чисел. Вывести макс и мин число
    public static void task6() {
        System.out.println("6. Создать массив из чисел. Вывести макс и мин число.");
        int[] arr = {5, 12, 3, 99, 7, 1, 45};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    // 7. Ввести число, вывести среднее значение всех цифр числа (while, %)
    public static void task7(Scanner scanner) {
        System.out.print("7. Введите число (не заканчивается на 0) для среднего значения цифр: ");
        int number = scanner.nextInt();

        int sum = 0;
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            count++;
            number = number / 10;
        }

        double average = (double) sum / count;
        System.out.println("Среднее значение цифр = " + average);
    }

    // 8. Ввести число, вывести макс и мин цифру в числе (while, %)
    public static void task8(Scanner scanner) {
        System.out.print("8. Введите число (не заканчивается на 0) для max и min цифры: ");
        int number = scanner.nextInt();

        int digit = number % 10;
        int max = digit;
        int min = digit;

        number = number / 10;

        while (number > 0) {
            digit = number % 10;

            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }

            number = number / 10;
        }

        System.out.println("max digit = " + max);
        System.out.println("min digit = " + min);
    }

    // 9. Сортировка массива пузырьком
    public static void task9() {
        System.out.println("9. Сортировать массив чисел в порядке возрастания. Сортировка пузырьком");
        int[] arr = {9, 4, 7, 2, 8, 1, 5};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}