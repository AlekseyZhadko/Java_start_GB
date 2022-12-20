package GBJavaExceptions.Seminar1.Homework1;

class SumArrays {
    Integer[] arr1;
    Integer[] arr2;
    Integer[] newArray;
    ERRORS check1 = ERRORS.NOERRORS;
    ERRORS check2 = ERRORS.NOERRORS;

    public SumArrays(Integer[] array1, Integer[] array2) {
        this.arr1 = array1;
        this.arr2 = array2;
    }

    public Integer[] Sum() {
        check1 = new CheckArrayForErrors().CheckArrayForErrors(arr1);
        check2 = new CheckArrayForErrors().CheckArrayForErrors(arr2);
        if (check1.equals(ERRORS.NOERRORS) && check2.equals(ERRORS.NOERRORS)) {
            if (arr1.length == arr2.length) {
                newArray = new Integer[arr1.length];
                for (int i = 0; i < newArray.length; i++) {
                    newArray[i] = arr1[i] + arr2[i];
                }
            } else {
                System.out.println(ERRORS.ERR1003 + " - массивы разной длины (операция не возможна)");
            }
        }
        return newArray;
    }
}
