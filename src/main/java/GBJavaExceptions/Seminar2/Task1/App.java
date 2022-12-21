package GBJavaExceptions.Seminar2.Task1;

import java.util.Scanner;

public class App {
    static void run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        String str = in.next();
        Task1 task = new Task1(str);
        if (task.CheckNumberForFloat()) {
            System.out.println("Дробное число: " + str);
        } else {
            System.out.println("Неверные данные");
        }
    }
}
