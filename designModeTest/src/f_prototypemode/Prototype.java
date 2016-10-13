package f_prototypemode;

public class Prototype implements Cloneable {
	
	public Object cloneA() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}

}
