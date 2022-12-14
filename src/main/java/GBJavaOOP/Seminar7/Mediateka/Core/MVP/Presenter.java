package GBJavaOOP.Seminar7.Mediateka.Core.MVP;

import GBJavaOOP.Seminar7.Mediateka.Actions.DataBase;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(View view, DataBase db) {
        this.view = view;
        model = new Model(db);
    }

    public void ListFilm() {
        view.getListFilms(model.getNumberOfFilms());
    }

    public void ListFilmComedian() {
        view.getListFilmsComedian(model.getNumberOfFilms());
    }

    public void ListFilmHorrors() {
        view.getListFilmsHorror(model.getNumberOfFilms());
    }
}
