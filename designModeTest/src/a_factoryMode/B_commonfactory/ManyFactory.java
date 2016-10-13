package a_factoryMode.B_commonfactory;


public class ManyFactory {
	public SenderI produceMail() {
		return new MailSender();
	}

	public SenderI produceSMS() {
		return new SmsSender();
	}

	public static void main(String[] args) {
		ManyFactory factory = new ManyFactory();
		SenderI sender = factory.produceMail();
		sender.send();
	}
}
