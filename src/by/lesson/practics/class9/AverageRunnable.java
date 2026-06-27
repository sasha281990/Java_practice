package by.lesson.practics.class9;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AverageRunnable implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(100);
            numbers.add(number);
            sum += number;
        }

        double average = sum / 5.0;
        System.out.println(Thread.currentThread().getName() + " -> " + numbers + ", среднее = " + average);
    }
}