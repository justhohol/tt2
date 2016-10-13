package z_test.testDeadlock;

public class B {
	public synchronized void bar(A a) {
		System.out.println(Thread.currentThread().getName() + " 进入B的bar");
		try {
			Thread.sleep(200);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " 试图调用A的last");
		a.last();
	}

	public synchronized void last() {
		System.out.println("B的last()");
	}

}
