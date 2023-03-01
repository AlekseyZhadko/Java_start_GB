package GBJavaAttestation.UI;

import GBJavaAttestation.Actions.AppendToy;
import GBJavaAttestation.Actions.CheckFileExists;
import GBJavaAttestation.Actions.ReadJsonStoreToy;
import GBJavaAttestation.Actions.WriteJsonFile;
import GBJavaAttestation.Core.MVP.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppendStoreToyFrame implements ActionListener {
    public static JFrame FrameAppendToy = new JFrame("Toy Store - append toy");

    public void actionPerformed(ActionEvent e) {

        FrameAppendToy.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel nameLabel;
        nameLabel = new JLabel("Name: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 0.5;
        FrameAppendToy.add(nameLabel, constraints);

        JTextField nameJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 20;
        constraints.gridx = 1;
        constraints.gridy = 0;
        FrameAppendToy.add(nameJText, constraints);

        JLabel countLabel;
        countLabel = new JLabel("Count: ");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 1;
        FrameAppendToy.add(countLabel, constraints);

        JTextField countJText = new JTextField();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 20;
        constraints.gridx = 1;
        constraints.gridy = 1;
        FrameAppendToy.add(countJText, constraints);

        JButton SaveButton = new JButton("Save");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.PAGE_END;
        constraints.gridx = 0;
        constraints.gridy = 2;
        FrameAppendToy.add(SaveButton, constraints);

        JButton ExitButton = new JButton("Exit");
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.PAGE_END;
        constraints.gridx = 1;
        constraints.gridy = 2;
        FrameAppendToy.add(ExitButton, constraints);

        FrameAppendToy.setSize(350, 150);
        FrameAppendToy.setVisible(true);
        FrameAppendToy.setLocationRelativeTo(null);

        CheckFileExists.Check();

        ExitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrameAppendToy.dispose();
            }
        });

        SaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int x = Integer.parseInt(countJText.getText());

                    if (x < 0 || nameJText.getText().equals("")) {
                        JOptionPane.showMessageDialog(FrameAppendToy, "invalid value!");
                    } else {
                        WriteJsonFile.Write(AppendToy.Append(ReadJsonStoreToy.Read(Model.getPathDBStoreToy())
                                , nameJText.getText(), x), Model.getPathDBStoreToy());
                        JOptionPane.showMessageDialog(FrameAppendToy, "data saved successfully!");
                    }
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(FrameAppendToy, "invalid value!");
                }
            }
        });
    }
}
