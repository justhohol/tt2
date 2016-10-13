package v_visitormode;

public class MySubject implements SubjectI {

	@Override
	public void accept(VisitorI visitor) {
		visitor.visit(this);
	}

	@Override
	public String getSubject() {
		return "love";
	}
}
