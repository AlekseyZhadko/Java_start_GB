package GBJavaExceptions.Seminar1.Homework1;

class CheckArrayForErrors {
    public ERRORS CheckArrayForErrors(Integer[] array) {
        if (new CheckArrayForNull().CheckArrayForNull(array).equals(ERRORS.ERR1001)) {
            System.out.println(ERRORS.ERR1001 + " - массив(ы) равен(ы) NULL");
            return ERRORS.ERR1001;
        }
        if (new CheckArrayForElementNull().CheckArrayForElementNull(array).equals(ERRORS.ERR1002)) {
            System.out.println(ERRORS.ERR1002 + " - элемент(ы) массива содержат значение NULL");
            return ERRORS.ERR1002;
        }
        return ERRORS.NOERRORS;
    }
}