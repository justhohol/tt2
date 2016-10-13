package c_singeltonmode;

public class SingeltonClass3 {
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static SingeltonClass3 instance = null;

	/* 私有构造方法，防止被实例化 */
	private SingeltonClass3() {
	}

	/* 静态工厂方法，创建实例 */
	/**
	 * synchronized对代码块进行了锁，但是并不能保证就初始化一次，因为jvm不能保证 语句
	 * instance = new SingeltonClass3();的执行顺序；
	 * 即有可能先进行istance内存分配，再进行new语句创建；
	 * 在new语句未执行完毕的情况下，其他线程调用instance对象还是为null
	 */
	public static SingeltonClass3 getinstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new SingeltonClass3();
				}
			}
		}
		return instance;
	}

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {
		return instance;
	}

}
