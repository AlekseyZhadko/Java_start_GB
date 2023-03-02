package GBJavaExceptions.Seminar3.Task1.Homework.Actions.CheckDateIsValid;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class DateValidatorUsingDateTimeFormatter implements DateValidator {
    private DateTimeFormatter dateFormatter;

    public DateValidatorUsingDateTimeFormatter(DateTimeFormatter dateFormatter) {
        this.dateFormatter = dateFormatter;
    }

    @Override
    public boolean isValid(String dateStr) {
        try {
            this.dateFormatter.parse(dateStr);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }
}
