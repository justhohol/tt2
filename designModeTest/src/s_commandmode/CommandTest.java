package s_commandmode;

public class CommandTest {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		CommandI cmd = new MyCommand(receiver);
		Invoker invoker = new Invoker(cmd);
		invoker.action();
	}
}
