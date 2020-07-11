package Singleton;

public class Main {
    public static void main(String[] args) {
        Normal normal1 = new Normal();
        Normal normal2 = new Normal();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        if(normal1 == normal2) {
            System.out.println("normal1과 normal2는 서로 같습니다..");
        }else {
            System.out.println("normal1과 normal2는 서로 다릅니다.");
        }
        
        if(singleton1 == singleton2) {
            System.out.println("singleton1과 singleton2는 서로 같습니다.");
        }else {
            System.out.println("singleton1과 singleton2는 서로 다릅니다.");
        }
    }
}