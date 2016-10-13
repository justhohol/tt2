package r_chainofresponsibilitymode;

public class MyHandler extends AbstractHandler implements HandlerI {
	private String name;

	public MyHandler(String name) {
		this.name = name;
	}

	@Override
	public void operation() {
		System.out.println(name + "deal!");
		if (getMyhander() != null) {
			getMyhander().operation();
		}
	}

}
