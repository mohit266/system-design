package LLD.DesignPatterns.Creational.Singleton;

public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton doubleCheckedLockingSingleton;

    private DoubleCheckedLockingSingleton(){

    }

    public static DoubleCheckedLockingSingleton getInstance(){
        if (doubleCheckedLockingSingleton == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if (doubleCheckedLockingSingleton == null){
                    doubleCheckedLockingSingleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return doubleCheckedLockingSingleton;
    }
}
