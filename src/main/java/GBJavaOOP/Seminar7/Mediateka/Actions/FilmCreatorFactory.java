package GBJavaOOP.Seminar7.Mediateka.Actions;


import GBJavaOOP.Seminar7.Mediateka.Core.Models.Studio;

class FilmCreatorFactory {
    int count = 1;

    public Studio getFilmProducer(String name) {
        Studio fp = new Studio();
        fp.id = count++;
        fp.titleName = name;
        return fp;
    }
}
