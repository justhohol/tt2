package a_factoryMode.A_commonfactory;


public class Factory {

	public SenderI produce(String typename){
		if("MAIL".equals(typename)){
			return new MailSender();
		}else if("SMS".equals(typename)){
			return new SmsSender();
		}else{
			System.out.println("错误的产品类型");
			return null;
		}
	}
	
	public static void main(String[] args){
		Factory factory = new Factory();
		SenderI sender = factory.produce("SMS");
		sender.send();
	}
}
