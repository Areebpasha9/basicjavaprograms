public class Singleton {
    public static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            // synchronized (demo.class) {
            // if (instance == null) {
            // instance = new demo();
            // }
            // }

        }
        return instance;

    }
}
