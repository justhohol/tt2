package z_test.testForJSR303;

import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springside.modules.beanvalidator.BeanValidators;


public class mainTEST {

	public static void main(String[] args) {
		BeanForTest dto = new BeanForTest();
		try {
			ValidatorFactory vf =Validation.buildDefaultValidatorFactory();
			Validator validator = vf.getValidator();
			BeanValidators.validateWithException(validator, dto);
		} catch (ConstraintViolationException e) {
//			String emsg = BeanValidators.extractMessage(e).toString();
//			System.out.println("MSG:"+emsg);
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
