package x_interpretermode;

public class Test {

	public static void main(String[] args) {
		 // 计算9+2的值  
		int result = new Minus().interpret(new Context(9, 2));
		System.out.println(result);

	}

}
