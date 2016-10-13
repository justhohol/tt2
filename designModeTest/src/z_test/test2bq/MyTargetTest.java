package z_test.test2bq;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyTargetTest {
	@myoper(mydes="dddd")
	public void doSomething() {
		System.out.println("hello world");
	}

	public static void main(String[] args) {
		/*try {
			Method method = MyTargetTest.class.getMethod("doSomething", null);
			if (method.isAnnotationPresent(myoper.class))// 如果doSomething方法上存在注解@MyTarget，则为true
			{
				System.out.println(method.getAnnotation(myoper.class));
			}
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			Annotation[] as = ExampleDTO.class.getAnnotations();
			for(Annotation a :as){
				Field[] fs = a.getClass().getFields();
				for(Field f:fs){
					System.out.println(f.get(a).toString());
				}
				Method[] ms = a.getClass().getMethods();
				for(Method m:ms){
					if("mydes".equals(m.getName())){
						System.out.println(m.invoke(a));
					}else{
						System.out.println(m.getName());
					}
				}
			}
			System.out.println("ok");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
