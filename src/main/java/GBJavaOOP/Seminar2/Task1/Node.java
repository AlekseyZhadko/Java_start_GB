package GBJavaOOP.Seminar2.Task1;

public class Node {

    public Person p1;
    public Relationship re;
    public Person p2;

    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }
}
