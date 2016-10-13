package a_factoryMode.C_commonfactory;

public class SmsSender implements SenderI {

	@Override
	public void send() {
		System.out.println("smsSender");
	}

}
