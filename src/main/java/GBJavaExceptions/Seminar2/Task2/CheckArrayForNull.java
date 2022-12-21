package GBJavaExceptions.Seminar2.Task2;

public class CheckArrayForNull {
    public ERRORS CheckArrayForNull(Integer[] array) {
        if (array == null) {
            return ERRORS.ERR1001;
        } else {
            return ERRORS.NOERRORS;
        }
    }
}
