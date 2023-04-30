package GBJavaFinalCertification.Java.Actions;

import GBJavaFinalCertification.Java.Core.Models.packAnimal.Horse;
import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadJsonHorse {
    public static List Read(String path) {
        List<Horse> newHorse = new ArrayList<>();
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));
            List<Horse> Horses = Arrays.asList(gson.fromJson(reader, Horse[].class));
            reader.close();
            for (Horse el : Horses) {
                newHorse.add(el);
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return newHorse;
    }
}
