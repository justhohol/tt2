package z_test.test5enum;

public enum Color {
    red, black, balabala;

    public static void main(String[] args) {
        Color c = Color.balabala;

        System.out.println("c.toString():" + c.toString());
        System.out.println("c.ordinal():" + c.ordinal());
        Color[] cs = Color.values();
        for (int x = 0; x < cs.length; x++) {
            System.out.println("cs[x]:" + cs[x]);
        }
    }
}
