package z_test.testDeadlock;

public class A {
	public synchronized void foo(B b) {
		System.out.println(Thread.currentThread().getName() + " 进入A的foo");
		try {
			Thread.sleep(200);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " 试图调用B的last");
		b.last();
	}

	public synchronized void last() {
		System.out.println("A的last()");
	}

}
