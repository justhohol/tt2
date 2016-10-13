package a_factoryMode.C_commonfactory;

public class MailSender implements SenderI {

	@Override
	public void send() {
		System.out.println("mailSender");
	}

}
