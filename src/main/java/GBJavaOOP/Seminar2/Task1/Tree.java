package GBJavaOOP.Seminar2.Task1;

import java.util.ArrayList;

public interface Tree {
    void append(Person parent, Person children);

    ArrayList<Node> getData();
}