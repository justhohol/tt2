package z_test.test2bq;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Documented
@Inherited
@Target(value={ElementType.METHOD,ElementType.FIELD,ElementType.TYPE})   
@Retention(RetentionPolicy.RUNTIME) 
public @interface myoper {
	String mydes() default "default";

}
