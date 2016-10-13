package z_test.test4;

public class C {

    public static void main(String[] args) {
        try {
            // Class.forName("z_test.test4.B"); //载入的时候就会执行静态代码块
            System.out.println("====================");
            new B();
            System.out.println("====================");
            new B();
            System.out.println("====================");
            Class.forName("z_test.test4.B");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
