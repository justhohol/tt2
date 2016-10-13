package p_observermode;

public interface SubjectI {
	
	public void add(ObserverI observer);

	public void del(ObserverI observer);

	public void notifyObservers();

	public void operation();
}
