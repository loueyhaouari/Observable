package louey;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
private List<Observer> observers=new ArrayList<>();
private int state=10;
@Override
	public void subscribe(Observer o) {
		// TODO Auto-generated method stub
		this.observers.add(o);
	}

	@Override
	public void unsubscribe(Observer o) {
		// TODO Auto-generated method stub
		this.observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o:observers) {
			o.update( this);
		}
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
     this.notifyObservers();
	}
	
	

}
