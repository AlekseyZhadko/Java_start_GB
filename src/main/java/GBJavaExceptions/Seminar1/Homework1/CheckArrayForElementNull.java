package GBJavaExceptions.Seminar1.Homework1;

class CheckArrayForElementNull {
    public ERRORS CheckArrayForElementNull(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return ERRORS.ERR1002;
            }
        }
        return ERRORS.NOERRORS;
    }
}