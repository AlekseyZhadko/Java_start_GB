package GBJavaFinalCertification.Java.Actions;

import GBJavaFinalCertification.Java.Core.Models.packAnimal.Donkey;
import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadJsonDonkey {
    public static List Read(String path) {
        List<Donkey> newDonkey = new ArrayList<>();
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));
            List<Donkey> Donkeys = Arrays.asList(gson.fromJson(reader, Donkey[].class));
            reader.close();
            for (Donkey el : Donkeys) {
                newDonkey.add(el);
            }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return newDonkey;
    }
}
