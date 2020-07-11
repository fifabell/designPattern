package Singleton;

public class Singleton { 
    private Singleton(){}
    public static Singleton getInstance() { 
        return LazyHolder.INSTANCE; 
    } 
    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton(); 
    }

}
