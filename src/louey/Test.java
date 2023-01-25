package louey;

import java.lang.Object;

public class Test  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ObservableImpl observable=new ObservableImpl();
	Observer o1=new ObserverImpl1();
	Observer o2=new ObserverImpl2();
	Observer o3=new ObserverImpl1();
	
	observable.subscribe(o1);
	observable.subscribe(o2);
	observable.setState(55);
	observable.subscribe( new Observer() {
		
		@Override
		public void update(Observable observable) {
			// TODO Auto-generated method stub
	System.out.println("* Observateur anonyme =======>");		
		}
	});
	observable.subscribe(obs->{
		System.out.println("====================)");
	});
	observable.setState(55);
	}

}
