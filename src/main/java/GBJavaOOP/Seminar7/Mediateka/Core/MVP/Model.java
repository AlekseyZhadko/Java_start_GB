package GBJavaOOP.Seminar7.Mediateka.Core.MVP;

import GBJavaOOP.Seminar7.Mediateka.Actions.DataBase;

public class Model {
    DataBase db;
    public Model(DataBase db) {
        this.db = db;
    }

    public int getNumberOfFilms() {
        return db.films.size();
    }
}
