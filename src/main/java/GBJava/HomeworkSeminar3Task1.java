package GBJava;

import java.util.ArrayList;
import java.util.List;

/**
 * Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз. N подается
 * на входе. В каждую ячейку пишем номер шага, которым туда зашли. ** **
 **/

public class HomeworkSeminar3Task1 {
    static int[][] board;
    static List<List<String>> ans = new ArrayList<>();
    static int[][] moves = new int[][]{{1, 2}, {-1, 2}, {1, -2}, {-1, -2}, {2, 1}, {-2, 1}, {2, -1}, {-2, -1}};

    public static void main(String[] args) {
        solveNHorse(5);
        int i = 1;
        for (List<String> res : ans) {
            System.out.println("Вариант решения " + i++ + ":");
            for (String result : res) {
                System.out.println(result);
            }
        }
    }

    public static List<List<String>> solveNHorse(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board = new int[n][n];
                backtrack(i, j, 1);
            }
        }
        return ans;
    }


    private static void backtrack(int col, int row, int step) {
        if (step == board.length * board.length) {
            board[col][row] = step;
            addBoard();
            return;
        }
        board[col][row] = step;
        for (int move[] : moves) {
            int newCol = col + move[0];
            int newRow = row + move[1];
            if (canPlace(newCol, newRow)) {
                step++;
                backtrack(newCol, newRow, step);
                board[newCol][newRow] = 0;
                step--;
            }
        }
    }

    private static boolean canPlace(int i, int j) {
        if (i >= 0 && j >= 0 && i < board.length && j < board.length && board[i][j] == 0) {
            return true;
        }
        return false;
    }

    private static void addBoard() {
        List<String> b = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                sb.append(Integer.toString(board[i][j]) + ' ');
            }
            b.add(sb.toString());
        }
        ans.add(b);
    }
}



