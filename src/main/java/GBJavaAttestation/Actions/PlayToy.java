package GBJavaAttestation.Actions;

import GBJavaAttestation.Core.Models.Toy;
import GBJavaAttestation.Core.Models.Win;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static GBJavaAttestation.UI.MainStoreToyFrame.FrameToyStore;

public class PlayToy implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("src/main/java/GBJavaAttestation/DataBase/StoreToy.json"));
            List<Toy> toys = Arrays.asList(gson.fromJson(reader, Toy[].class));
            reader.close();

            Gson gsonWin = new Gson();
            Reader readerToyWin = Files.newBufferedReader(Paths.get("src/main/java/GBJavaAttestation/DataBase/WinToy.json"));
            List<Win> winToys = Arrays.asList(gsonWin.fromJson(readerToyWin, Win[].class));
            readerToyWin.close();

            if (toys.isEmpty()) {
                JOptionPane.showMessageDialog(FrameToyStore, "Toys are over!");
            } else {
                int allCount = 0;
                for (Toy el : toys) {
                    allCount += el.getCount();
                }

                int win = ThreadLocalRandom.current().nextInt(1, allCount + 1);
                System.out.println(win);
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

                            Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
                            Writer writer = Files.newBufferedWriter(Paths.get("src/main/java/GBJavaAttestation/DataBase/WinToy.json"));
                            gsonBuilder.toJson(newWinToys, writer);
                            writer.close();
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
            Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
            Writer writer = Files.newBufferedWriter(Paths.get("src/main/java/GBJavaAttestation/DataBase/StoreToy.json"));
            gsonBuilder.toJson(newToys, writer);
            writer.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
