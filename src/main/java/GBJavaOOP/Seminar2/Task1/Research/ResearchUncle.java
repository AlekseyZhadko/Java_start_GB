package GBJavaOOP.Seminar2.Task1.Research;

import GBJavaOOP.Seminar2.Task1.Human;
import GBJavaOOP.Seminar2.Task1.Person;
import GBJavaOOP.Seminar2.Task1.Relationship;
import GBJavaOOP.Seminar2.Task1.Tree;

import java.util.ArrayList;

public class ResearchUncle extends Research{
    public ResearchUncle(Tree pd) {
        super(pd);
    }

    @Override
    public ArrayList<Person> spend(Human p) {
        var result = new ArrayList<Person>();
        for (Human person : SearchNodeOfTree(p, Relationship.CHILDREN)) {
            for (Human person2 : SearchNodeOfTree(person, Relationship.CHILDREN, "Man")) {
                for (Person person3 : SearchNodeOfTree(person2, Relationship.PARENT, "Man")) {
                    if (!person.getFullName().equals(person3.getFullName())) {
                        result.add(person3);
                    }
                }
            }
        }
        return result;
    }
}
