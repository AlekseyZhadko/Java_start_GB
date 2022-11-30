package GBJavaOOP.Seminar2.Task1.Research;

import GBJavaOOP.Seminar2.Task1.Human;
import GBJavaOOP.Seminar2.Task1.Person;
import GBJavaOOP.Seminar2.Task1.Relationship;
import GBJavaOOP.Seminar2.Task1.Research.Research;
import GBJavaOOP.Seminar2.Task1.Tree;

import java.util.ArrayList;

public class ResearchParent extends Research {
    public ResearchParent(Tree pd) {
        super(pd);
    }

    @Override
    public ArrayList<Person> spend(Human p) {
        return SearchNodeOfTree(p, Relationship.CHILDREN);
    }
}
