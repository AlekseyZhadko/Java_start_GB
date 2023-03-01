package GBJavaAttestation.Actions;

import GBJavaAttestation.Core.Models.Toy;
import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadJsonStoreToy {
    public static List Read(String path) {
        List<Toy> newToys = new ArrayList<>();
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));
            List<Toy> toys = Arrays.asList(gson.fromJson(reader, Toy[].class));
            reader.close();
            for (Toy el : toys) {
                newToys.add(el);
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return newToys;
    }
}
