package GBJavaAttestation.Actions;

import GBJavaAttestation.Core.Models.Toy;

import java.util.ArrayList;
import java.util.List;

public class EditToy {
    public static List Edit(List<Toy> toys, String nameJText, int x, String id) {
        int allCount = 0;
        for (Toy el : toys) {
            if (el.getId() == Integer.parseInt(id)) {
                allCount += x;
            } else {
                allCount += el.getCount();
            }
        }

        List<Toy> newToys = new ArrayList<>();
        for (Toy el : toys) {
            if (el.getId() == Integer.parseInt(id)) {
                el.setWeight(x * 100 / allCount);
                el.setName(nameJText);
                el.setCount(x);
                newToys.add(el);
            } else {
                el.setWeight(el.getCount() * 100 / allCount);
                newToys.add(el);
            }
        }
        return newToys;
    }
}