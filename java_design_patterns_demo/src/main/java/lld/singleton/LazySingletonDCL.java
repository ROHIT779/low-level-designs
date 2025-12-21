package lld.singleton;

public class LazySingletonDCL {
    private static volatile LazySingletonDCL INSTANCE;

    private LazySingletonDCL(){}

    public static LazySingletonDCL getInstance(){
        if(INSTANCE == null){
            synchronized (LazySingletonDCL.class){
                if(INSTANCE == null){
                    INSTANCE = new LazySingletonDCL();
                }
            }
        }
        return INSTANCE;
    }
}
