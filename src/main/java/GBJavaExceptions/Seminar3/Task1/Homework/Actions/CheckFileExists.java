package GBJavaExceptions.Seminar3.Task1.Homework.Actions;

import GBJavaExceptions.Seminar3.Task1.Homework.Core.MVP.Model;
import GBJavaExceptions.Seminar3.Task1.Homework.Core.Models.People;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CheckFileExists {
    public static void Check(People people) {
        File People = new File(Model.getPathDB() + people.getLastName() + ".json");
        if (People.exists() == false) {
            List<People> newPeopls = new ArrayList<>();
            newPeopls.add(people);
            WriteJsonFile.Write(newPeopls, Model.getPathDB() + people.getLastName() + ".json");
        } else {
            List<People> newPeopls = ReadJsonFile.Read(Model.getPathDB() + people.getLastName() + ".json");
            newPeopls.add(people);
            WriteJsonFile.Write(newPeopls, Model.getPathDB() + people.getLastName() + ".json");
        }
    }
}
