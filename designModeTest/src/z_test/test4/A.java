package z_test.test4;

public class A {

    private static String a = "NA";

    private String i = "NA";
    {
        i = "A";
        System.out.println("构造代码块");
        System.out.println(i);
    }
    static {
        a = "Static A";
        System.out.println("静态代码块");
        System.out.println(a);
    }

    public A() {
        System.out.println("Construct A");
    }
}
