package GBJavaAttestation.Actions;

import GBJavaAttestation.Core.Models.Toy;

import java.util.ArrayList;
import java.util.List;

public class DeleteToy {
    public static List Delete(List<Toy> toys, String id) {
        int allCount = 0;
        for (Toy el : toys) {
            if (el.getId() != Integer.parseInt(id)) {
                allCount += el.getCount();
            }
        }

        List<Toy> newToys = new ArrayList<>();
        for (Toy el : toys) {
            if (el.getId() != Integer.parseInt(id)) {
                el.setWeight(el.getCount() * 100 / allCount);
                newToys.add(el);
            }
        }
        return newToys;

    }
}