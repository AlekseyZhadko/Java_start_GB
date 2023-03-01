package GBJavaAttestation.UI;

import GBJavaAttestation.Actions.CheckFileExists;
import GBJavaAttestation.Core.Models.Toy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EditToyFrame implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JFrame FrameEditToy = new JFrame("Toy Store - edit toy");

        FrameEditToy.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel idLabel;
        idLabel = new JLabel("Identificator: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0.5;
        FrameEditToy.add(idLabel, constraints);

        JTextField idJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 20;
        constraints.gridx = 1;
        constraints.gridy = 0;
        FrameEditToy.add(idJText, constraints);

        JButton FindButton = new JButton("Find");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 1;
        FrameEditToy.add(FindButton, constraints);

        JLabel nameLabel;
        nameLabel = new JLabel("Name: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.weightx = 0.5;
        FrameEditToy.add(nameLabel, constraints);

        JTextField nameJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 20;
        constraints.gridx = 1;
        constraints.gridy = 2;
        FrameEditToy.add(nameJText, constraints);

        JLabel countLabel;
        countLabel = new JLabel("Count: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 3;
        FrameEditToy.add(countLabel, constraints);

        JTextField countJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 20;
        constraints.gridx = 1;
        constraints.gridy = 3;
        FrameEditToy.add(countJText, constraints);

        JButton SaveButton = new JButton("Save");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.PAGE_END;
        constraints.gridx = 0;
        constraints.gridy = 4;
        FrameEditToy.add(SaveButton, constraints);
        SaveButton.setEnabled(false);

        JButton ExitButton = new JButton("Exit");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.PAGE_END;
        constraints.gridx = 1;
        constraints.gridy = 4;
        FrameEditToy.add(ExitButton, constraints);

        FrameEditToy.setSize(350, 250);
        FrameEditToy.setVisible(true);
        FrameEditToy.setLocationRelativeTo(null);

        CheckFileExists.Check();

        ExitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrameEditToy.dispose();
            }
        });

        FindButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = 0;
                try {
                    id = Integer.parseInt(idJText.getText());
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(FrameEditToy, "invalid value!");
                }

                try {
                    Gson gson = new Gson();
                    Reader reader = Files.newBufferedReader(Paths.get("src/main/java/GBJavaAttestation/DataBase/StoreToy.json"));
                    List<Toy> toys = Arrays.asList(gson.fromJson(reader, Toy[].class));
                    reader.close();

                    if (toys.isEmpty()) {
                        JOptionPane.showMessageDialog(FrameEditToy, "The file with toys is empty!");
                    } else {
                        int flag = 0;
                        for (Toy el : toys) {
                            if (el.getId() == id) {
                                nameJText.setText(el.getName());
                                countJText.setText(Integer.toString(el.getCount()));
                                SaveButton.setEnabled(true);
                                flag = 1;
                                idJText.setEnabled(false);
                            }
                        }
                        if (flag == 0) {
                            JOptionPane.showMessageDialog(FrameEditToy, "the ID does not exist!");
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                try {
                    x = Integer.parseInt(countJText.getText());
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(FrameEditToy, "invalid value!");
                }

                try {
                    Gson gson = new Gson();
                    Reader reader = Files.newBufferedReader(Paths.get("src/main/java/GBJavaAttestation/DataBase/StoreToy.json"));
                    List<Toy> toys = Arrays.asList(gson.fromJson(reader, Toy[].class));
                    reader.close();

                    int allCount = 0;
                    for (Toy el : toys) {
                        if (el.getId() == Integer.parseInt(idJText.getText())) {
                            allCount += x;
                        } else {
                            allCount += el.getCount();
                        }
                    }


                    List<Toy> newToys = new ArrayList<>();
                    for (Toy el : toys) {
                        if (el.getId() == Integer.parseInt(idJText.getText())) {
                            el.setWeight(x * 100 / allCount);
                            el.setName(nameJText.getText());
                            el.setCount(x);
                            newToys.add(el);
                        } else {
                            el.setWeight(el.getCount() * 100 / allCount);
                            newToys.add(el);
                        }
                    }

                    Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
                    Writer writer = Files.newBufferedWriter(Paths.get("src/main/java/GBJavaAttestation/DataBase/StoreToy.json"));
                    gsonBuilder.toJson(newToys, writer);
                    writer.close();
                    idJText.setEnabled(true);
                    JOptionPane.showMessageDialog(FrameEditToy, "data saved successfully!");

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
