package by.lesson.practics.class9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class SumCallable implements Callable<String> {
    private final Random random = new Random();

    @Override
    public String call() throws Exception {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " начал работу");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        int sleepTime = random.nextInt(10) + 1;
        System.out.println(threadName + " сгенерировал " + numbers + ", спит " + sleepTime + " сек");
        Thread.sleep(sleepTime * 1000L);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(threadName + " завершил работу");

        return threadName + ": сумма = " + sum;
    }
}