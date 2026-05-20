package by.lesson.practics.class3;

public class StringMain {
    public static void main(String[] args) {
        String text = "I like Java!!!";

        System.out.println("Исходная строка: " + text);
        StringTask.printLastChar(text);
        StringTask.printJavaSubstring(text);
    }
}