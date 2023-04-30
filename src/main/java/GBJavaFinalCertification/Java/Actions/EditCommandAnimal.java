package GBJavaFinalCertification.Java.Actions;

import GBJavaFinalCertification.Java.Core.Models.Animal;

import java.util.ArrayList;
import java.util.List;

public class EditCommandAnimal {
    public static List Edit(List<Animal> Animals, String nameJcommand, String id) {

        List<Animal> newAnimals = new ArrayList<>();
        for (Animal el : Animals) {
            if (el.getId() == Integer.parseInt(id)) {
                el.setCommand(nameJcommand);
                newAnimals.add(el);
            } else {
                newAnimals.add(el);
            }
        }
        return newAnimals;
    }
}
