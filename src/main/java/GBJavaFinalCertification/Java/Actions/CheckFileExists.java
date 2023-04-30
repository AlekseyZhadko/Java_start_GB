package GBJavaFinalCertification.Java.Actions;


import GBJavaFinalCertification.Java.Core.MVP.Model;
import GBJavaFinalCertification.Java.Core.Models.packAnimal.Camel;
import GBJavaFinalCertification.Java.Core.Models.packAnimal.Donkey;
import GBJavaFinalCertification.Java.Core.Models.packAnimal.Horse;
import GBJavaFinalCertification.Java.Core.Models.pet.Cat;
import GBJavaFinalCertification.Java.Core.Models.pet.Dog;
import GBJavaFinalCertification.Java.Core.Models.pet.Hamster;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CheckFileExists {
    public static void Check() {
        File KennelHamsterFile = new File(Model.getPathDBHamster());
        if (KennelHamsterFile.exists() == false ||
                isEmptyFile(Model.getPathDBHamster()) ||
                KennelHamsterFile.length() == 2) {
            List<Hamster> newHamster = new ArrayList<>();
            newHamster.add(new Hamster());
            WriteJsonFile.Write(newHamster, Model.getPathDBHamster());
        }
        File KennelCatFile = new File(Model.getPathDBCat());
        if (KennelCatFile.exists() == false ||
                isEmptyFile(Model.getPathDBCat()) ||
                KennelCatFile.length() == 2) {
            List<Cat> newCat = new ArrayList<>();
            newCat.add(new Cat());
            WriteJsonFile.Write(newCat, Model.getPathDBCat());
        }
        File KennelDogFile = new File(Model.getPathDBDog());
        if (KennelDogFile.exists() == false ||
                isEmptyFile(Model.getPathDBDog()) ||
                KennelDogFile.length() == 2) {
            List<Dog> newDog = new ArrayList<>();
            newDog.add(new Dog());
            WriteJsonFile.Write(newDog, Model.getPathDBDog());
        }
        File KennelHorseFile = new File(Model.getPathDBHorse());
        if (KennelHorseFile.exists() == false ||
                isEmptyFile(Model.getPathDBHorse()) ||
                KennelHorseFile.length() == 2) {
            List<Horse> newHorse = new ArrayList<>();
            newHorse.add(new Horse());
            WriteJsonFile.Write(newHorse, Model.getPathDBHorse());
        }
        File KennelCamelFile = new File(Model.getPathDBCamel());
        if (KennelCamelFile.exists() == false ||
                isEmptyFile(Model.getPathDBCamel()) ||
                KennelCamelFile.length() == 2) {
            List<Camel> newCamel = new ArrayList<>();
            newCamel.add(new Camel());
            WriteJsonFile.Write(newCamel, Model.getPathDBCamel());
        }
        File KennelDonkeyFile = new File(Model.getPathDBDonkey());
        if (KennelDonkeyFile.exists() == false ||
                isEmptyFile(Model.getPathDBDonkey()) ||
                KennelDonkeyFile.length() == 2) {
            List<Donkey> newDonkey = new ArrayList<>();
            newDonkey.add(new Donkey());
            WriteJsonFile.Write(newDonkey, Model.getPathDBDonkey());
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
