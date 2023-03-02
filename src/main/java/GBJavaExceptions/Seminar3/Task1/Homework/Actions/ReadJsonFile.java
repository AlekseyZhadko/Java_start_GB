package GBJavaExceptions.Seminar3.Task1.Homework.Actions;

import GBJavaExceptions.Seminar3.Task1.Homework.Core.Models.People;
import com.google.gson.Gson;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadJsonFile {
    public static List Read(String path) {
        List<People> newPeople = new ArrayList<>();
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));
            List<People> peopls = Arrays.asList(gson.fromJson(reader, People[].class));
            reader.close();
            for (People el : peopls) {
                newPeople.add(el);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return newPeople;
    }
}