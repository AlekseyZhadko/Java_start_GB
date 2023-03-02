package GBJavaExceptions.Seminar3.Task1.Homework.UI;

import GBJavaExceptions.Seminar3.Task1.Homework.Exceptions.DataIsMoreSizeException;
import GBJavaExceptions.Seminar3.Task1.Homework.Exceptions.DataLessSizeException;
import GBJavaExceptions.Seminar3.Task1.Homework.Exceptions.IncorrectDataException;

import java.util.Scanner;

import static GBJavaExceptions.Seminar3.Task1.Homework.Actions.ElementArraySum.ElementArraySum;

public class App {
    public static void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the data in any order separated by a space:\n" +
                "Last Name First Name Patronymic Date of Birth Phone Number Gender\n" +
                " * birthdate - format string dd.mm.yyyy\n" +
                " * phone number - unsigned integer without formatting\n" +
                " * gender - Latin character f or m\n" +
                "For example: Ivanov Ivan Ivanovich 10.10.2000 88006556565 m");
        String str = in.nextLine();

        str = str.replaceAll("\\s+", " ");
        String[] array = str.split(" ");

        try {
            ElementArraySum(array);
        } catch (DataLessSizeException | DataIsMoreSizeException | IncorrectDataException e) {
            System.out.println(e.getMessage());
            App.run();
        }
    }
}


