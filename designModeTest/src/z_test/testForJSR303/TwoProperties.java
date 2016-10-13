package z_test.testForJSR303;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)  
@Constraint(validatedBy=MatchesValidator.class)
@Documented()
public @interface TwoProperties {
	public String message() default "{constraint.not.matches}";
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {}; 
    String PROPString1() ;
    String PROPString2() ;
}
