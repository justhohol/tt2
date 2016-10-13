package a_factoryMode.A_commonfactory;

public class SmsSender implements SenderI {

	@Override
	public void send() {
		System.out.println("smsSender");
	}

}
