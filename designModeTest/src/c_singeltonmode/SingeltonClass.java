package c_singeltonmode;

public class SingeltonClass {
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
	private static SingeltonClass instance = null;
	/* 私有构造方法，防止被实例化 */  
	private SingeltonClass(){
	}
	 /* 静态工厂方法，创建实例 */  
	/**多线程的情况下，有可能混乱或者重复初始化*/
	public static SingeltonClass getinstance (){
		if(instance == null){
			instance = new SingeltonClass();
		}
		return instance;
	}
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object readResolve() {  
	   return instance;  
	}  

	
}
