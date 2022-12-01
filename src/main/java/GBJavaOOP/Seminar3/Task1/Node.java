package GBJavaOOP.Seminar3.Task1;

public class Node {

    public Person p1;
    public Relationship re;
    public Person p2;

    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    public String Printer(){
        if (re.equals(Relationship.PARENT)){
            return String.format("%s ---> %s ---> %s\n", p1, re, p2);
        }
        else return "";
    }
    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }

}
