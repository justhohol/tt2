package b_absolutefactorymode;


public class MailFactory implements Provider{

	@Override
	public SenderI produce() {
		return new MailSender();
	}
}
