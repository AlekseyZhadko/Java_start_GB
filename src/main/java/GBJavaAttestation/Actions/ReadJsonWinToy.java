package GBJavaAttestation.Actions;

import GBJavaAttestation.Core.Models.Win;
import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadJsonWinToy {
    public static List Read(String path) {
        List<Win> winToy = new ArrayList<>();
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));
            List<Win> wins = Arrays.asList(gson.fromJson(reader, Win[].class));
            reader.close();
            for (Win el : wins) {
                winToy.add(el);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return winToy;
    }
}