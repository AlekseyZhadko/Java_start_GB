package GBJavaAttestation.Actions;

import GBJavaAttestation.Core.MVP.Model;
import GBJavaAttestation.Core.Models.Toy;
import GBJavaAttestation.Core.Models.Win;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static GBJavaAttestation.UI.MainStoreToyFrame.FrameToyStore;

public class PlayToy implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        CheckFileExists.Check();

        List<Toy> toys = ReadJsonStoreToy.Read(Model.getPathDBStoreToy());
        List<Win> winToys = ReadJsonWinToy.Read(Model.getPathDBWinToy());

        if (toys.get(toys.size() - 1).getId() == 0) {
            JOptionPane.showMessageDialog(FrameToyStore, "Toys are over!");
        } else {
            int allCount = 0;
            for (Toy el : toys) {
                allCount += el.getCount();
            }

            int win = ThreadLocalRandom.current().nextInt(1, allCount + 1);
            int flag = 0;
            for (Toy el : toys) {
                if ((win > flag) && (win <= flag + el.getCount())) {
                    if (el.getCount() > 1) {
                        el.setCount(el.getCount() - 1);
                        List<Win> newWinToys = new ArrayList<>();
                        for (Win elem : winToys) {
                            newWinToys.add(elem);
                        }
                        Date date = new Date();
                        newWinToys.add(new Win(winToys.get(winToys.size() - 1).getId() + 1, el.getName(), date.toString()));
                        WriteJsonFile.Write(newWinToys, Model.getPathDBWinToy());
                    } else {

                    }
                    JOptionPane.showMessageDialog(FrameToyStore, "You win toy - " + el.getName() + "!");
                    break;
                }
                flag += el.getCount();
            }
        }
        List<Toy> newToys = new ArrayList<>();
        for (Toy el : toys) {
            newToys.add(el);
        }
        WriteJsonFile.Write(newToys, Model.getPathDBStoreToy());
    }
}
