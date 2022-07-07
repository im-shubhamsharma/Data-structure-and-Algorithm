import java.util.*;

public class getMazePathWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> ans = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        if (sr > dr && sc > dc) {
            ArrayList<String> base = new ArrayList<String>();
            return base;
        }

        ArrayList<String> path = new ArrayList<String>();
        // horizontal
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpath = getMazePaths(sr, sc + ms, dr, dc);
            for (String p : hpath) {
                path.add("h" + ms + p);
            }
        }
        // vertical
        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpath = getMazePaths(sr + ms, sc, dr, dc);
            for (String p : vpath) {
                path.add("v" + ms + p);
            }
        }
        // diagonal
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            ArrayList<String> dpath = getMazePaths(sr + ms, sc + ms, dr, dc);
            for (String p : dpath) {
                path.add("d" + ms + p);
            }
        }
        return path;
    }

}
