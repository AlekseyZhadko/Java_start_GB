package GBJavaExceptions.Seminar3.Task1.Homework.Exceptions;

public class DataLessSizeException extends Exception {
    public DataLessSizeException() {
        super(ERRORS.ERR1001 + " - Entered less data than necessary!");
    }
}
