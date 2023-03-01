package GBJavaAttestation.Core.Models;

public class Toy {
    private int id;
    private String name;
    private int count;
    private int weight;

    public Toy() {
    }

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Toy(int id, String name, int count, int weight) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "id = " + id +
                "; name = " + name +
                "; count = " + count +
                "; weight = " + weight + "%;";

    }
}
