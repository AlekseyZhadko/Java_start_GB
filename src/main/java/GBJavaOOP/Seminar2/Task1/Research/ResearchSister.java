package GBJavaOOP.Seminar2.Task1.Research;

import GBJavaOOP.Seminar2.Task1.Human;
import GBJavaOOP.Seminar2.Task1.Person;
import GBJavaOOP.Seminar2.Task1.Relationship;
import GBJavaOOP.Seminar2.Task1.Tree;

import java.util.ArrayList;

public class ResearchSister extends Research{
    public ResearchSister(Tree pd) {
        super(pd);
    }

    @Override
    public ArrayList<Person> spend(Human p) {
        var result = new ArrayList<Person>();
        for (Human person : SearchNodeOfTree(p, Relationship.CHILDREN, "Man")) {
            result.addAll(SearchNodeOfTree(person, Relationship.PARENT, "Woman"));
        }
        return result;
    }
}
