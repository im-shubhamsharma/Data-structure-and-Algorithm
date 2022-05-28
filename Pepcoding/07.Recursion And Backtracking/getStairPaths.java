import java.util.*;

public class getStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> gsp = getStairPaths(n);
        System.out.println(gsp);
    }

    public static ArrayList<String> getStairPaths(int n) {
        // 0 Steps - Base Case
        if (n==0){
          ArrayList<String> base = new ArrayList<String>();
          base.add("");
          return base;              
        }

        ArrayList<String> myPath = new ArrayList<String>();    
        // 1 steps
        if (n>=1){
          ArrayList<String> path1step = getStairPaths(n-1);
          for(String step : path1step){
              myPath.add('1'+step);
          } 
        }

        // 2 steps
        if (n>=2){
          ArrayList<String> path2step = getStairPaths(n-2);
          for(String step : path2step){
              myPath.add('2'+step);
          } 
        }

        // 3 steps
        if (n>=3){
          ArrayList<String> path3step = getStairPaths(n-3);
          for(String step : path3step){
              myPath.add('3'+step);
          } 
        }

        return myPath;
    }

}
