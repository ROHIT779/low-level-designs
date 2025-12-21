package lld.singleton;

// Since Java 1.5 using Enum, we can create singleton.
// It handles Serialization using Java's in-built mechanism and still ensure single instance
public enum SingletonEnum {
    INSTANCE;

    public void getConfiguration(){

    }
}
