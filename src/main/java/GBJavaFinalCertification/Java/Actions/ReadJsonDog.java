package GBJavaFinalCertification.Java.Actions;

import GBJavaFinalCertification.Java.Core.Models.pet.Dog;
import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadJsonDog {
    public static List Read(String path) {
        List<Dog> newDog = new ArrayList<>();
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));
            List<Dog> Dogs = Arrays.asList(gson.fromJson(reader, Dog[].class));
            reader.close();
            for (Dog el : Dogs) {
                newDog.add(el);
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return newDog;
    }
}
