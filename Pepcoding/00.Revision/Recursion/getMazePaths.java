import java.util.*;

public class getMazePaths {

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
        if (sr > dr || sc > dc) {
            ArrayList<String> base = new ArrayList<String>();
            return base;
        }
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        ArrayList<String> hpath = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList<String> vpath = getMazePaths(sr + 1, sc, dr, dc);

        ArrayList<String> path = new ArrayList<String>();

        for (String p : hpath) {
            path.add('h' + p);
        }

        for (String p : vpath) {
            path.add('v' + p);
        }

        return path;

    }

}
