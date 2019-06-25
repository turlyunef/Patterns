package patterns.singleton;

class FastConcurrentSingleton {
    private static volatile FastConcurrentSingleton instance;
    private static int counter = 0;

    private FastConcurrentSingleton() {
        counter++;
    }

    static int getCounter() {
        return counter;
    }

    static FastConcurrentSingleton getInstance() {
        if (instance == null) {
            synchronized (FastConcurrentSingleton.class) {
                if (instance == null) {
                    instance = new FastConcurrentSingleton();
                }
            }
        }

        return instance;
    }
}