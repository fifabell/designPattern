package Observer;

import java.util.ArrayList;
import java.util.List;

// ConcreteSubject
public class Publisher implements IPublisher{
	private List<ISubscriber> subscribers;

	public Publisher(){
		subscribers = new ArrayList<>();
		System.out.println("채널 open");
		System.out.println("=============");
	}

	@Override
	public void subscribe(ISubscriber subscriber) {
		// TODO Auto-generated method stub
		subscribers.add(subscriber);
		System.out.println(((Subscriber)subscriber).name + "님이 참여했습니다.");
		System.out.println("=============");
	}

	@Override
	public void removeSubscribe(ISubscriber subscriber) {
		// TODO Auto-generated method stub
		int index = subscribers.indexOf(subscriber);
		subscribers.remove(index);
		System.out.println(((Subscriber)subscriber).name + "님이 탈퇴했습니다.");
		System.out.println("=============");
	}

	@Override
	public void notifySubscribe(String push) {
		// TODO Auto-generated method stub
		for(ISubscriber subscriber : subscribers){
			subscriber.update(push);
		}

	}

}