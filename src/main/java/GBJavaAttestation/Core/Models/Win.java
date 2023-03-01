package GBJavaAttestation.Core.Models;

public class Win {
    private int id;
    private String name;
    private String date;
    public Win() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public Win(int id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "id = " + id +
                "; name = " + name +
                "; date = " + date + ";";
    }
}
