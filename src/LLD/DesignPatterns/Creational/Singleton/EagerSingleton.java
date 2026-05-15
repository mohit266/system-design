package LLD.DesignPatterns.Creational.Singleton;

public class EagerSingleton {
    public static final EagerSingleton eagerSingletonInstance = new EagerSingleton();

    private EagerSingleton(){
        // Declaring it private prevents creation of its object using the new keyword
    }

    public static EagerSingleton getInstance(){
        return eagerSingletonInstance;
    }
}
