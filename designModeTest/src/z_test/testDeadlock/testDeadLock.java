package z_test.testDeadlock;

public class testDeadLock 
	extends Thread{
	//implements Runnable {
	
	A a = new A();
	B b = new B();

	public void init2() {
		Thread.currentThread().setName("主线程");
		System.out.println("进入主线程");
		a.foo(b);
	}

	public void run() {
//		while(true){
//			Thread.currentThread().setName("副线程");
//			System.out.println("进入副线程");
//			b.bar(a);
//		}
		Thread.currentThread().setName("副线程");
		System.out.println("进入副线程");
		b.bar(a);
	}

	public static void main(String[] args) {
		testDeadLock dl = new testDeadLock();
 		new Thread(dl).start();///start方法后就获得了B对象的锁，但是还未运行run方法所以未获得A对象的锁
 		/*dl.start();*/
 		/*dl.run();*/
 		/** 时间长短无所谓，因为再长也会死锁*/
 		boolean flag = true;
 		while(flag){
 			
 		}
		dl.init2();//调用init方法获取到了A对象的锁，打算获取B对象的锁
	}

}
