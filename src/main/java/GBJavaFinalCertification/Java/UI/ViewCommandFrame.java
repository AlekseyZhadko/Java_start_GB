package GBJavaFinalCertification.Java.UI;

import GBJavaFinalCertification.Java.Actions.*;
import GBJavaFinalCertification.Java.Core.MVP.Model;
import GBJavaFinalCertification.Java.Core.Models.packAnimal.Camel;
import GBJavaFinalCertification.Java.Core.Models.packAnimal.Donkey;
import GBJavaFinalCertification.Java.Core.Models.packAnimal.Horse;
import GBJavaFinalCertification.Java.Core.Models.pet.Cat;
import GBJavaFinalCertification.Java.Core.Models.pet.Dog;
import GBJavaFinalCertification.Java.Core.Models.pet.Hamster;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ViewCommandFrame implements ActionListener {
    public static JFrame ViewCommandFrame = new JFrame("Kennel - Geek brains");
    @Override
    public void actionPerformed(ActionEvent e) {
        ViewCommandFrame.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel kindLabel;
        kindLabel = new JLabel("Kind of animal: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0.5;
        ViewCommandFrame.add(kindLabel, constraints);

        JTextField kindJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 20;
        constraints.gridx = 1;
        constraints.gridy = 0;
        ViewCommandFrame.add(kindJText, constraints);

        JLabel idLabel;
        idLabel = new JLabel("id: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.weightx = 0.5;
        ViewCommandFrame.add(idLabel, constraints);

        JTextField idJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 1;
        ViewCommandFrame.add(idJText, constraints);

        JLabel commandLabel;
        commandLabel = new JLabel("Command animal: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 2;
        ViewCommandFrame.add(commandLabel, constraints);

        JTextField commandJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 2;
        ViewCommandFrame.add(commandJText, constraints);


        JButton viewButton = new JButton("View");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.PAGE_END;
        constraints.gridx = 0;
        constraints.gridy = 3;
        ViewCommandFrame.add(viewButton, constraints);

        JButton ExitButton = new JButton("Exit");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.PAGE_END;
        constraints.gridx = 1;
        constraints.gridy = 3;
        ViewCommandFrame.add(ExitButton, constraints);

        ViewCommandFrame.setSize(350, 200);
        ViewCommandFrame.setVisible(true);
        ViewCommandFrame.setLocationRelativeTo(null);

        CheckFileExists.Check();

        ExitButton.addActionListener(e13 -> ViewCommandFrame.dispose());

        viewButton.addActionListener(e12 -> {
            int id = 0;
            try {
                String kind = kindJText.getText().toLowerCase();
                id = Integer.parseInt(idJText.getText());
                if (kind.equals("hamster") || kind.equals("cat") || kind.equals("dog")) {
                    if (kind.equals("hamster")) {
                        List<Hamster> Hamsters  = ReadJsonHamster.Read(Model.getPathDBHamster());
                        int flag = 0;
                        for (Hamster el : Hamsters) {
                            if (el.getId() == id) {
                                commandJText.setText(el.getCommand());
                                flag = 1;
                                commandJText.setEnabled(false);
                            }
                        }
                        if (flag == 0) {
                            JOptionPane.showMessageDialog(ViewCommandFrame, "the ID does not exist!");
                        }
                    } else if (kind.equals("cat")) {
                        List<Cat> Cats  = ReadJsonCat.Read(Model.getPathDBCat());
                        int flag = 0;
                        for (Cat el : Cats)
                            if (el.getId() == id) {
                                commandJText.setText(el.getCommand());
                                flag = 1;
                                commandJText.setEnabled(false);
                            }
                        if (flag == 0) {
                            JOptionPane.showMessageDialog(ViewCommandFrame, "the ID does not exist!");
                        }
                    } else if (kind.equals("dog")) {
                        List<Dog> Dogs  = ReadJsonDog.Read(Model.getPathDBDog());
                        int flag = 0;
                        for (Dog el : Dogs) {
                            if (el.getId() == id) {
                                commandJText.setText(el.getCommand());
                                flag = 1;
                                commandJText.setEnabled(false);
                            }
                        }
                        if (flag == 0) {
                            JOptionPane.showMessageDialog(ViewCommandFrame, "the ID does not exist!");
                        }
                    }
                } else if (kind.equals("horse") || kind.equals("camel") || kind.equals("donkey")) {
                    if (kind.equals("horse")) {
                        List<Horse> Horses  = ReadJsonHorse.Read(Model.getPathDBHorse());
                        int flag = 0;
                        for (Horse el : Horses) {
                            if (el.getId() == id) {
                                commandJText.setText(el.getCommand());
                                flag = 1;
                                commandJText.setEnabled(false);
                            }
                        }
                        if (flag == 0) {
                            JOptionPane.showMessageDialog(ViewCommandFrame, "the ID does not exist!");
                        }
                    } else if (kind.equals("camel")) {
                        List<Camel> Camels  = ReadJsonCamel.Read(Model.getPathDBCamel());
                        int flag = 0;
                        for (Camel el : Camels) {
                            if (el.getId() == id) {
                                commandJText.setText(el.getCommand());
                                flag = 1;
                                commandJText.setEnabled(false);
                            }
                        }
                        if (flag == 0) {
                            JOptionPane.showMessageDialog(ViewCommandFrame, "the ID does not exist!");
                        }
                    } else if (kind.equals("donkey")) {
                        List<Donkey> Donkeys  = ReadJsonDonkey.Read(Model.getPathDBDonkey());
                        int flag = 0;
                        for (Donkey el : Donkeys) {
                            if (el.getId() == id) {
                                commandJText.setText(el.getCommand());
                                flag = 1;
                                commandJText.setEnabled(false);
                            }
                        }
                        if (flag == 0) {
                            JOptionPane.showMessageDialog(ViewCommandFrame, "the ID does not exist!");
                        }
                    }
                } else{
                    JOptionPane.showMessageDialog(ViewCommandFrame, "invalid value!");
                }
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(ViewCommandFrame, "invalid value!");
            }
        });
    }
}
