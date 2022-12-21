package GBJavaExceptions.Seminar2.Task2;

public class Task2 {
    Integer[] array;
    Integer division;
    Integer position;
    ERRORS check = ERRORS.NOERRORS;

    public Task2(Integer[] intArray, Integer pos, Integer div) {
        this.array = intArray;
        this.division = div;
        this.position = pos;
    }

    public void Task2() {
        check = new CheckArrayForNull().CheckArrayForNull(array);
        if (check.equals(ERRORS.NOERRORS)) {
            if (array.length >= position) {
                if (array[position] == null) {
                    System.out.println(ERRORS.ERR1003 + " - элемент массива равен null");
                } else {
                    try {
                        double catchedRes1 = array[position] / division;
                        System.out.println("Result = " + catchedRes1);
                    } catch (ArithmeticException e) {
                        System.out.println(ERRORS.ERR1004 + "- деление на ноль не возможно");
                    }
                }
            } else {
                System.out.println(ERRORS.ERR1002 + " - неверная длинна массива");
            }
        } else {
            System.out.println(ERRORS.ERR1001 + " - массив равен NULL");
        }
    }
}
