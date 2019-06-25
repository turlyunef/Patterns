package patterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {
    public static final int AVAILABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();
    public static void main(String[] args) {
        testSimpleSingleton();
        testConcurrentSingleton();
        testFastConcurrentSingleton();
    }

    private static void testSimpleSingleton() {
        SimpleSingleton singleton1 = SimpleSingleton.getInstance();
        SimpleSingleton singleton2 = SimpleSingleton.getInstance();
        System.out.println("singleton1 is singleton2: " + (singleton1 == singleton2) + "\n");
    }

    private static void testConcurrentSingleton() {
        long startedTime = System.currentTimeMillis();
        runConcurrentExecution();
        System.out.printf("Constructor of ConcurrentSingleton launched %d times.%n", ConcurrentSingleton.getCounter());
        System.out.printf("Lead time is %d ms.%n%n", System.currentTimeMillis() - startedTime);
    }

    private static void runConcurrentExecution() {
        ExecutorService executorService = Executors.newFixedThreadPool(AVAILABLE_PROCESSORS);
        for (int i = 0; i < 10_000_000; i++) {
            executorService.submit(() -> {
                ConcurrentSingleton singleton = ConcurrentSingleton.getInstance();
            });
        }
        executorService.shutdown();
    }

    private static void testFastConcurrentSingleton() {
        long startedTime = System.currentTimeMillis();
        runFastConcurrentExecution();
        System.out.printf("Constructor of FastConcurrentSingleton launched %d times.%n", FastConcurrentSingleton.getCounter());
        System.out.printf("Lead time is %d ms.%n", System.currentTimeMillis() - startedTime);
    }

    private static void runFastConcurrentExecution() {
        ExecutorService executorService = Executors.newFixedThreadPool(AVAILABLE_PROCESSORS);
        for (int i = 0; i < 10_000_000; i++) {
            executorService.submit(() -> {
                FastConcurrentSingleton singleton = FastConcurrentSingleton.getInstance();
            });
        }
        executorService.shutdown();
    }
}