package s_commandmode;

public class MyCommand implements CommandI {
	
	private Receiver receiver;

	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void exe() {
		 receiver.action();
	}

}
