package d_buildermode;

public class MailSender implements SenderI {

	@Override
	public void send() {
		System.out.println("mailSender");
	}

}
