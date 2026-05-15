package LLD.DesignPatterns.Creational.Singleton;

public class LazyLoadingSingleton {

    private static LazyLoadingSingleton lazyLoadingSingletonInstance;

    private LazyLoadingSingleton(){

    }

    public static LazyLoadingSingleton getInstance(){
        if (lazyLoadingSingletonInstance == null){
            lazyLoadingSingletonInstance = new LazyLoadingSingleton();
        }
        return lazyLoadingSingletonInstance;
    }

}
