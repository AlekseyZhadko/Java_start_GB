package GBJavaExceptions.Seminar2.Task4;

import java.util.Scanner;

public class App {
    static void run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.next();
        Task4 task = new Task4(str);
        System.out.println(task.CheckStrIsEmpty());
        if (task.CheckStrIsEmpty()) {

            System.out.println("Cтрока: " + str);
        } else {
            System.out.println("Пустые строки вводить нельзя");
        }
    }
}
