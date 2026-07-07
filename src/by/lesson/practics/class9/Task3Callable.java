package by.lesson.practics.class9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Task3Callable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            futures.add(executor.submit(new SumCallable()));
        }

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}
