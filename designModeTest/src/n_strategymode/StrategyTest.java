package n_strategymode;


public class StrategyTest {
	public static void main(String[] args) {
		String exp = "2-8";
		CalculatorI cal = new Minus();
		int result = cal.calculate(exp);
		System.out.println(result);
	}

}
