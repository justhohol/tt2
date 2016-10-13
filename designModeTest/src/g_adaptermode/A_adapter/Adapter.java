package g_adaptermode.A_adapter;

public class Adapter extends Source implements TargetableI {
	/**类的适配器模式*/
	@Override
	public void method2() {
		System.out.println("THIS IS NEW METHOD2");
	}
	/** Adapter类继承Source类，实现Targetable接口;
	 * 这样Targetablei接口的实现类就具有了Source类的功能。 */
}
