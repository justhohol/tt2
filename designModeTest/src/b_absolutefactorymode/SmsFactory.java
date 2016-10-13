package b_absolutefactorymode;


public class SmsFactory implements Provider{

	@Override
	public SenderI produce() {
		return new SmsSender();
	}
}
