package GBJavaFinalCertification.Java.UI;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainKennelFrame {
    public static JFrame FrameKennel = new JFrame("Kennel - Geek brains");

    public static void MainFrame() {
        FrameKennel.setSize(400, 200);

        JLabel DrawingLabel;
        DrawingLabel = new JLabel("1. List of kennel animals");
        DrawingLabel.setBounds(20, 10, 200, 20);
        FrameKennel.add(DrawingLabel);

        JLabel DrawingLabel2;
        DrawingLabel2 = new JLabel("2. List of kennel pets");
        DrawingLabel2.setBounds(20, 30, 200, 20);
        FrameKennel.add(DrawingLabel2);

        JLabel DrawingLabel3;
        DrawingLabel3 = new JLabel("3. List of kennel pack animals");
        DrawingLabel3.setBounds(20, 50, 200, 20);
        FrameKennel.add(DrawingLabel3);

        JButton AppendAnimal = new JButton("Append animal");
        AppendAnimal.setBounds(20, 90, 170, 25);
        ActionListener AppendAnimalListener = new AppendAnimalFrame();
        AppendAnimal.addActionListener(AppendAnimalListener);
        FrameKennel.add(AppendAnimal);

        JButton ViewCommand = new JButton("View command animal");
        ViewCommand.setBounds(195, 90, 170, 25);
        ActionListener ViewCommandListener = new ViewCommandFrame();
        ViewCommand.addActionListener(ViewCommandListener);
        FrameKennel.add(ViewCommand);

        JButton AppendCommand = new JButton("Append command animal");
        AppendCommand.setBounds(20, 130, 170, 25);
        ActionListener AppendCommandListener = new AppendCommandFrame();
        AppendCommand.addActionListener(AppendCommandListener);
        FrameKennel.add(AppendCommand);

        JButton ExitButton = new JButton("Exit");
        ExitButton.setBounds(195, 130, 170, 25);
        ExitButton.addActionListener((event) -> System.exit(0));
        FrameKennel.add(ExitButton);

        FrameKennel.setLayout(null);
        FrameKennel.setVisible(true);
        FrameKennel.setLocationRelativeTo(null);

        FrameKennel.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        FrameKennel.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
