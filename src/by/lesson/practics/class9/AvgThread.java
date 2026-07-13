package by.lesson.practics.class9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AvgThread extends Thread {
    private final Random random = new Random();

    public AvgThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(random.nextInt(100));
        }

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("[" + getName() + "] numbers = " + numbers + ", average = " + average);
    }
}