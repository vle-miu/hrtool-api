package mti.vn.hrtool.validation.validator;

import mti.vn.hrtool.validation.DateFormat;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormatValidator implements ConstraintValidator<DateFormat, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setLenient(false);
        try {
            df.parse(value);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

}