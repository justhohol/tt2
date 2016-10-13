package a_factoryMode.C_commonfactory;


public class StaticFactory {
	public static SenderI produceMail() {
		return new MailSender();
	}

	public static SenderI produceSMS() {
		return new SmsSender();
	}

	public static void main(String[] args) {
		SenderI sender = StaticFactory.produceMail();
		sender.send();
	}
}
