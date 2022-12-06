package GBJavaOOP.Seminar4;

import java.util.LinkedList;
import java.util.Queue;

public class WaveAlgorithm extends Labyrinth {
    Queue<String> queueA = new LinkedList<>();
    int x;
    int y;

    public void Wave() {
        this.x = super.startPointX;
        this.y = super.startPointY;
        queueA.add("" + x + " " + y);
        while (!queueA.isEmpty()) {
            String[] coordinate = queueA.element().split(" ");
            x = Integer.parseInt(coordinate[0]);
            y = Integer.parseInt(coordinate[1]);
            int check = Integer.parseInt(labyrinth[x][y]);
            if (y + 1 < labyrinth.length && labyrinth[x][y + 1].equals("+")) {
                labyrinth[x][y + 1] = "" + (check + 1);
                queueA.add("" + x + " " + (y + 1));
            }
            if (x + 1 < labyrinth.length && labyrinth[x + 1][y].equals("+")) {
                labyrinth[x + 1][y] = "" + (check + 1);
                queueA.add("" + (x + 1) + " " + y);
            }
            if (y - 1 >= 0 && labyrinth[x][y - 1].equals("+")) {
                labyrinth[x][y - 1] = "" + (check + 1);
                queueA.add("" + x + " " + (y - 1));
            }
            if (x - 1 >= 0 && labyrinth[x - 1][y].equals("+")) {
                labyrinth[x - 1][y] = "" + (check + 1);
                queueA.add("" + (x - 1) + " " + y);
            }
            queueA.remove();
        }

        this.x = super.exitPointX;
        this.y = super.exitPointY;
        while (!labyrinth[x][y].equals("0")) {
            int check = Integer.parseInt(labyrinth[x][y]) - 1;
            labyrinth[x][y] = "$";
            if (y + 1 < labyrinth.length && labyrinth[x][y + 1].equals("" + check)) {
                y++;
            }
            if (x + 1 < labyrinth.length && labyrinth[x + 1][y].equals("" + check)) {
                x++;
            }
            if (y - 1 >= 0 && labyrinth[x][y - 1].equals("" + check)) {
                y--;
            }
            if (x - 1 >= 0 && labyrinth[x - 1][y].equals("" + check)) {
                x--;
            }
        }
        if (labyrinth[x][y].equals("0")) {
            labyrinth[x][y] = "$";
        }

    }
}
