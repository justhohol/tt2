package z_test.test1;

public class TestSynchronized {
    public synchronized void method1() throws InterruptedException {
        System.out.println("method1 begin at:" + System.currentTimeMillis());
        Thread.sleep(60000);
        System.out.println("method1 end at:" + System.currentTimeMillis());
    }
    public synchronized void method2() throws InterruptedException {
        while(true) {
            System.out.println("method2 running");
            Thread.sleep(200);
        }
    }
    static TestSynchronized instance = new TestSynchronized();
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    instance.method1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int i=1; i<4; i++) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread1 still alive");
                }                    
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    instance.method2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        thread1.start();
        thread2.start();    
        
    }
}