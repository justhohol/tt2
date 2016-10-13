package i_proxymode;


public class ProxyTest {
	public static void main(String[] args) {
		SourceableI source = new Proxy();
		source.method1();
	}
}
