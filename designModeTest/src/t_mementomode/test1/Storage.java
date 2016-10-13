package t_mementomode.test1;

public class Storage {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

	public Storage(Memento memento) {
		this.memento = memento;
	}

}
