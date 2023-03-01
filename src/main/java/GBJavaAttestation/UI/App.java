package GBJavaAttestation.UI;

import GBJavaAttestation.Actions.CheckFileExists;

public class App {

    public static void run() {
        CheckFileExists.Check();
        MainStoreToyFrame.MainFrame();
    }
}