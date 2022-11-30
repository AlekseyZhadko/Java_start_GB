package GBJavaOOP.Seminar2.Task1.Research;

import GBJavaOOP.Seminar2.Task1.*;

import java.util.ArrayList;

abstract class Research {
    ArrayList<Node> tree;

    public Research(Tree pd) {
        tree = pd.getData();
    }

    protected ArrayList<Person> SearchNodeOfTree(Human p, Relationship re, String gender) {
        var result = new ArrayList<Person>();
        for (Node t : tree) {
            if (gender.equals("")) {
                if (t.p1.getFullName().equals(p.getFullName())
                        && t.re == re) {
                    result.add(t.p2);
                }
            } else {
                if (t.p1.getFullName().equals(p.getFullName())
                        && t.re == re
                        && t.p2.getGender().equals(gender)) {
                    result.add(t.p2);
                }
            }
        }
        return result;
    }

    protected ArrayList<Person> SearchNodeOfTree(Human p, Relationship re) {
        return this.SearchNodeOfTree(p,re,"");
    }
    ArrayList<Person> spend(Human p){
        return null;
    };
}