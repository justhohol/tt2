package d_buildermode;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	private List<SenderI> list = new ArrayList<SenderI>();  
	
	public void produceMail(int count){
		for(int i = 0;i<count;i++){
			list.add(new MailSender());
		}
	}
	public void produceSMS(int count){
		for(int i = 0;i<count;i++){
			list.add(new SmsSender());
		}
	}
	
}
