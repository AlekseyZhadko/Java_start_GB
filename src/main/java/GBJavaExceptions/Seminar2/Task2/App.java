package GBJavaExceptions.Seminar2.Task2;

import java.util.Arrays;

public class App {
    static void run() {
        System.out.println("Начало работы программы!");
        Integer[] array1 = null;
        System.out.println("Case 1: ");
        System.out.println("Массив = " + Arrays.toString(array1));
        Task2 task1 = new Task2(array1,8,0);
        task1.Task2();

        Integer[] array2 = {1, 2, 3, 4};
        System.out.println("Case 2: ");
        System.out.println("Массив = " + Arrays.toString(array2));
        Task2 task2 = new Task2(array2,8,0);
        task2.Task2();

        Integer[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Case 3: ");
        System.out.println("Массив = " + Arrays.toString(array3));
        Task2 task3 = new Task2(array3,8,0);
        task3.Task2();

        Integer[] array4 = {1, 2, 3, 4, 5, 6, 7, null, null, null};
        System.out.println("Case 4: ");
        System.out.println("Массив = " + Arrays.toString(array4));
        Task2 task4 = new Task2(array4,8,0);
        task4.Task2();

        Integer[] array5 = {1, 2, 3, 4, 5, 6, 7, null, 9, null};
        System.out.println("Case 5: ");
        System.out.println("Массив = " + Arrays.toString(array5));
        Task2 task5 = new Task2(array5,8,2);
        task5.Task2();
        System.out.println("Программа завершила работу!");
    }
}
