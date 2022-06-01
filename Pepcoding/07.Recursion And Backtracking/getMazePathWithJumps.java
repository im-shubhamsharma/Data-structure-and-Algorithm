import java.util.*;

public class getMazePathWithJumps {

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();

       ArrayList<String> ans = getMazePaths(0, 0, n-1, m-1);
       System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
   public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> list = new ArrayList<>();
        // horizontal jumps
        for (int i = 1; i <= dc-sc; i++) {
            ArrayList<String> ans = getMazePaths(sr,sc+i,dr,dc);
            for(String ss : ans){
                list.add("h"+i+ss);
            }
        }

        // vertical jumps
        for (int i = 1; i <= dr-sr; i++) {
            ArrayList<String> ans = getMazePaths(sr+i,sc,dr,dc);
            for(String ss : ans){
                list.add("v"+i+ss);
            }
        }
        // diagonal jumps
        for (int i = 1; i <= dc-sc && i<= dr-sr; i++) {
            ArrayList<String> ans = getMazePaths(sr+i,sc+i,dr,dc);
            for(String ss : ans){
                list.add("d"+i+ss);
            }
        }
        return list;
    }

}
