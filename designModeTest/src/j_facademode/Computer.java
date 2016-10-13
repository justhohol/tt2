package j_facademode;


public class Computer {
	private CPU cpu;
	private Disk disk;
	private Memory memory;

	public Computer() {
		cpu = new CPU();
		disk = new Disk();
		memory = new Memory();
	}

	public void startup() {
		System.out.println("Computer startup!");
		cpu.startup();
		disk.startup();
		memory.startup();
	}

	public void shutdown() {
		System.out.println("Computer shutdown!");
		memory.shutdown();
		disk.shutdown();
		cpu.shutdown();
	}

}
