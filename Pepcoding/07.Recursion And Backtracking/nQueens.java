import java.util.*;

public class nQueens {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNQueens(new int[n][n], "", 0);
    }

    public static void printNQueens(int[][] chess, String asf, int row) {
        if (row == chess.length) {
            System.out.println(asf + ".");
            return;
        }

        for (int col = 0; col < chess[0].length; col++) {
            if (isSafe(chess, row, col)) {
                chess[row][col] = 1;
                printNQueens(chess, asf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }

        return;
    }

    public static boolean isSafe(int[][] chess, int row, int col) {
        // 1st diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] != 0) {
                return false;
            }
        }
        // vertical
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (chess[i][j] != 0) {
                return false;
            }
        }
        // 2nd diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess[0].length; i--, j++) {
            if (chess[i][j] != 0) {
                return false;
            }
        }

        return true;
    }
}
