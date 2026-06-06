package by.lesson.practics.class5;

public interface Electropribori {

    void work();

    default void start() {
        System.out.println("Электроприбор стартует");
    }
}