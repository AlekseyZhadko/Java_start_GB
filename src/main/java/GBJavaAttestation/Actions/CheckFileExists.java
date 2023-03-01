package GBJavaAttestation.Actions;

import GBJavaAttestation.Core.MVP.Model;
import GBJavaAttestation.Core.Models.Toy;
import GBJavaAttestation.Core.Models.Win;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CheckFileExists {
    public static void Check() {
        File WinToyFile = new File(Model.getPathDBWinToy());
        if (WinToyFile.exists() == false || isEmptyFile(Model.getPathDBWinToy())) {
            List<Win> newWins = new ArrayList<>();
            newWins.add(new Win());
            WriteJsonFile.Write(newWins, Model.getPathDBWinToy());
        }

        File StoreToyFile = new File(Model.getPathDBStoreToy());
        if (StoreToyFile.exists() == false ||
                isEmptyFile(Model.getPathDBStoreToy()) ||
                StoreToyFile.length() == 2) {
            List<Toy> newToys = new ArrayList<>();
            newToys.add(new Toy());
            WriteJsonFile.Write(newToys, Model.getPathDBStoreToy());
        }
    }
    static boolean isEmptyFile(String path) {
        try {
            for (String line : Files.readAllLines(Paths.get(path))) {
                if (line != null && !line.trim().isEmpty()) {
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
