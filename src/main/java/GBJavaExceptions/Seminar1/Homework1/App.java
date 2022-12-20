package GBJavaExceptions.Seminar1.Homework1;

import java.util.Arrays;

class App {
    static void run() {
        System.out.println("Начало работы программы!");

        Integer[] array1 = null;
        Integer[] array2 = {1, 2, 3, 4, 5, 7, 8, 9, 10, 1};
        System.out.println("Case 1: ");
        System.out.println("Массив 1 = " + Arrays.toString(array1));
        System.out.println("Массив 2 = " + Arrays.toString(array2));
        SumArrays task1 = new SumArrays(array1, array2);
        System.out.println("Сумма массивов = " + Arrays.toString(task1.Sum()));

        Integer[] array3 = {1, 2, null, 4, 5, 7, 8, 9, 10, 1};
        Integer[] array4 = {1, 2, 3, 4, 5, 7, 8, 9, 10, 1};
        System.out.println("\nCase 2: ");
        System.out.println("Массив 1 = " + Arrays.toString(array3));
        System.out.println("Массив 2 = " + Arrays.toString(array4));
        SumArrays task2 = new SumArrays(array3, array4);
        System.out.println("Сумма массивов = " + Arrays.toString(task2.Sum()));

        Integer[] array5 = {1, 2, 4, 4, 5, 7, 8, 9, 10, 1};
        Integer[] array6 = {1, 2, 3, 4, 5, 7, 8, 9, 10, 1};
        System.out.println("\nCase 3: ");
        System.out.println("Массив 1 = " + Arrays.toString(array5));
        System.out.println("Массив 2 = " + Arrays.toString(array6));
        SumArrays task3 = new SumArrays(array5, array6);
        System.out.println("Сумма массивов = " + Arrays.toString(task3.Sum()));

        Integer[] array7 = {1, 2, 4, 4, 5, 7, 8, 9, 10, 1};
        Integer[] array8 = {1, 2, 3, 4, 5, 7, 8, 9, 1};
        System.out.println("\nCase 4: ");
        System.out.println("Массив 1 = " + Arrays.toString(array7));
        System.out.println("Массив 2 = " + Arrays.toString(array8));
        SumArrays task4 = new SumArrays(array7, array8);
        System.out.println("Сумма массивов = " + Arrays.toString(task4.Sum()));

        Integer[] array9 = {1, 2, 4, 4, 5, 7, 8, 9, 10, 1};
        Integer[] array10 = {1, 2, 3, 4, 5, 7, 8, 9, 1};
        System.out.println("\nCase 5: ");
        System.out.println("Массив 1 = " + Arrays.toString(array9));
        System.out.println("Массив 2 = " + Arrays.toString(array10));
        DivisionArrays task5 = new DivisionArrays(array9, array10);
        System.out.println("Деление массивов = " + Arrays.toString(task5.Division()));

        Integer[] array11 = {1, 2, 4, 4, 5, 7, 8, 9, 10, 1};
        Integer[] array12 = {1, 2, 3, 4, 5, 7, 8, 9, 1, 0};
        System.out.println("\nCase 6: ");
        System.out.println("Массив 1 = " + Arrays.toString(array11));
        System.out.println("Массив 2 = " + Arrays.toString(array12));
        DivisionArrays task6 = new DivisionArrays(array11, array12);
        System.out.println("Деление массивов = " + Arrays.toString(task6.Division()));

        System.out.println("Программа завершила работу!");
    }
}







