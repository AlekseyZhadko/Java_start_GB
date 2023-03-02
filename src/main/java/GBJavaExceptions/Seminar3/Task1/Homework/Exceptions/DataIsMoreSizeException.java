package GBJavaExceptions.Seminar3.Task1.Homework.Exceptions;

public class DataIsMoreSizeException extends Exception {
    public DataIsMoreSizeException() {
        super(ERRORS.ERR1002 + " - Entered more data than necessary!");
    }
}