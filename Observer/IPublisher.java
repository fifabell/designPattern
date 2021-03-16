package Observer;

// Subject
public interface IPublisher {
    // subscribe
    void subscribe(ISubscriber subscriber);
    
    // removeSubscribe
    void removeSubscribe(ISubscriber subscriber);

    // notifySubscribe
    void notifySubscribe(String text);
}