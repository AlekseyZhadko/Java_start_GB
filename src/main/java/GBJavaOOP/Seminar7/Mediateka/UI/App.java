package GBJavaOOP.Seminar7.Mediateka.UI;

import GBJavaOOP.Seminar7.Mediateka.Actions.Config;
import GBJavaOOP.Seminar7.Mediateka.Core.MVP.Presenter;
import GBJavaOOP.Seminar7.Mediateka.Core.MVP.View;

import java.util.Scanner;

public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");
        // ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        Config.init();
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Config.db);

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - Список всех фильмов  \n" +
                        " 2 - Список комедий  \n" +
                        " 3 - Список ужасов");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.ListFilm();
                        break;
                    case "2":
                        presenter.ListFilmComedian();
                        break;
                    case "3":
                        presenter.ListFilmHorrors();
                        break;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}
