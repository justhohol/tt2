package a_factoryMode.B_commonfactory;

public class MailSender implements SenderI {

	@Override
	public void send() {
		System.out.println("mailSender");
	}

}
