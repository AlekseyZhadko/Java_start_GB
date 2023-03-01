package GBJavaAttestation.UI;

import GBJavaAttestation.Actions.PlayToy;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MainStoreToyFrame {
    public static JFrame FrameToyStore = new JFrame("Toy Store - Geek brains");
    public static void MainFrame() {
        FrameToyStore.setSize(350, 250);

        JLabel DrawingLabel;
        DrawingLabel = new JLabel("Drawing of a toy");
        DrawingLabel.setBounds(20, 10, 200, 20);
        FrameToyStore.add(DrawingLabel);

        JButton PlayButton = new JButton("Play");
        PlayButton.setBounds(20, 40, 90, 25);
        ActionListener PlayListener = new PlayToy();
        PlayButton.addActionListener(PlayListener);
        FrameToyStore.add(PlayButton);

        JButton ViewWinButton = new JButton("View win");
        ViewWinButton.setBounds(125, 40, 90, 25);
        ActionListener ViewWinListener = new ViewWinToysFrame();
        ViewWinButton.addActionListener(ViewWinListener);
        FrameToyStore.add(ViewWinButton);

        JLabel DBStoreToyLabel;
        DBStoreToyLabel = new JLabel("Toy Store database");
        DBStoreToyLabel.setBounds(20, 70, 200, 20);
        FrameToyStore.add(DBStoreToyLabel);

        JButton AppendToyButton = new JButton("Append");
        AppendToyButton.setBounds(20, 100, 90, 25);
        ActionListener AppendToyListener = new AppendStoreToyFrame();
        AppendToyButton.addActionListener(AppendToyListener);
        FrameToyStore.add(AppendToyButton);

        JButton EditToyButton = new JButton("Edit");
        EditToyButton.setBounds(125, 100, 90, 25);
        ActionListener EditToyListener = new EditToyFrame();
        EditToyButton.addActionListener(EditToyListener);
        FrameToyStore.add(EditToyButton);

        JButton DeleteToyButton = new JButton("Delete");
        DeleteToyButton.setBounds(225, 100, 90, 25);
        ActionListener DeleteToyListener = new DeleteToyFrame();
        DeleteToyButton.addActionListener(DeleteToyListener);
        FrameToyStore.add(DeleteToyButton);

        JButton ViewToyButton = new JButton("View Toy");
        ViewToyButton.setBounds(20, 150, 90, 25);
        ActionListener ViewToyListener = new ViewToyFrame();
        ViewToyButton.addActionListener(ViewToyListener);
        FrameToyStore.add(ViewToyButton);

        JButton ExitButton = new JButton("Exit");
        ExitButton.setBounds(225, 150, 90, 25);
        ExitButton.addActionListener((event) -> System.exit(0));
        FrameToyStore.add(ExitButton);

        FrameToyStore.setLayout(null);
        FrameToyStore.setVisible(true);
        FrameToyStore.setLocationRelativeTo(null);
    }
}
