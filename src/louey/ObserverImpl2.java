package louey;

public class ObserverImpl2 implements Observer{
private int counter;
	@Override
	public void update(Observable observable) {
		// TODO Auto-generated method stub
		int state=((ObservableImpl)observable).getState();
		double res=state*state+9;
		if(state%2==0) ++counter;
		System.out.println("*******ObserverImpl2******");
		System.out.println("Nouvelle mise à jour : state= " +state);
		System.out.println("Résultat de calcul :"+((state%2)==0?"pair":"imapire"));
        System.out.println("****************************************");
	}

}
