package GBJavaExceptions.Seminar1.Homework1;

class CheckArrayForNull {
    public ERRORS CheckArrayForNull(Integer[] array) {
        if (array == null) {
            return ERRORS.ERR1001;
        } else {
            return ERRORS.NOERRORS;
        }
    }
}
