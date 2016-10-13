package x_interpretermode;

public class Plus implements ExpressionI {

	@Override
	public int interpret(Context context) {
		return context.getNum1()+context.getNum2();  
	}

}
