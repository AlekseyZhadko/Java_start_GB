package GBJavaAttestation.UI;

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

public class DeleteToyFrame implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JFrame FrameDeleteToy = new JFrame("Toy Store - delete toy");

        FrameDeleteToy.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel idLabel;
        idLabel = new JLabel("Identificator: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0.5;
        FrameDeleteToy.add(idLabel, constraints);

        JTextField idJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 20;
        constraints.gridx = 1;
        constraints.gridy = 0;
        FrameDeleteToy.add(idJText, constraints);

        JButton FindButton = new JButton("Find");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 1;
        FrameDeleteToy.add(FindButton, constraints);

        JLabel nameLabel;
        nameLabel = new JLabel("Name: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.weightx = 0.5;
        FrameDeleteToy.add(nameLabel, constraints);

        JTextField nameJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 20;
        constraints.gridx = 1;
        constraints.gridy = 2;
        FrameDeleteToy.add(nameJText, constraints);
        nameJText.setEnabled(false);

        JLabel countLabel;
        countLabel = new JLabel("Count: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 3;
        FrameDeleteToy.add(countLabel, constraints);

        JTextField countJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 20;
        constraints.gridx = 1;
        constraints.gridy = 3;
        FrameDeleteToy.add(countJText, constraints);
        countJText.setEnabled(false);

        JButton DeleteButton = new JButton("Delete");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.PAGE_END;
        constraints.gridx = 0;
        constraints.gridy = 4;
        FrameDeleteToy.add(DeleteButton, constraints);
        DeleteButton.setEnabled(false);

        JButton ExitButton = new JButton("Exit");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.PAGE_END;
        constraints.gridx = 1;
        constraints.gridy = 4;
        FrameDeleteToy.add(ExitButton, constraints);

        FrameDeleteToy.setSize(350, 250);
        FrameDeleteToy.setVisible(true);
        FrameDeleteToy.setLocationRelativeTo(null);

        ExitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrameDeleteToy.dispose();
            }
        });

        FindButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = 0;
                try {
                    id = Integer.parseInt(idJText.getText());
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(FrameDeleteToy, "invalid value!");
                }

                try {
                    Gson gson = new Gson();
                    Reader reader = Files.newBufferedReader(Paths.get("src/main/java/GBJavaAttestation/DataBase/StoreToy.json"));
                    List<Toy> toys = Arrays.asList(gson.fromJson(reader, Toy[].class));
                    reader.close();

                    if (toys.isEmpty()) {
                        JOptionPane.showMessageDialog(FrameDeleteToy, "The file with toys is empty!");
                    } else {
                        int flag = 0;
                        for (Toy el : toys) {
                            if (el.getId() == id) {
                                nameJText.setText(el.getName());
                                countJText.setText(Integer.toString(el.getCount()));
                                DeleteButton.setEnabled(true);
                                flag = 1;
                            }
                        }
                        if (flag == 0) {
                            JOptionPane.showMessageDialog(FrameDeleteToy, "the ID does not exist!");
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });


        DeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Gson gson = new Gson();
                    Reader reader = Files.newBufferedReader(Paths.get("src/main/java/GBJavaAttestation/DataBase/StoreToy.json"));
                    List<Toy> toys = Arrays.asList(gson.fromJson(reader, Toy[].class));
                    reader.close();

                    int allCount = 0;
                    for (Toy el : toys) {
                        if (el.getId() != Integer.parseInt(idJText.getText())) {
                            allCount += el.getCount();
                        }
                    }

                    List<Toy> newToys = new ArrayList<>();
                    for (Toy el : toys) {
                        if (el.getId() != Integer.parseInt(idJText.getText())) {
                            el.setWeight(el.getCount() * 100 / allCount);
                            newToys.add(el);
                        }
                    }

                    Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
                    Writer writer = Files.newBufferedWriter(Paths.get("src/main/java/GBJavaAttestation/DataBase/StoreToy.json"));
                    gsonBuilder.toJson(newToys, writer);
                    writer.close();
                    idJText.setEnabled(true);
                    JOptionPane.showMessageDialog(FrameDeleteToy, "data saved successfully!");

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
