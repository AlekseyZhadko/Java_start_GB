package GBJavaExceptions.Seminar3.Task1.Homework.Actions.CheckDateIsValid;

import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Locale;

public class CheckDateIsValid {
    public static boolean Check(String date) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.uuuu", Locale.US)
                .withResolverStyle(ResolverStyle.STRICT);
        DateValidator validator = new DateValidatorUsingDateTimeFormatter(dateFormatter);
        if (validator.isValid(date)) {
            return true;
        } else {
            return false;
        }
    }
}

