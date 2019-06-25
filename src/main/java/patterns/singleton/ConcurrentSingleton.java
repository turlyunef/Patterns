package patterns.singleton;

class ConcurrentSingleton {
    private static ConcurrentSingleton instance;
    private static int counter = 0;

    private ConcurrentSingleton() {
        counter++;
    }

    static int getCounter() {
        return counter;
    }

    static synchronized ConcurrentSingleton getInstance() {
        if (instance == null) {
            instance = new ConcurrentSingleton();
        }

        return instance;
    }
}