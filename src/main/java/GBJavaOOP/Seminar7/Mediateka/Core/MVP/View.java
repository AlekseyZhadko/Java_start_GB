package GBJavaOOP.Seminar7.Mediateka.Core.MVP;

public interface View {
    void getAllInfoBy(int id);

    void getListFilms(int number);

    void getListFilmsComedian(int numberOfFilms);

    void getListFilmsHorror(int numberOfFilms);
}
