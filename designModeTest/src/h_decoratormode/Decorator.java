package h_decoratormode;

public class Decorator implements SourceableI {
	public Source source = null;
	
	public Decorator(Source source){
		this.source = source;
	}
	@Override
	public void method1() {
		System.out.println("THIS IS Decorator method1 ");
		source.method1();
		System.out.println("THIS IS Decorator method1 ");
	}

	@Override
	public void method2() {
		System.out.println("THIS IS Decorator method2 ");
		source.method2();
		System.out.println("THIS IS Decorator method2 ");
	}

}
