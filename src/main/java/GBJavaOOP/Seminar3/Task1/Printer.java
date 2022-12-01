package GBJavaOOP.Seminar3.Task1;

import GBJavaOOP.Seminar3.Task1.Research.*;

public class Printer {
    public void printResearchGeoTree(Human p, Tree gt) {
        System.out.println("1. Mother: " + new ResearchMother(gt).spend(p));
        System.out.println("2. Father: " + new ResearchFather(gt).spend(p));
        System.out.println("3. Parent: " + new ResearchParent(gt).spend(p));
        System.out.println("4. GrandMothers: " + new ResearchGrandMother(gt).spend(p));
        System.out.println("5. GrandFathers: " + new ResearchGrandFather(gt).spend(p));
        System.out.println("6. GrandParent: " + new ResearchGrandParent(gt).spend(p));
        System.out.println("7. Childrens: " + new ResearchChildrens(gt).spend(p));
        System.out.println("8. MotherInLawWife: " + new ResearchMotherInLawWife(gt).spend(p));
        System.out.println("9. FatherInLawWife: " + new ResearchFatherInLawWife(gt).spend(p));
        System.out.println("10. MotherInLawHusband: " + new ResearchMotherInLawHusband(gt).spend(p));
        System.out.println("11. FatherInLawHusband: " + new ResearchFatherInLawHusband(gt).spend(p));
        System.out.println("12. Broters: " + new ResearchBrother(gt).spend(p));
        System.out.println("13. Sisters: " + new ResearchSister(gt).spend(p));
        System.out.println("14. Uncle: " + new ResearchUncle(gt).spend(p));
        System.out.println("15. Aunt: " + new ResearchAunt(gt).spend(p));
    }
}
