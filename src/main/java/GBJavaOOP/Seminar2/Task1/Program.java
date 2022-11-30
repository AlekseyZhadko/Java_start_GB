package GBJavaOOP.Seminar2.Task1;

import GBJavaOOP.Seminar2.Task1.Research.*;

public class Program {
    public static void main(String[] args) {
        var GolovanovaAR = new Person("GolovanovaAR", "Woman");
        var TihonovRM = new Person("TihonovRM", "Man");
        var TihonovaRM = new Person("TihonovaRM", "Woman");
        var TihonovMN = new Person("TihonovMN", "Man");
        var TihonovNA = new Person("TihonovNA", "Man");
        var KuznecovaVA = new Person("KuznecovaVA", "Woman");
        var TihonovaET = new Person("TihonovaET", "Woman");
        var LevinTP = new Person("LevinTP", "Man");
        var LevinaIS = new Person("LevinaIS", "Woman");
        var TihonovaII = new Person("TihonovaII", "Woman");
        var SuhovVI = new Person("SuhovVI", "Man");
        var SuhovIN = new Person("SuhovIN", "Man");
        var SuhovNN = new Person("SuhovNN", "Man");
        var SuhovII = new Person("SuhovII", "Man");
        var SuhovaEA = new Person("SuhovaEA", "Woman");
        var AgafonovAA = new Person("AgafonovAA", "Man");
        var AgafonovaEE = new Person("AgafonovaEE", "Woman");

        GeoTree gt = new GeoTree();
        gt.append(TihonovRM, GolovanovaAR);
        gt.append(TihonovaII, GolovanovaAR);
        gt.append(TihonovMN, TihonovRM);
        gt.append(TihonovaET, TihonovRM);
        gt.append(TihonovNA, TihonovMN);
        gt.append(KuznecovaVA, TihonovMN);
        gt.append(LevinTP, TihonovaET);
        gt.append(LevinaIS, TihonovaET);
        gt.append(SuhovIN, TihonovaII);
        gt.append(SuhovaEA, TihonovaII);
        gt.append(SuhovNN, SuhovIN);
        gt.append(SuhovII, SuhovIN);
        gt.append(AgafonovAA, SuhovaEA);
        gt.append(AgafonovaEE, SuhovaEA);
        gt.append(SuhovIN, SuhovVI);
        gt.append(SuhovaEA, SuhovVI);
        gt.append(TihonovMN, TihonovaRM);
        gt.append(TihonovaET, TihonovaRM);

//        for (Node i : gt.getData()) {
//            System.out.println(i);
//        }

        System.out.println("1. Mother: " + new ResearchMother(gt).spend(TihonovRM));
        System.out.println("2. Father: " + new ResearchFather(gt).spend(TihonovRM));
        System.out.println("3. Parent: " + new ResearchParent(gt).spend(TihonovRM));
        System.out.println("4. GrandMothers: " + new ResearchGrandMother(gt).spend(TihonovRM));
        System.out.println("5. GrandFathers: " + new ResearchGrandFather(gt).spend(TihonovRM));
        System.out.println("6. GrandParent: " + new ResearchGrandParent(gt).spend(TihonovRM));
        System.out.println("7. Childrens: " + new ResearchChildrens(gt).spend(TihonovRM));
        System.out.println("8. MotherInLawWife: " + new ResearchMotherInLawWife(gt).spend(TihonovRM));
        System.out.println("9. FatherInLawWife: " + new ResearchFatherInLawWife(gt).spend(TihonovRM));
        System.out.println("10. MotherInLawHusband: " + new ResearchMotherInLawHusband(gt).spend(TihonovaII));
        System.out.println("11. FatherInLawHusband: " + new ResearchFatherInLawHusband(gt).spend(TihonovaII));
        System.out.println("12. Broters: " + new ResearchBrother(gt).spend(TihonovaII));
        System.out.println("13. Sisters: " + new ResearchSister(gt).spend(TihonovRM));
        System.out.println("14. Uncle: " + new ResearchUncle(gt).spend(GolovanovaAR));
        System.out.println("15. Aunt: " + new ResearchAunt(gt).spend(GolovanovaAR));
    }
}





