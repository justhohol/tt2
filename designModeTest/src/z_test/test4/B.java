package z_test.test4;

public class B extends A {

    private static String b = "NB";

    private String j = "NB";
    {
        j = "B";
        System.out.println("构造代码块");
        System.out.println(j);
    }
    static {
        b = "Static B";
        System.out.println("静态代码块");
        System.out.println(b);
    }

    public B() {
        System.out.println("Construct B");
    }
}
