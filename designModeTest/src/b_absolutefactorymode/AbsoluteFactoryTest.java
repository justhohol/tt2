package b_absolutefactorymode;

public class AbsoluteFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MailFactory mf = new MailFactory();
		SenderI sender = mf.produce();
		sender.send();
		SmsFactory sf = new SmsFactory();
		SenderI sender2 = sf.produce();
		sender2.send();
	}

}
