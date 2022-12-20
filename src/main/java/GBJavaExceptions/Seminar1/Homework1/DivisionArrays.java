package GBJavaExceptions.Seminar1.Homework1;

class DivisionArrays {
    Integer[] arr1;
    Integer[] arr2;
    Integer[] newArray;
    ERRORS check1 = ERRORS.NOERRORS;
    ERRORS check2 = ERRORS.NOERRORS;

    public DivisionArrays(Integer[] array1, Integer[] array2) {
        this.arr1 = array1;
        this.arr2 = array2;
    }

    public Integer[] Division() {
        check1 = new CheckArrayForErrors().CheckArrayForErrors(arr1);
        check2 = new CheckArrayForErrors().CheckArrayForErrors(arr2);
        ERRORS result = ERRORS.NOERRORS;
        if (check1.equals(ERRORS.NOERRORS) && check2.equals(ERRORS.NOERRORS)) {
            if (arr1.length == arr2.length) {
                newArray = new Integer[arr1.length];
                for (int i = 0; i < newArray.length; i++) {
                    if (!arr2[i].equals(0)) {
                        newArray[i] = arr1[i] / arr2[i];
                    } else {
                        result = ERRORS.ERR1004;
                    }
                }
            } else {
                System.out.println(ERRORS.ERR1003 + " - массивы разной длины (операция не возможна)");
            }
        }
        if (result.equals(ERRORS.ERR1004)) {
            System.out.println(ERRORS.ERR1004 + " - деление на ноль не возможно");
            return newArray = null;
        } else {
            return newArray;
        }
    }
}
