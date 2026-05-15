package LLD.DesignPatterns.Creational.Singleton;

public class SynchronizedSingleton {
    private static SynchronizedSingleton synchronizedSingletonInstance;

    private SynchronizedSingleton(){

    }

    public static synchronized SynchronizedSingleton getInstance(){
        if (synchronizedSingletonInstance == null){
            synchronizedSingletonInstance = new SynchronizedSingleton();
        }
        return synchronizedSingletonInstance;
    }
}
