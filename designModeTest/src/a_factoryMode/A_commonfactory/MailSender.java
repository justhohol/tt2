package a_factoryMode.A_commonfactory;

public class MailSender implements SenderI {

	@Override
	public void send() {
		System.out.println("mailSender");
	}

}
