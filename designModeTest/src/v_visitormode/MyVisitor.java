package v_visitormode;

public class MyVisitor implements VisitorI {

	@Override
	public void visit(SubjectI sub) {
		System.out.println("visit the subject："+sub.getSubject());  
		
	}
}
