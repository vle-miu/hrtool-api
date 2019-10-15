package mti.vn.hrtool.validation;

import mti.vn.hrtool.validation.validator.DateFormatValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateFormatValidator.class)
@Documented
public @interface DateFormat {

    String message() default "Date format is incorrect";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}