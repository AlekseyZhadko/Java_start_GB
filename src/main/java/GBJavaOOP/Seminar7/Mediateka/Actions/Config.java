package GBJavaOOP.Seminar7.Mediateka.Actions;

import GBJavaOOP.Seminar7.Mediateka.Core.Models.Cinema;
import GBJavaOOP.Seminar7.Mediateka.Core.Models.Genre;

public class Config {
    public static DataBase db;
    public static DataBase init() {
        db = new DataBase();
        Cinema c1 = new Cinema(1, "Тьма", 1, 1);
        Cinema c2 = new Cinema(2, "Свет", 1, 2);
        Cinema c3 = new Cinema(3, "Особенности охоты", 3, 4);
        Cinema c4 = new Cinema(4, "Чуловек паук", 3, 3);
        Cinema c5 = new Cinema(5, "Тьма", 1, 1);
        Cinema c6 = new Cinema(6, "Свет", 1, 2);
        Cinema c7 = new Cinema(7, "Особенности охоты", 3, 4);
        Cinema c8 = new Cinema(8, "Человек паук", 3, 3);

        db.films.add(c1);
        db.films.add(c2);
        db.films.add(c3);
        db.films.add(c4);
        db.films.add(c5);
        db.films.add(c6);
        db.films.add(c7);
        db.films.add(c8);

        db.genres.add(new Genre(1, "Ужасы"));
        db.genres.add(new Genre(2, "Драма"));
        db.genres.add(new Genre(3, "Комедия"));
        FilmCreatorFactory pf = new FilmCreatorFactory();
        db.addStudios(pf.getFilmProducer("Ленфильм"));
        db.addStudios(pf.getFilmProducer("Марвел"));
        db.addStudios(pf.getFilmProducer("Мосфильм"));
        db.addStudios(pf.getFilmProducer("DC"));

        return db;
    }
}
