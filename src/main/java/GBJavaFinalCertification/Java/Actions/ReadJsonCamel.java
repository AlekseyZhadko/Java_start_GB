package GBJavaFinalCertification.Java.Actions;

import GBJavaFinalCertification.Java.Core.Models.packAnimal.Camel;
import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadJsonCamel {
    public static List Read(String path) {
        List<Camel> newCamel = new ArrayList<>();
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));
            List<Camel> Camels = Arrays.asList(gson.fromJson(reader, Camel[].class));
            reader.close();
            for (Camel el : Camels) {
                newCamel.add(el);
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return newCamel;
    }
}
