package c_singeltonmode;

public class SingeltonClass2 {
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
	private static SingeltonClass2 instance = null;
	/* 私有构造方法，防止被实例化 */  
	private SingeltonClass2(){
	}
	 /* 静态工厂方法，创建实例 */  
	/**synchronized对SingeltonClass2对象加锁，性能有所降低*/
	public static synchronized SingeltonClass2 getinstance (){
		if(instance == null){
			instance = new SingeltonClass2();
		}
		return instance;
	}
	
	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object readResolve() {  
	   return instance;  
	}  

	
}
