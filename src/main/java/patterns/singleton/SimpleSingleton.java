package patterns.singleton;

class SimpleSingleton {
    private static SimpleSingleton instance;

    private SimpleSingleton() {
    }

    static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }

        return instance;
    }
}