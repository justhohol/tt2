package z_test.test3serializable;

import java.io.Serializable;

public class Son extends Father implements Serializable {

    private static final long serialVersionUID = -5145385234975213866L;

    static {
        System.out.println("Son 执行static代码块");
    }

    // public Father myfather = new Father();

    public Son() {
        // super("Son FATHER", "Son FATHER");
        System.out.println("执行了子类的默认构造方法");
        this.sp1 = "Son对象默认sp1";
        this.p2 = "Son对象默认p2";
        this.跑 = "Son对象默认跑";
    }

    public Son(String sp1, String p2, String PAO) {
        // super("Son FATHER", "Son FATHER");
        System.out.println("执行了子类的带参数构造方法");
        this.sp1 = sp1;
        this.p2 = p2;
        this.跑 = PAO;
    }

    public String sp1;

    public void show() {
        System.out.println("sp1:" + sp1 + "p2:" + p2 + "~" + 跑);
    }
}
