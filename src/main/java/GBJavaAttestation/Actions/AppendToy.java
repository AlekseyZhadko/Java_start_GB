package GBJavaAttestation.Actions;

import GBJavaAttestation.Core.Models.Toy;

import java.util.ArrayList;
import java.util.List;

public class AppendToy {
    public static List Append(List<Toy> toys, String nameJText, int x) {
        if (toys.get(toys.size() - 1).getId() == 0) {
            toys.get(toys.size() - 1).setId(1);
            toys.get(toys.size() - 1).setName(nameJText);
            toys.get(toys.size() - 1).setCount(x);
            toys.get(toys.size() - 1).setWeight(100 / x);
            return toys;
        } else {

            int idToy = toys.get(toys.size() - 1).getId() + 1;

            int allCount = 0;
            for (Toy el : toys) {
                allCount += el.getCount();
            }
            allCount += x;

            List<Toy> newToys = new ArrayList<>();
            for (Toy el : toys) {
                el.setWeight(el.getCount() * 100 / allCount);
                newToys.add(el);
            }
            newToys.add(new Toy(idToy, nameJText, x, x * 100 / allCount));
            return newToys;
        }
    }
}

