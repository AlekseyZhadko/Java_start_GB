package GBJavaAttestation.UI;

import GBJavaAttestation.Actions.DeleteToy;
import GBJavaAttestation.Actions.ReadJsonStoreToy;
import GBJavaAttestation.Actions.WriteJsonFile;
import GBJavaAttestation.Core.MVP.Model;
import GBJavaAttestation.Core.Models.Toy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

        ExitButton.addActionListener(e12 -> FrameDeleteToy.dispose());

        FindButton.addActionListener(e13 -> {
            int id = 0;
            try {
                id = Integer.parseInt(idJText.getText());
                List<Toy> toys = ReadJsonStoreToy.Read(Model.getPathDBStoreToy());
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
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(FrameDeleteToy, "invalid value!");
            }
        });


        DeleteButton.addActionListener(e14 -> {
            WriteJsonFile.Write(DeleteToy.Delete(ReadJsonStoreToy.Read(Model.getPathDBStoreToy())
                    , idJText.getText()), Model.getPathDBStoreToy());
            idJText.setEnabled(true);
            DeleteButton.setEnabled(false);
            JOptionPane.showMessageDialog(FrameDeleteToy, "data saved successfully!");
        });
    }
}
