import java.util.*;

public class printMazePath {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        printMazePaths(0, 0, n - 1, m - 1, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }
        if (sr > dr || sc > dc) {
            return;
        }

        // horizontal
        printMazePaths(sr, sc + 1, dr, dc, psf + "h");
        // vertical
        printMazePaths(sr + 1, sc, dr, dc, psf + "v");

    }

}
