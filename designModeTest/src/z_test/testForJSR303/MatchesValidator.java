package z_test.testForJSR303;

import java.lang.reflect.InvocationTargetException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.apache.commons.beanutils.BeanUtils;
public class MatchesValidator implements ConstraintValidator<TwoProperties,Object>{

	private String p1;
	private String p2;
	@Override
	public void initialize(TwoProperties arg0) {
		this.p1 = arg0.PROPString1();
		this.p2 = arg0.PROPString2();
	}

	@Override
	public boolean isValid(Object paramT, ConstraintValidatorContext arg1) {
//		try {
//			String field1Value = BeanUtils.getProperty(paramT, p1);
//			String field2Value = BeanUtils.getProperty(paramT, p2);
//			if(field1Value.equals(field2Value)){
//				return true;
//			}
//			return false;
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		} catch (InvocationTargetException e) {
//			e.printStackTrace();
//		} catch (NoSuchMethodException e) {
//			e.printStackTrace();
//		}
		return true;
	} 

}
