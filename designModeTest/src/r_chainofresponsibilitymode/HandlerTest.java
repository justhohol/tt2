package r_chainofresponsibilitymode;

public class HandlerTest {

	public static void main(String[] args) {
		
		MyHandler h1 = new MyHandler("h1");
		MyHandler h2 = new MyHandler("h2");
		MyHandler h3 = new MyHandler("h3");
		h1.setMyhander(h2);
		h2.setMyhander(h3);
//		h3.setMyhander(h1);
		h1.operation();
		
	}

}
