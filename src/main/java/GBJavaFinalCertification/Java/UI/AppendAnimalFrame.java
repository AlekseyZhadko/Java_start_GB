package GBJavaFinalCertification.Java.UI;

import GBJavaFinalCertification.Java.Actions.*;
import GBJavaFinalCertification.Java.Core.MVP.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppendAnimalFrame implements ActionListener {
    public static JFrame AppendAnimalFrame = new JFrame("Kennel - Geek brains");
    @Override
    public void actionPerformed(ActionEvent e) {
        AppendAnimalFrame.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel kindLabel;
        kindLabel = new JLabel("Kind of animal: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0.5;
        AppendAnimalFrame.add(kindLabel, constraints);

        JTextField kindJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 20;
        constraints.gridx = 1;
        constraints.gridy = 0;
        AppendAnimalFrame.add(kindJText, constraints);

        JLabel nameLabel;
        nameLabel = new JLabel("Name: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.weightx = 0.5;
        AppendAnimalFrame.add(nameLabel, constraints);

        JTextField nameJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 1;
        AppendAnimalFrame.add(nameJText, constraints);

        JLabel birthdayLabel;
        birthdayLabel = new JLabel("Date of birthday: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 2;
        AppendAnimalFrame.add(birthdayLabel, constraints);

        JTextField birthdayJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 2;
        AppendAnimalFrame.add(birthdayJText, constraints);

        JLabel commandLabel;
        commandLabel = new JLabel("Command: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 3;
        AppendAnimalFrame.add(commandLabel, constraints);

        JTextField commandJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 1;
        constraints.gridy = 3;
        AppendAnimalFrame.add(commandJText, constraints);

        JButton SaveButton = new JButton("Save");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.PAGE_END;
        constraints.gridx = 0;
        constraints.gridy = 4;
        AppendAnimalFrame.add(SaveButton, constraints);

        JButton ExitButton = new JButton("Exit");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.PAGE_END;
        constraints.gridx = 1;
        constraints.gridy = 4;
        AppendAnimalFrame.add(ExitButton, constraints);

        AppendAnimalFrame.setSize(350, 250);
        AppendAnimalFrame.setVisible(true);
        AppendAnimalFrame.setLocationRelativeTo(null);

        CheckFileExists.Check();

        ExitButton.addActionListener(e13 -> AppendAnimalFrame.dispose());

        SaveButton.addActionListener(e12 -> {
            try {
                String kind = kindJText.getText().toLowerCase();
                if (kind.equals("hamster") || kind.equals("cat") || kind.equals("dog")) {
                    if (kind.equals("hamster")) {
                        WriteJsonFile.Write(AppendAnimal.Append(ReadJsonHamster.Read(Model.getPathDBHamster())
                            , nameJText.getText(), birthdayJText.getText(),
                            commandJText.getText()), Model.getPathDBHamster());
                    } else if (kind.equals("cat")) {
                        WriteJsonFile.Write(AppendAnimal.Append(ReadJsonCat.Read(Model.getPathDBCat())
                                , nameJText.getText(), birthdayJText.getText(),
                                commandJText.getText()), Model.getPathDBCat());
                    } else if (kind.equals("dog")) {
                        WriteJsonFile.Write(AppendAnimal.Append(ReadJsonDog.Read(Model.getPathDBDog())
                                , nameJText.getText(), birthdayJText.getText(),
                                commandJText.getText()), Model.getPathDBDog());
                    }
                    JOptionPane.showMessageDialog(AppendAnimalFrame, "data saved successfully!");
                } else if (kind.equals("horse") || kind.equals("camel") || kind.equals("donkey")) {
                    if (kind.equals("horse")) {
                        WriteJsonFile.Write(AppendAnimal.Append(ReadJsonHorse.Read(Model.getPathDBHorse())
                                , nameJText.getText(), birthdayJText.getText(),
                                commandJText.getText()), Model.getPathDBHorse());
                    } else if (kind.equals("camel")) {
                        WriteJsonFile.Write(AppendAnimal.Append(ReadJsonCamel.Read(Model.getPathDBCamel())
                                , nameJText.getText(), birthdayJText.getText(),
                                commandJText.getText()), Model.getPathDBCamel());
                    } else if (kind.equals("donkey")) {
                        WriteJsonFile.Write(AppendAnimal.Append(ReadJsonDonkey.Read(Model.getPathDBDonkey())
                                , nameJText.getText(), birthdayJText.getText(),
                                commandJText.getText()), Model.getPathDBDonkey());
                    }
                    JOptionPane.showMessageDialog(AppendAnimalFrame, "data saved successfully!");
                } else{
                    JOptionPane.showMessageDialog(AppendAnimalFrame, "invalid value!");
                }
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(AppendAnimalFrame, "invalid value!");
            }
        });
    }
}
