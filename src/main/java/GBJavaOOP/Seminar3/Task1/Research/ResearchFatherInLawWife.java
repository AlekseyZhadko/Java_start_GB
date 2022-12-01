package GBJavaOOP.Seminar3.Task1.Research;

import GBJavaOOP.Seminar3.Task1.Human;
import GBJavaOOP.Seminar3.Task1.Person;
import GBJavaOOP.Seminar3.Task1.Relationship;
import GBJavaOOP.Seminar3.Task1.Tree;

import java.util.ArrayList;

public class ResearchFatherInLawWife extends Research {
    public ResearchFatherInLawWife(Tree pd) {
        super(pd);
    }

    @Override
    public ArrayList<Person> spend(Human p) {
        var result = new ArrayList<Person>();
        for (Human person : SearchNodeOfTree(p, Relationship.PARENT)) {
            for (Person i : SearchNodeOfTree(person, Relationship.CHILDREN, "Woman")) {
                result.addAll(SearchNodeOfTree(i, Relationship.CHILDREN, "Man"));
            }
        }
        return result;
    }
}
