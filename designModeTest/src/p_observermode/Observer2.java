package p_observermode;

public class Observer2 implements ObserverI {

	@Override
	public void update() {
		System.out.println("observer2 has received!"); 
	}

}
