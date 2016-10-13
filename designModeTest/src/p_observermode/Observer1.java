package p_observermode;

public class Observer1 implements ObserverI {

	@Override
	public void update() {
		System.out.println("observer1 has received!"); 
		System.out.println(ObserverI.name);
	}

}
