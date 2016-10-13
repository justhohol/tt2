package p_observermode;

public class ObserverTest {
	public static void main(String[] args) {
		SubjectI sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		sub.operation();
	}
}
