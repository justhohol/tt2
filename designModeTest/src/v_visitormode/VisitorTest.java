package v_visitormode;

public class VisitorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VisitorI visitor = new MyVisitor();
		SubjectI sub = new MySubject();
		sub.accept(visitor);

	}

}
