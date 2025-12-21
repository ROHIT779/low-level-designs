package lld.singleton;

//Initialization holder implementation for Java 5 or Earlier because of unavailability of volatile and synchronized
public class LazySingletonIH {

    private LazySingletonIH(){
        System.out.println("LazySingletonIH constructor called");
    }


    private static class Holder {
        static LazySingletonIH INSTANCE = new LazySingletonIH();
    }

    public static LazySingletonIH getInstance(){
        return Holder.INSTANCE;
    }
}
