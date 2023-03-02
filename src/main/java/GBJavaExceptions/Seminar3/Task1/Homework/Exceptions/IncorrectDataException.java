package GBJavaExceptions.Seminar3.Task1.Homework.Exceptions;

public class IncorrectDataException extends Exception {
    public IncorrectDataException(String message) {
        super(ERRORS.ERR1003 + " Incorrect data:" + message);
    }
}
