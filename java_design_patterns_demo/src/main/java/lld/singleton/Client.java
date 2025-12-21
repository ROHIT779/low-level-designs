package lld.singleton;

public class Client {

    public static void main(String[] args){

        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();

        System.out.println("Instance1 == Instance2: " + (instance1 == instance2));

        LazySingletonDCL lazySingleton1 = LazySingletonDCL.getInstance();
        LazySingletonDCL lazySingleton2 = LazySingletonDCL.getInstance();

        System.out.println("Lazy Singleton Instance1 == Instance2: " + (lazySingleton1 == lazySingleton2));

        LazySingletonIH lazySingletonIH1;
        lazySingletonIH1 = LazySingletonIH.getInstance();
        LazySingletonIH lazySingletonIH2 = LazySingletonIH.getInstance();

        System.out.println("LazySingletonIH instance1 == instance2: " + (lazySingletonIH1 == lazySingletonIH2));

        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;

        System.out.println("SingletonEnum instance1 == instance2: " + (singletonEnum1 == singletonEnum2));
    }
}
