package GBJavaOOP.Seminar7.Mediateka.Core.Models;

public class Cinema {
    public int id;
    public int creatorId;
    public String name;
    public int genreId;

    public Cinema(int cinemaId, String name, int genreId, int creatorId) {
        this.id = cinemaId;
        this.creatorId = creatorId;
        this.name = name;
        this.genreId = genreId;
    }
}