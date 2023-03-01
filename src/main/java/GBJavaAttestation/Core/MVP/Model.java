package GBJavaAttestation.Core.MVP;

public class Model {
    private static String pathDBStoreToy = "src/main/java/GBJavaAttestation/DataBase/StoreToy.json";
    private static String pathDBWinToy = "src/main/java/GBJavaAttestation/DataBase/WinToy.json";

    public static String getPathDBStoreToy() {
        return pathDBStoreToy;
    }

    public static String getPathDBWinToy() {
        return pathDBWinToy;
    }
}
