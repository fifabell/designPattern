package Observer;

public class Main {
    public static void main(String[] args) {
        Publisher studyChannel = new Publisher();
        Subscriber subscriber1 = new Subscriber("종댕");
        Subscriber subscriber2 = new Subscriber("수댕");
        
        studyChannel.subscribe(subscriber1);
        studyChannel.subscribe(subscriber2);
        studyChannel.notifySubscribe("열공하세용");

        studyChannel.removeSubscribe(subscriber2);
    }   
}