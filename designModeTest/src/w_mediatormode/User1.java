package w_mediatormode;

public class User1 extends User {

	public User1(MediatorI mediator) {
		super(mediator);
	}

	@Override
	public void work() {
		System.out.println("user1 exe!");
	}

}
