package eu.inmite.android.fw.validation.forms.annotations;

import eu.inmite.android.fw.validation.forms.iface.IValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Tomas Vondracek
 */
@Target(value= ElementType.FIELD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface Joined {
	/**
	 * view ids of all views that will participate with values passed to validator
	 * @return
	 */
	int[] value();
	Class<? extends IValidator<String[]>> validator();
	int messageId() default 0;
	int order() default 1000;
}