package GBJavaAttestation.UI;

import GBJavaAttestation.Actions.CheckFileExists;
import GBJavaAttestation.Actions.ReadJsonWinToy;
import GBJavaAttestation.Core.MVP.Model;
import GBJavaAttestation.Core.Models.Win;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ViewWinToysFrame implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JFrame FrameViewWinToys = new JFrame("Toy Store - view wins toy");
        FrameViewWinToys.setSize(350, 250);
        FrameViewWinToys.setLayout(null);
        FrameViewWinToys.setVisible(true);
        FrameViewWinToys.setLocationRelativeTo(null);

        CheckFileExists.Check();

        List<Win> WinToys = ReadJsonWinToy.Read(Model.getPathDBWinToy());
        DefaultListModel<Win> l = new DefaultListModel<>();
        for (Win element : WinToys) {
            l.addElement(element);
        }

        JList<Win> toyJList = new JList<>(l);
        toyJList.setBounds(0, 0, 350, 250);
        FrameViewWinToys.add(toyJList);
    }
}