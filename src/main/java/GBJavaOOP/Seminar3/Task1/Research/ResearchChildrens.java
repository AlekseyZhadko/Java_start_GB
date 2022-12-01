package GBJavaOOP.Seminar3.Task1.Research;

import GBJavaOOP.Seminar3.Task1.Human;
import GBJavaOOP.Seminar3.Task1.Person;
import GBJavaOOP.Seminar3.Task1.Relationship;
import GBJavaOOP.Seminar3.Task1.Tree;

import java.util.ArrayList;

public class ResearchChildrens extends Research {
    public ResearchChildrens(Tree pd) {
        super(pd);
    }

    @Override
    public ArrayList<Person> spend(Human p) {
        return SearchNodeOfTree(p, Relationship.PARENT);
    }
}
