package Observer;
// ConcreteObserver

public class Subscriber implements ISubscriber{
    public String name = "";

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String push) {
        // TODO Auto-generated method stub
        System.out.println("알람 도착!");
        System.out.println("TO::" + name);
        System.out.println(push);
        System.out.println();
    }
}