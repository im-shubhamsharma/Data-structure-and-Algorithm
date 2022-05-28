import java.util.*;

public class getMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        ArrayList<String> gmp = getMazePaths(0,0,rows-1,col-1);
        System.out.println(gmp);   
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr>dr || sc>dc){
            ArrayList<String> invalid = new ArrayList<String>();
            return invalid;
        }

        if(sr==dr && sc==dc){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        ArrayList<String> hpath = getMazePaths(sr, sc+1, dr, dc);
        ArrayList<String> vpath = getMazePaths(sr+1, sc, dr, dc);
        
        ArrayList<String> path = new ArrayList<String>();

        for(String step : hpath){
            path.add('h'+step);
        }

        for(String step : vpath){
            path.add('v'+step);
        }

        return path;
    }

}
