package i_proxymode;

public class Proxy implements SourceableI {
	private Source source = null;
	
	public Proxy(){
		super();
		this.source = new Source();
	}
	@Override
	public void method1() {
		before();
		this.source.method1();
		after();
	}
	private void before(){
		System.out.println("before Proxy");
	}
	private void after(){
		System.out.println("after Proxy");
	}
}
