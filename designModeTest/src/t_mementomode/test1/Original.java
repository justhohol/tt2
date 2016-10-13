package t_mementomode.test1;

public class Original {

	private String value;
	private String value2;
	private String value3;
	private String value4;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Original(String value,String value2,String value3,String value4) {
		this.value = value;
		this.value2 = value2;
		this.value3 = value3;
		this.value4 = value4;
	}

	public Memento createMemento() {
		return new Memento(value);
	}

	public void restoreMemento(Memento memento) {
		this.value = memento.getValue();
		this.value3 = memento.getValue3();
	}

	public String show(){
		return "|"+this.value+ "|"+this.value2+ "|"+this.value3+ "|"+this.value4;
	}
	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public String getValue3() {
		return value3;
	}

	public void setValue3(String value3) {
		this.value3 = value3;
	}

	public String getValue4() {
		return value4;
	}

	public void setValue4(String value4) {
		this.value4 = value4;
	}

}
