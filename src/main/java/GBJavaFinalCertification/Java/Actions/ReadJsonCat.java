package GBJavaFinalCertification.Java.Actions;

import GBJavaFinalCertification.Java.Core.Models.pet.Cat;

import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadJsonCat {
    public static List Read(String path) {
        List<Cat> newCat = new ArrayList<>();
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));
            List<Cat> Cats = Arrays.asList(gson.fromJson(reader, Cat[].class));
            reader.close();
            for (Cat el : Cats) {
                newCat.add(el);
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return newCat;
    }
}
