package g_adaptermode.B_wrapper;

public class Wrapper implements TargetableI {
	/** 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题 */
	private Source sour = null;

	public Wrapper(Source source) {
		super();
		this.sour = source;
	}

	/** 对象的适配器模式 */
	@Override
	public void method2() {
		System.out.println("THIS IS NEW METHOD2");
	}

	/**
	 * Adapter类继承Source类，实现Targetable接口; 这样Targetablei接口的实现类就具有了Source类的功能。
	 */

	@Override
	public void method1() {
		sour.method1();
	}
}
