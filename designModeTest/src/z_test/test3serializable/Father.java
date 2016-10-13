package z_test.test3serializable;

public class Father /*implements Serializable*/{

    public String 跑;

    public static String p2;

    static {
        p2 = "static p2";
        System.out.println("Father 执行static代码块" + p2);
    }

    public Father() {
        System.out.println("Father执行了默认的构造方法");
        p2 = "Father默认p2";
        跑 = "Father默认跑";
    }

    public Father(String p2, String pao) {
        System.out.println("Father执行了带参数的的构造方法");
        p2 = "Father参数" + p2;
        跑 = "Father参数" + pao;
    }

    public String 跑() {
        return 跑;
    }

    private void readObjectNoData() {
        p2 = "readObjectNoData---P2";
    }
}
