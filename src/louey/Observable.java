package louey;

public interface Observable {
public void subscribe(Observer o); //add
public void unsubscribe(Observer o); //remove
void notifyObservers();
}
