package w_mediatormode;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MediatorI mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}

}
