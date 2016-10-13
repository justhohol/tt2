package o_templatemethodmode;


public class StrategyTest {
	public static void main(String[] args) {
		String exp = "2-8";
		AbstractCalculator cal = new Minus();  
		 int result = cal.calculate(exp, "\\-");  
		System.out.println(result);
	}

}
