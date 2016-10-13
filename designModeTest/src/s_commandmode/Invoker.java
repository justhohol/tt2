package s_commandmode;

public class Invoker {
	
	private CommandI command;

	public Invoker(CommandI command) {
		this.command = command;
	}
	public void action() {
		command.exe();
	}
}
