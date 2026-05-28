package by.lesson.practics.class3;

public class StringTask {

    public static void printLastChar(String text) {
        char lastChar = text.charAt(text.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);
    }

    public static void printJavaSubstring(String text) {
        int start = text.indexOf("Java");
        if (start != -1) {
            String result = text.substring(start, start + 4);
            System.out.println("Вырезанная строка: " + result);
        } else {
            System.out.println("Подстрока Java не найдена");
        }
    }
}