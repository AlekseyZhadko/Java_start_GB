package GBJavaExceptions.Seminar3.Task1.Homework.Actions;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WriteJsonFile {
    public static void Write(List list, String path) {
        try {
            Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
            Writer writer = Files.newBufferedWriter(Paths.get(path));
            gsonBuilder.toJson(list, writer);
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
