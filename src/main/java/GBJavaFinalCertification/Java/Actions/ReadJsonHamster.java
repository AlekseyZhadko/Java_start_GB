package GBJavaFinalCertification.Java.Actions;

import GBJavaFinalCertification.Java.Core.Models.pet.Hamster;
import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadJsonHamster {
    public static List Read(String path) {
        List<Hamster> newHamster = new ArrayList<>();
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));
            List<Hamster> Hamsters = Arrays.asList(gson.fromJson(reader, Hamster[].class));
            reader.close();
            for (Hamster el : Hamsters) {
                newHamster.add(el);
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return newHamster;
    }
}
