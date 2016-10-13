package a_factoryMode.B_commonfactory;

public class SmsSender implements SenderI {

	@Override
	public void send() {
		System.out.println("smsSender");
	}

}
