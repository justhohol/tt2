package z_test.test3serializable;

import java.io.Serializable;

public class Animal implements Serializable {

    private static final long serialVersionUID = 454017064427391151L;

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /**
     * 反序列化的时候需要使用这个方法
     */
    private void readObjectNoData() {
        this.type = "JIMAO";
    }
}
