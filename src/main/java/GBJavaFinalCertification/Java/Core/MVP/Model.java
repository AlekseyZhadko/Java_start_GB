package GBJavaFinalCertification.Java.Core.MVP;

public class Model {
    private static String pathDBHamster = "src/main/java/GBJavaFinalCertification/Java/DataBase/Pet/Hamster.json";
    private static String pathDBCat = "src/main/java/GBJavaFinalCertification/Java/DataBase/Pet/Cat.json";
    private static String pathDBDog = "src/main/java/GBJavaFinalCertification/Java/DataBase/Pet/Dog.json";
    private static String pathDBHorse = "src/main/java/GBJavaFinalCertification/Java/DataBase/PackAnimal/Horse.json";
    private static String pathDBCamel = "src/main/java/GBJavaFinalCertification/Java/DataBase/PackAnimal/Camel.json";
    private static String pathDBDonkey = "src/main/java/GBJavaFinalCertification/Java/DataBase/PackAnimal/Donkey.json";


    public static String getPathDBCamel() {
        return pathDBCamel;
    }

    public static String getPathDBCat() {
        return pathDBCat;
    }

    public static String getPathDBDog() {
        return pathDBDog;
    }

    public static String getPathDBDonkey() {
        return pathDBDonkey;
    }

    public static String getPathDBHamster() {
        return pathDBHamster;
    }

    public static String getPathDBHorse() {
        return pathDBHorse;
    }
}
