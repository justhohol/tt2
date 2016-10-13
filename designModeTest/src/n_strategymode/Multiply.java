package n_strategymode;

public class Multiply extends AbstractCalculator implements CalculatorI {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp, "\\*");
		return arrayInt[0] * arrayInt[1];
	}

}
