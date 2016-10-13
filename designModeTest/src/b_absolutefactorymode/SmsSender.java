package b_absolutefactorymode;

public class SmsSender implements SenderI {

	@Override
	public void send() {
		System.out.println("smsSender");
	}

}
