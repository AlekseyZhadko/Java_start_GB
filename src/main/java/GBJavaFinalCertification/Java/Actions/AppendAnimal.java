package GBJavaFinalCertification.Java.Actions;

import GBJavaFinalCertification.Java.Core.Models.Animal;
import GBJavaFinalCertification.Java.Core.Models.pet.Cat;

import java.util.ArrayList;
import java.util.List;

public class AppendAnimal {
    public static List Append(List<Animal> animals, String nameJText,
                              String birthdayJText, String commandJText) {
        if (animals.get(animals.size() - 1).getId() == 0) {
            animals.get(animals.size() - 1).setId(1);
            animals.get(animals.size() - 1).setNameAnimal(nameJText);
            animals.get(animals.size() - 1).setDateOfBirth(birthdayJText);
            animals.get(animals.size() - 1).setCommand(commandJText);
            return animals;
        } else {

            int idAnimal = animals.get(animals.size() - 1).getId() + 1;

            List<Animal> newAnimals = new ArrayList<>();
            for (Animal el : animals) {
                newAnimals.add(el);
            }
            newAnimals.add(new Cat(idAnimal, nameJText, birthdayJText, nameJText));
            return newAnimals;
        }
    }
}
