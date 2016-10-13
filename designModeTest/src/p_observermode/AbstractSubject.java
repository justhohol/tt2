package p_observermode;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements SubjectI {

	private Vector<ObserverI> vector = new Vector<ObserverI>();
	@Override
	public void add(ObserverI observer) {
		vector.add(observer);
	}
	@Override
	public void del(ObserverI observer) {
		vector.remove(observer);
	}
	@Override
	public void notifyObservers() {
		Enumeration<ObserverI> enumo = vector.elements();
		while (enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}

}
