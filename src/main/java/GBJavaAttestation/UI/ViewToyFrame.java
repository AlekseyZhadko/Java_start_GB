package GBJavaAttestation.UI;

import GBJavaAttestation.Actions.CheckFileExists;
import GBJavaAttestation.Actions.ReadJsonStoreToy;
import GBJavaAttestation.Core.MVP.Model;
import GBJavaAttestation.Core.Models.Toy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ViewToyFrame implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JFrame FrameViewToy = new JFrame("Toy Store - view toy");
        FrameViewToy.setSize(350, 250);
        FrameViewToy.setLayout(null);
        FrameViewToy.setVisible(true);
        FrameViewToy.setLocationRelativeTo(null);

        CheckFileExists.Check();

        List<Toy> toys = ReadJsonStoreToy.Read(Model.getPathDBStoreToy());
        DefaultListModel<Toy> l = new DefaultListModel<>();
        for (Toy element : toys) {
            l.addElement(element);
        }

        JList<Toy> toyJList = new JList<>(l);
        toyJList.setBounds(0, 0, 350, 250);
        FrameViewToy.add(toyJList);
    }
}