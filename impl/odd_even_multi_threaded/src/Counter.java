public class Counter {
    public static int counter = 0;
    private static final Object lock = new Object();

    public static Object getLock(){
        return lock;
    }
}
