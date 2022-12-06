package GBJavaOOP.Seminar4;
import java.util.Scanner;

public class Labyrinth extends Game{
    protected static String[][] labyrinth;
    protected int startPointX;
    protected int startPointY;
    protected int exitPointX;
    protected int exitPointY;

    public static void createLabyrinth() {
        labyrinth = new String[10][10];
        for (int i = 0; i < labyrinth.length; i++) {
            for (int j = 0; j < labyrinth.length; j++) {
                labyrinth[i][j] = "+";
            }
        }
        addWall();
    }

    private static void addWall() {
        labyrinth[1][1] = "#";
        labyrinth[1][2] = "#";
        labyrinth[1][3] = "#";
        labyrinth[1][6] = "#";
        labyrinth[2][6] = "#";
        labyrinth[3][6] = "#";
        labyrinth[4][6] = "#";
        labyrinth[5][6] = "#";
        labyrinth[0][8] = "#";
        labyrinth[1][8] = "#";
        labyrinth[2][8] = "#";
        labyrinth[7][7] = "#";
        labyrinth[7][8] = "#";
        labyrinth[7][9] = "#";
        labyrinth[4][1] = "#";
        labyrinth[5][1] = "#";
        labyrinth[6][1] = "#";
        labyrinth[7][1] = "#";
        labyrinth[8][1] = "#";
        labyrinth[8][2] = "#";
        labyrinth[8][3] = "#";
        labyrinth[8][4] = "#";
    }

    public void startPoint() {
        System.out.println((char) 27 + "[32mВведите начальную координату. Например: (4;4) " + (char) 27 + "[0m");
        Scanner in = new Scanner(System.in);
        System.out.print("Координата X: ");
        this.startPointX = in.nextInt();
        System.out.print("Координата Y: ");
        this.startPointY = in.nextInt();
        if (labyrinth[startPointX][startPointY].equals("#")){
            System.out.println((char) 27 + "[31mДанная координата занята или не существует!" + (char) 27 + "[0m");
            startPoint();
        } else {
            labyrinth[startPointX][startPointY] = "0";
        }
    }

    @Override
    public String toString() {
        System.out.println((char) 27 + "[33m№ X 0  1  2  3  4  5  6  7  8  9" + (char) 27 + "[0m");
        System.out.println((char) 27 + "[33mY |-----------------------------" + (char) 27 + "[0m");
        for (int i = 0; i < labyrinth.length; i++) {
            System.out.printf((char) 27 + "[33m%s |" + (char) 27 + "[0m", i);
            for (int j = 0; j < labyrinth.length; j++) {
                if (labyrinth[i][j].equals("#")) {
                    System.out.printf((char) 27 + "[31m # " + (char) 27 + "[0m");
                } else if (labyrinth[i][j].equals("$")) {
                    System.out.printf((char) 27 + "[32m $ " + (char) 27 + "[0m");
                } else {
                    System.out.printf(" " + labyrinth[i][j] + " ");
                }
            }
            System.out.println();
        }
        return "";
    }

    public void exitPoint() {
        System.out.println((char) 27 + "[32mВведите конечную координату. Например: (8;8) " + (char) 27 + "[0m");
        Scanner in = new Scanner(System.in);
        System.out.print("Координата X: ");
        exitPointX = in.nextInt();
        System.out.print("Координата Y: ");
        exitPointY = in.nextInt();
        if (labyrinth[exitPointX][exitPointY].equals("#")){
            System.out.println((char) 27 + "[31mДанная координата занята или не существует!" + (char) 27 + "[0m");
            exitPoint();
        } else {
            System.out.println((char) 27 + "[32mРешение:" + (char) 27 + "[0m");
        }
    }
}
